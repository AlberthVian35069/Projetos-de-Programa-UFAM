import java.util.Scanner;
public class RaizQuadrada {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double numero = scanner.nextDouble();
		double raiz = Math.sqrt(numero);
		System.out.printf("%.4f", raiz);
	}

}
