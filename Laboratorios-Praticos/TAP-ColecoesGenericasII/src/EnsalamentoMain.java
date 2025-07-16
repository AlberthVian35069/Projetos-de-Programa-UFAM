public class EnsalamentoMain {
    public static void main(String[] args) {

        Ensalamento ensalamento = new Ensalamento();
        
        Sala sala101 = new Sala(6, 101, 50, true);
        Sala sala102 = new Sala(6, 102, 100, true);
        Sala sala203 = new Sala(6, 203, 50, false);
        Sala sala204 = new Sala(6, 204, 100, false);
        
        ensalamento.addSala(sala101);
        ensalamento.addSala(sala102);
        ensalamento.addSala(sala203);
        ensalamento.addSala(sala204);
        
        Turma algoritmos = new Turma("Algoritmos e Estrutura de Dados I", "Edleno Silva", 60, false);
        algoritmos.addHorario(1);  
        algoritmos.addHorario(15); 
        algoritmos.addHorario(29); 
        
        Turma tecnicas = new Turma("Técnicas de Programação", "Horácio Fernandes", 50, false);
        tecnicas.addHorario(9);  
        tecnicas.addHorario(23);
        tecnicas.addHorario(30);
        
        Turma labProgramacao = new Turma("Laboratório de Programação C", "Edson Nascimento", 25, true);
        labProgramacao.addHorario(1); 
        labProgramacao.addHorario(15); 
        labProgramacao.addHorario(29); 
        
        Turma redes = new Turma("Redes de Computadores", "Edjair Souza", 70, true);
        redes.addHorario(2);  
        redes.addHorario(16); 
        
        ensalamento.addTurma(algoritmos);
        ensalamento.addTurma(tecnicas);
        ensalamento.addTurma(labProgramacao);
        ensalamento.addTurma(redes);

        ensalamento.alocarTodas();
        
        System.out.println("=== Relatório Resumo ===");
        System.out.println(ensalamento.relatorioResumoEnsalamento());
        
        System.out.println("\n=== Relatório Turmas por Sala ===");
        System.out.println(ensalamento.relatorioTurmasPorSala());
        
        System.out.println("\n=== Relatório Salas por Turma ===");
        System.out.println(ensalamento.relatorioSalasPorTurma());
    }
}