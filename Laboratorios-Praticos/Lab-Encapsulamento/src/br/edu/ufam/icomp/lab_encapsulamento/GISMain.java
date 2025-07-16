package br.edu.ufam.icomp.lab_encapsulamento;

public class GISMain {
    public static void main(String[] args) {
        
        Localizavel[] vetorLocalizaveis = new Localizavel[4];
        
        vetorLocalizaveis[0] = new Celular(55, 11, 987654321);
        vetorLocalizaveis[1] = new CarroLuxuoso("ABC1234");
        vetorLocalizaveis[2] = new Celular(1, 92, 12345678);
        vetorLocalizaveis[3] = new CarroLuxuoso("XYZ9876");
        
        for (int i = 0; i < vetorLocalizaveis.length; i++) {
            System.out.println("Objeto " + (i+1) + ": " + vetorLocalizaveis[i].getPosicao());
            System.out.println("Erro de localização: " + vetorLocalizaveis[i].getErroLocalizacao());
            System.out.println(); 
        }
    }
}