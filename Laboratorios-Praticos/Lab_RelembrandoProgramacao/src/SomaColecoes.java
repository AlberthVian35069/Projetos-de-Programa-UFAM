import java.util.Scanner;

public class SomaColecoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int soma = 0;

        while (true) {
            numero = scanner.nextInt();

            if (numero == -1) {
                int proximo = scanner.nextInt();

                if (proximo == -1) {
                    System.out.println(soma);
                    break;
                } else {
                    System.out.println(soma);
                    soma = 0;
                    soma += proximo;
                }
            } else {
                soma += numero;
            }
        }

        scanner.close();
    }
}
