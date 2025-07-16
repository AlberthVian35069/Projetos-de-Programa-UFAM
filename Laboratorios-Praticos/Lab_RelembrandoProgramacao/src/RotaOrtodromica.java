import java.util.Scanner;
public class RotaOrtodromica {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double t1graus = scanner.nextDouble();
		double g1graus = scanner.nextDouble();
		double t2graus = scanner.nextDouble();
		double g2graus = scanner.nextDouble();
		
		double t1rad = Math.toRadians(t1graus);
		double g1rad = Math.toRadians(g1graus);
		double t2rad = Math.toRadians(t2graus);
		double g2rad = Math.toRadians(g2graus);
		
		double d = 6371.00 * (Math.acos(Math.sin(t1rad) * Math.sin(t2rad) + 
				(Math.cos(t1rad) * Math.cos(t2rad) * Math.cos(g1rad - g2rad))));
		
		System.out.printf("A distancia entre os pontos (%.6f, %.6f) e (%.6f, %.6f) e de %.2f km\n", t1graus, g1graus, t2graus, g2graus, d);
	}

}
