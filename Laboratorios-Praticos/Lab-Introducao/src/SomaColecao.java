import java.util.Scanner;

public class SomaColecao {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero = 0;
		int soma = 0;
		while(numero != -1) {
			numero = scanner.nextInt();
			if(numero != -1) {
				soma += numero;
			}
		}
		System.out.print(soma);
		scanner.close();
	} 

}
