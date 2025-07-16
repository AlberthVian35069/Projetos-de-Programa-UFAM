package br.edu.icomp.ufam.lab_heranca;

public class FormasMain {
    public static void main(String[] args) {
        FormaGeometrica[] formas = new FormaGeometrica[4];

        formas[0] = new Circulo(10, 20, 5.0);
        formas[1] = new Retangulo(30, 40, 8.0, 6.0);
        formas[2] = new Quadrado(50, 60, 7.0);
        formas[3] = new Circulo(70, 80, 3.5);
        
        for (FormaGeometrica forma : formas) {
            System.out.println(forma);
        }
    }
}