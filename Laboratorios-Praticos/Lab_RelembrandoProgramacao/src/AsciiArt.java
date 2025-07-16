import java.util.Scanner;

public class AsciiArt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        scanner.close();

        char asterisco = '*';
        char espaco = ' ';

        for (int i = numero; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(asterisco);
            }
            for (int j = 0; j < 2 * (numero - i); j++) {
                System.out.print(espaco);
            }
            for (int j = 0; j < i; j++) {
                System.out.print(asterisco);
            }
            System.out.println();
        }
    }
}
