import java.util.Scanner;

public class AproximacaoPi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); 
        double pi = 3.0;           

        System.out.printf("%.6f\n", pi);

        for (int i = 0; i < N - 1; i++) {
            int a = 2 * (i + 1); 
            double termo = 4.0 / (a * (a + 1) * (a + 2));

            if (i % 2 == 0) {
                pi += termo;
            } else {
                pi -= termo;
            }

            System.out.printf("%.6f\n", pi);
        }
    }
}
