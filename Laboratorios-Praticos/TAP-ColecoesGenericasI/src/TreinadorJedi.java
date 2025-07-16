public class TreinadorJedi {
	String titulacao;
	String nome;
	
	public TreinadorJedi(){
		
	}
	
	public TreinadorJedi(String titulacao, String nome){
		this.titulacao = titulacao;
		this.nome = nome;
	}
	
	String getDescricao(){
		return String.format ("%s %s", titulacao, nome);
	}
}
