import java.util.Scanner;

public class PorcentagemAcerto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] respostas = new int[100];
        int[] gabarito = new int[100];
        int tamanho = 0;

        int entrada = scanner.nextInt();
        while (entrada != -1) {
            respostas[tamanho] = entrada;
            tamanho++;
            entrada = scanner.nextInt();
        }

        for (int i = 0; i < tamanho; i++) {
            gabarito[i] = scanner.nextInt();
        }

        int acertos = 0;
        for (int i = 0; i < tamanho; i++) {
            if (respostas[i] == gabarito[i]) {
                acertos++;
            }
        }

        double porcentagem = (acertos * 100.0) / tamanho;
        System.out.printf("%.2f\n", porcentagem);

        scanner.close();
    }
}
