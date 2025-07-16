package br.edu.icomp.ufam.lab_heranca;

public class Quadrado extends Retangulo {

    public Quadrado() {
        this(0, 0, 0);
    }

    public Quadrado(int posX, int posY, double lado) {
        super(posX, posY, lado, lado);
    }

    @Override
    public String toString() {
        return String.format("Quadrado na posição (%d, %d) com lado de %.1fcm (área=%.1fcm2, perímetro=%.1fcm)",
                           posX, posY, largura, getArea(), getPerimetro());
    }
}