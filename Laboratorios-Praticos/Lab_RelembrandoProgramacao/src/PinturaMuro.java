import java.util.Scanner;
public class PinturaMuro {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double material = 100;
		double area = 12 * 3;
		
		double custo = scanner.nextDouble();
		Double preco = (custo * area) + material;
		System.out.printf("%.1f\n", preco);
	}

}
