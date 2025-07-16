public class SessaoJediMain {
    public static void main(String[] args) {
        TreinadorJedi treinador1 = new TreinadorJedi("Grão-Mestre Fae Coven", "Tholothian");
        TreinadorJedi treinador2 = new TreinadorJedi("Mestre Yoda", "Desconhecida");
     
        SessaoJedi sessao1 = new SessaoJedi("Instruções de Uso da Força", treinador1);
        SessaoJedi sessao2 = new SessaoJedi("Treinamento Avançado", treinador2);
        
        sessao1.addIniciado(new IniciadoJedi("Katomi", "Tholothian", 23));
        sessao1.addIniciado(new IniciadoJedi("Byph", "Ithorian", 21));
        sessao1.addIniciado(new IniciadoJedi("Gungi", "Mookiee", 23));
        sessao1.addIniciado(new IniciadoJedi("Petro", "Human", 22));
        
        sessao1.addIniciado(new IniciadoJedi("Katomi", "Tholothian", 23));
        
        sessao2.addIniciado(new IniciadoJedi("Ahsoka", "Togruta", 36));
        sessao2.addIniciado(new IniciadoJedi("Ezra", "Human", 19));
        

        IniciadoJedi iniciado = sessao1.getIniciado("Byph");
        if (iniciado != null) {
            System.out.println("Encontrado: " + iniciado.getDescricao());
        } else {
            System.out.println("Iniciado não encontrado.");
        }
        
        System.out.println("\nMédia de ano de nascimento da sessão 1: " + 
                          sessao1.getMediaAnoNascimento());

        System.out.println("\n=== Descrição da Sessão 1 ===");
        System.out.println(sessao1.getDescricao());
        
        System.out.println("\n=== Descrição da Sessão 2 ===");
        System.out.println(sessao2.getDescricao());
    }
}