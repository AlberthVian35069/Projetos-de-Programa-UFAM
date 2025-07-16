import java.util.Scanner;
public class AreaTriangulo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextInt();
		double b = scanner.nextInt();
		double c = scanner.nextInt();
		
		double s =  (a + b + c)/2;
		
		double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		if(a + b  > c && b + c  > a && a + c > b){
			System.out.printf("%.2f",area);
		}else {
			System.out.println("Triangulo invalido");
		}
		
		
	}

}
