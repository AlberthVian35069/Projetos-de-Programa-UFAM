import java.util.Scanner;

class DataExtenso {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		String data = scanner.nextLine();
		
		String isola = data.substring(0,2);
		int dia = Integer.parseInt(isola);
		
		String isola2 = data.substring(2,4);
		int mes = Integer.parseInt(isola2);
		
		String isola3 = data.substring(4,8);
		int ano = Integer.parseInt(isola3);
		
		String[] meses = {
				"janeiro", "Fevereiro", "Março", "Abril", 
				"Maio", "Junho","Julho", "Agosto", "Setembro", 
				"Outubro", "Novembro", "Dezembro"};
		
		System.out.println(dia + " de " + meses[mes - 1] + " de " + ano);	
	}
}


