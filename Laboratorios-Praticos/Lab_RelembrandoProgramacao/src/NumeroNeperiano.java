import java.util.Scanner;

public class NumeroNeperiano {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double soma = 0.0;

        for (int i = 0; i < n; i++) {
            soma += 1.0 / fatorial(i);
        }

        System.out.printf("%.6f",soma);
        scanner.close();
    }

    public static int fatorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * fatorial(n - 1);
    }
}
