public class Computador {
	String fabricante;
	Processador processador;
	Memoria memoria;
	Disco disco;
	
	public Computador(String fabricante, Processador processador, Memoria memoria, Disco disco) {
		this.fabricante = fabricante;
		this.processador = processador;
		this.memoria = memoria;
		this.disco = disco;
	}
	
	String getDescricao() {
		return String.format("Computador da fabricante %s. %s %s %s", 
				fabricante, processador.getDescricao(), memoria.getDescricao(), disco.getDescricao());
	}
}
