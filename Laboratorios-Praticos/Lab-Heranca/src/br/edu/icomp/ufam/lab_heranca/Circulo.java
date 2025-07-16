package br.edu.icomp.ufam.lab_heranca;

public class Circulo extends FormaGeometrica {
    public double raio;

    public Circulo() {
    }

    public Circulo(int posX, int posY, double raio) {
        super(posX, posY);
        this.raio = raio;
    }

    public double getArea() {
        return Math.PI * raio * raio;
    }

    public double getPerimetro() {
        return 2 * Math.PI * raio;
    }
    
    @Override
	public String toString() {
		String descricao1 = String.format("Círculo na posição (%d, %d) com raio de %.1fcm ", posX, posY, raio);
		String descricao2 = "(área="+getArea()+"cm2, perímetro="+getPerimetro()+"cm)";
		return descricao1 + descricao2;
	}
}