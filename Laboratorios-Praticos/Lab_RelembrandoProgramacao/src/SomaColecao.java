import java.util.Scanner;

public class SomaColecao {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero = scanner.nextInt();
		int soma = numero + 1;
		while(numero != -1) {
			numero = scanner.nextInt();
			soma += numero;
		}
		
		System.out.println(soma);
	}

}
