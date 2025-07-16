package br.edu.ufam.icomp.lab_excecoes;

public class RoverMain {
    public static void main(String[] args) { 
        Caminho caminho = new Caminho(10);
        
        try {
            caminho.addCoordenada(new Coordenada(10, 20, 0));  
            caminho.addCoordenada(new Coordenada(15, 25, 0));  
            caminho.addCoordenada(new Coordenada(25, 30, 5));  
            caminho.addCoordenada(new Coordenada(30, 35, 5));  
          
            for (int i = 0; i < 10; i++) {
                caminho.addCoordenada(new Coordenada(30+i, 35+i, (30+i+35+i)%10));
            }
          
            System.out.println(caminho.toString());
            
        } catch (RoverException e) {
            System.err.println("Erro no rover: " + e.getMessage());
            caminho.reset();  
            System.out.println("Caminho foi resetado devido ao erro. Rover permanece parado.");
        } catch (Exception e) {
            System.err.println("Erro inesperado: " + e.getMessage());
            caminho.reset();
        }
    }
}