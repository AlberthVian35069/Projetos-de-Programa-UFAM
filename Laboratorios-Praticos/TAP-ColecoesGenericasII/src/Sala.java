public class Sala {
	int bloco;
	int sala;
	int capacidade;
	boolean acessivel;
	
	
	Sala(){
		this(0, 0, 0, false);
	}
	
	public Sala(int bloco, int sala, int capacidade, boolean acessivel) {
		this.bloco = bloco;
		this.sala = sala;
		this.capacidade = capacidade;
		this.acessivel = acessivel;
	}
	
	String getDescricao() {
		return String.format("Bloco %d, Sala %d (%d lugares, %s)", 
                bloco, sala, capacidade, acessivel ? "acessível" : "não acessível");
	}
}