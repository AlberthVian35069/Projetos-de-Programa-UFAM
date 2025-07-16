import java.util.Scanner;
public class Desconto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double valor = scanner.nextDouble();
		if(valor >= 200) {
			double preco = valor - (valor * (0.05));
			System.out.printf("%.2f\n", preco);
		}else {
			System.out.printf("%.2f\n", valor);
		}
	}

}
