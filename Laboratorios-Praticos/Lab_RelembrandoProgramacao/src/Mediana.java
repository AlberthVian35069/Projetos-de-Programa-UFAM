import java.util.Scanner;

public class Mediana {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double numero = scanner.nextDouble();
		double [] vetor = new double [100];
		int cont = 0;
		int ind = 0;
		while(numero != - 1) {
			vetor[ind] = numero;
			ind++;
			cont++;
			numero = scanner.nextInt();	
		}
		for(int i = 1; i < cont; i++) {
			double chave = vetor[i];
			int j = i - 1;
			
			while(j >= 0 && vetor[j] > chave) {
				vetor[j + 1] = vetor[j];
				j--;
			}
			vetor [j + 1] =  chave;
		}		

		if(cont % 2 == 0) {
			int aux = cont / 2;
			int aux2 = aux ;
			double saida = (vetor[aux - 1] + vetor[aux2]) / 2;
			System.out.printf("%.2f", saida);
		}else {
			int aux = cont / 2;
			System.out.printf("%.2f", vetor[aux]);
		}
	}
}
