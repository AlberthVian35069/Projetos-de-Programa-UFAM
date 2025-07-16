import java.util.*;

public class DiaSemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] totalHoras = new int[7]; 

        while (true) {
            int[] funcionario = new int[7];
            boolean terminou = false;
            for (int i = 0; i < 7; i++) {
                if (!sc.hasNextInt()) {
                    terminou = true;
                    break;
                }
                int valor = sc.nextInt();
                if (valor == -1) {
                    terminou = true;
                    break;
                }
                funcionario[i] = valor;
            }

            if (terminou) break;

            for (int i = 0; i < 7; i++) {
                totalHoras[i] += funcionario[i];
            }
        }

        int max = Arrays.stream(totalHoras).max().getAsInt();
        for (int i = 0; i < 7; i++) {
            if (totalHoras[i] == max) {
                System.out.println(i + 1); 
            }
        }
    }
}