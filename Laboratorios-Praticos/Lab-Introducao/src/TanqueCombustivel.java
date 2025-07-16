import java.util.Scanner;

public class TanqueCombustivel {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double r = scanner.nextDouble();
		double x = scanner.nextDouble();
		int opcao = scanner.nextInt();
		
		double raio = ((4.0/3) * Math.PI * Math.pow(r,3));
		double calota = ((Math.PI / 3) * Math.pow(x,2) * (3 * r - x));
		
		double v_ar = calota;
		double v_combustivel = raio - calota;
		
		if (opcao == 1) {
			System.out.printf("%.4f\n", v_ar);
		}else {
			System.out.printf("%.4f\n", v_combustivel);
		}
	}

}
