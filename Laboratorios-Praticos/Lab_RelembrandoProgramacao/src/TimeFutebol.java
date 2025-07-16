import java.util.Scanner;
public class TimeFutebol {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int []time1 = new int[100];
		int []time2 = new int[100];
		
		int i = 0;
		int cont1 = 0;
		int cont2 = 0;
		int vitorias = 0;
		int empates = 0;
		int derrotas = 0;
		
		int numero = scanner.nextInt();
		while(numero != - 1) {
			time1[i] = numero;		
			i++;
			cont1++;
			numero = scanner.nextInt();
		}
		i = 0;
		numero = scanner.nextInt();
		while(numero != - 1) {
			time2[i] = numero;
			i++;
			cont2++;
			numero = scanner.nextInt();
		}
		
		for(int k = 0; k < cont1; k++) {
			if(time1[k] > time2[k]) {
				vitorias++;
			}else if(time1[k] == time2[k]) {
				empates++;
			}else {
				derrotas++;
			}
		}
		System.out.print(vitorias);
		System.out.print(" ");
		System.out.print(empates);
		System.out.print(" ");
		System.out.print(derrotas);
	}

}
