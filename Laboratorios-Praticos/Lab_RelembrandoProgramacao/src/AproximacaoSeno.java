import java.util.Scanner;

public class AproximacaoSeno {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double angulo = scanner.nextDouble();
        int k = scanner.nextInt(); 

        double rad = Math.toRadians(angulo);
        double resultado = 0;

        for (int i = 0; i < k; i++) {
            int expoente = 2 * i + 1;
            double termo = Math.pow(rad, expoente) / fatorial(expoente);
           
            if (i % 2 == 0) {
                resultado += termo;
            } else {
                resultado -= termo;
            }

            System.out.printf("%.10f\n", resultado);
        }

        scanner.close();
    }

    public static double fatorial(int n) {
        double fat = 1.0;
        for (int i = 2; i <= n; i++) {
            fat *= i;
        }
        return fat;
    }
}
