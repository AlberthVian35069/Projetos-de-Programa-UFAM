public class Processador {
	String marca;
	String modelo;
	double velocidade;
	int numNucleos;
	
	public Processador(){
        this("Desconhecida", "Desconhecido", 0.0 , 0);
    }
	
	Processador(String marca, String modelo, double velocidade, int numNucleos){
		this.marca = marca;
		this.modelo = modelo;
		this.velocidade = velocidade;
		this.numNucleos = numNucleos;
	}
	
	double getVelocidadeParalela() {
		return velocidade * numNucleos;
	}
	
	String getDescricao(){
        return String.format("Processador: marca=%s, modelo=%s, velocidade=%.1fGHz, numNucleos=%d, velocidadeParalela=%.1fGHz.", marca, modelo, velocidade, numNucleos, getVelocidadeParalela());
    }
}
