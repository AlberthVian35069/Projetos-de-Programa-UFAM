import java.util.ArrayList;

public class Ensalamento {
    ArrayList<Sala> salas;
    ArrayList<Turma> turmas;
    ArrayList<TurmaEmSala> ensalamento;
    
    public Ensalamento() {
        this.salas = new ArrayList<>();
        this.turmas = new ArrayList<>();
        this.ensalamento = new ArrayList<>();
    }
    
    public void addSala(Sala sala) {
        salas.add(sala);
    }
    
    public void addTurma(Turma turma) {
        turmas.add(turma);
    }
    
    public Sala getSala(Turma turma) {
        for (TurmaEmSala alocacao : ensalamento) {
            if (alocacao.turma.equals(turma)) {
                return alocacao.sala;
            }
        }
        return null;
    }
    
    public boolean salaDisponivel(Sala sala, int horario) {
        for (TurmaEmSala alocacao : ensalamento) {
            if (alocacao.sala.equals(sala)) {
                for (int h : alocacao.turma.horarios) {
                    if (h == horario) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    public boolean salaDisponivel(Sala sala, ArrayList<Integer> horarios) {
        for (int horario : horarios) {
            if (!salaDisponivel(sala, horario)) {
                return false;
            }
        }
        return true;
    }
    
    public boolean alocar(Turma turma, Sala sala) {
        if (turma.acessivel && !sala.acessivel) return false;
        if (turma.numAlunos > sala.capacidade) return false;
        if (!salaDisponivel(sala, turma.horarios)) return false;
        
        ensalamento.add(new TurmaEmSala(turma, sala));
        return true;
    }
    
    public void alocarTodas() {
        for (Turma turma : turmas) {
            Sala melhorSala = null;
            int menorDiferenca = Integer.MAX_VALUE;
            
            for (Sala sala : salas) {
                int diferenca = sala.capacidade - turma.numAlunos;
                
                if (diferenca >= 0 && 
                    (!turma.acessivel || sala.acessivel) &&
                    salaDisponivel(sala, turma.horarios) &&
                    diferenca < menorDiferenca) {
                    
                    menorDiferenca = diferenca;
                    melhorSala = sala;
                }
            }
            
            if (melhorSala != null) {
                ensalamento.add(new TurmaEmSala(turma, melhorSala));
            }
        }
    }
    
    public int getTotalTurmasAlocadas() {
        return ensalamento.size();
    }
    
    public int getTotalEspacoLivre() {
        int total = 0;
        for (TurmaEmSala alocacao : ensalamento) {
            total += alocacao.sala.capacidade - alocacao.turma.numAlunos;
        }
        return total;
    }
    
    public String relatorioResumoEnsalamento() {
        return String.format(
            "Total de Salas: %d\n" +
            "Total de Turmas: %d\n" +
            "Turmas Alocadas: %d\n" +
            "Espaços Livres: %d",
            salas.size(), turmas.size(), getTotalTurmasAlocadas(), getTotalEspacoLivre()
        );
    }
    
    public String relatorioTurmasPorSala() {
        StringBuilder relatorio = new StringBuilder();
        relatorio.append(relatorioResumoEnsalamento());
        
        for (Sala sala : salas) {
            relatorio.append("\n--- ").append(sala.getDescricao()).append(" ---\n");
            boolean temTurma = false;
            
            for (TurmaEmSala alocacao : ensalamento) {
                if (alocacao.sala.equals(sala)) {
                    relatorio.append("\n").append(alocacao.turma.getDescricao()).append("\n");
                    temTurma = true;
                }
            }
            
            if (!temTurma) {
                relatorio.append("\n");
            }
        }
        
        return relatorio.toString();
    }
    
    public String relatorioSalasPorTurma() {
        StringBuilder relatorio = new StringBuilder();
        relatorio.append(relatorioResumoEnsalamento()).append("\n");
        
        for (Turma turma : turmas) {
            relatorio.append("\n").append(turma.getDescricao()).append("\n");
            Sala sala = getSala(turma);
            relatorio.append("Sala: ").append(sala != null ? sala.getDescricao() : "SEM SALA").append("\n");
        }
        
        return relatorio.toString();
    }
}