import java.util.ArrayList;

public class Turma {
    String nome;
    String professor;
    int numAlunos;
    boolean acessivel;
    ArrayList<Integer> horarios;

    public Turma() {
        this("", "", 0, false);
    }

    public Turma(String nome, String professor, int numAlunos, boolean acessivel) {
        this.nome = nome;
        this.professor = professor;
        this.numAlunos = numAlunos;
        this.acessivel = acessivel;
        this.horarios = new ArrayList<>();
    }

    public void addHorario(int horario) {
        horarios.add(horario);
    }

    public String getHorariosString() {
        StringBuilder i = new StringBuilder();
        String[] dias = {"segunda", "terça", "quarta", "quinta", "sexta"};
        
        for (int horario : horarios) {
            int diaIndex = (horario - 1) / 7;
            int hora = 8 + 2 * ((horario - 1) % 7);
            
            if (i.length() > 0) {
                i.append(", ");
            }
            i.append(dias[diaIndex]).append(" ").append(hora).append("hs");
        }
        
        return i.toString();
    }

    public String getDescricao() {
        return String.format(
            "Turma: %s\n" +
            "Professor: %s\n" +
            "Número de Alunos: %d\n" +
            "Horário: %s\n" +
            "Acessível: %s",
            nome, professor, numAlunos, getHorariosString(), 
            acessivel ? "sim" : "não"
        );
    }
}