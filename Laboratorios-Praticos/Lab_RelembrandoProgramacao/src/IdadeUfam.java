import java.util.Scanner;
public class IdadeUfam {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int anolido = scanner.nextInt();
		int ano = anolido - 1909 ;
		
		System.out.println("A UFAM tem " + ano + " anos de fundacao");
	}

}
