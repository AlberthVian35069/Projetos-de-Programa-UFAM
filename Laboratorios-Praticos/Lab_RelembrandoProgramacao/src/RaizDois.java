import java.util.Scanner;

public class RaizDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double fracao = 1.0;

        for (int i = 1; i <= n; i++) {
            fracao = 1.0 / (2.0 + fracao);
            double resultado = 1.0 + fracao;
            System.out.printf("%.14f\n", resultado);
        }
    }
}
