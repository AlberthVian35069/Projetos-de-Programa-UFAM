public class GoogleMain {
    public static void main(String[] args) {

        ListaInvertida listaInvertida = new ListaInvertida();
        
        listaInvertida.insere("java", "documento1.txt");
        listaInvertida.insere("programação", "documento1.txt");
        listaInvertida.insere("java", "documento2.txt");
        listaInvertida.insere("algoritmos", "documento3.txt");
        listaInvertida.insere("programação", "documento3.txt");
        listaInvertida.insere("java", "documento3.txt");
        
        boolean resultado = listaInvertida.insere("java", "documento1.txt");
        System.out.println("Tentativa de inserir documento duplicado: " + (resultado ? "sucesso" : "falha (esperado)"));
        
        System.out.println("\nDocumentos com a palavra 'java':");
        System.out.println(listaInvertida.busca("java"));
        
        System.out.println("\nDocumentos com a palavra 'programação':");
        System.out.println(listaInvertida.busca("programação"));
        
        System.out.println("\nDocumentos com a palavra 'algoritmos':");
        System.out.println(listaInvertida.busca("algoritmos"));
        
        System.out.println("\nDocumentos com a palavra 'inexistente':");
        System.out.println(listaInvertida.busca("inexistente"));
        
        System.out.println("\nLista Invertida completa:");
        System.out.println(listaInvertida.toString());
    }
}