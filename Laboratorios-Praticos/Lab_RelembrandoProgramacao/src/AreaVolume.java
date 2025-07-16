import java.util.Scanner;
public class AreaVolume {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double r = scanner.nextDouble();
		double area = Math.PI * Math.pow (r,2);
		double volume = (4.0/3) * Math.PI  * Math.pow (r,3);
		
		System.out.printf("Um circulo com raio de %.2f centimetros tem uma area de %.2f centimetros quadrados.\n", r, area);

		System.out.printf("Uma esfera com raio de %.2f centimetros tem um volume de %.2f centimetros cubicos.\n", r, volume);
	}

}
