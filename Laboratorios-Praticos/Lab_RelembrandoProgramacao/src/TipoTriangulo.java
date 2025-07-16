import java.util.Scanner;
public class TipoTriangulo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double md1 = scanner.nextDouble();
		double md2 = scanner.nextDouble();
		double md3 = scanner.nextDouble();
		
		if(md1 + md2  > md3 && md2 + md3  > md1 && md1 + md3 > md2){
			if(md1 == md2 && md2 == md3){
				System.out.println("equilatero");
			}else if(md1 == md2 || md2 == md3 || md3 == md1) {
				System.out.println("isosceles");		
			}else {
				System.out.println("escaleno");
			}
			scanner.close();
		}else {
			System.out.println("invalido");
		}
	}

}
