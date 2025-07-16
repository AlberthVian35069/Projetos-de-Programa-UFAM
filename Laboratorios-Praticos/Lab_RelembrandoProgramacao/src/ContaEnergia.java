import java.util.Scanner;

public class ContaEnergia {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		double consumo = scanner.nextDouble();
		char tipo = scanner.next().charAt(0);
		double preco = 0.0;
		if (consumo < 0 || (tipo != 'R' && tipo != 'C' && tipo != 'I')){
			System.out.printf("%.2f", -1.0);
		}else {
			if(tipo == 'R') {
				if(consumo <= 500) {
					preco = consumo * 0.40;
					System.out.printf("%.2f", preco);
				}else{
					preco = consumo * 0.65;
					System.out.printf("%.2f", preco);
				}
			}else if(tipo == 'C') {
				if(consumo <= 1000) {
					preco = consumo * 0.55;
					System.out.printf("%.2f", preco);
				}else {
					preco = consumo * 0.60;
					System.out.printf("%.2f", preco);
				}
			}else {
				if(consumo <= 5000) {
					preco = consumo * 0.55;
					System.out.printf("%.2f", preco);
				}else {
					preco = consumo * 0.60;
					System.out.printf("%.2f", preco);
				}
			}
		}
	}
}
