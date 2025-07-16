import java.util.Scanner;
import java.util.ArrayList;

public class OperacoesInteiros {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 ArrayList<Integer> lista = new ArrayList<>();

	        System.out.println("Digite os números (digite 'q' para sair):");
	        while (scanner.hasNextInt()) {
	            lista.add(scanner.nextInt());
	        }

	        System.out.println("Números lidos:");
	        for (int num : lista) {
	            System.out.print(num + " ");
	        }

	        scanner.close();
	}

}
