import java.util.Scanner;

public class MediaColecao {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double numero = scanner.nextDouble();
		double soma = numero + 1;
		double cont = 0;
		
		while(numero != - 1) {
		    numero = scanner.nextDouble();
			cont++;
			soma += numero;
		}
		double media = soma/cont;
		System.out.printf("%.2f", media);
	}

}
