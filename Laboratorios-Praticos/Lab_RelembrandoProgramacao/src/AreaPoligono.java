import java.util.Scanner;

public class AreaPoligono {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] x = new double[100];
        double[] y = new double[100];
        int nx = 0, ny = 0;

        String entrada = scanner.nextLine();
        String[] valores = entrada.trim().split("\\s+");

        int i = 0;


        while (i < valores.length && !valores[i].equals("-1")) {
            x[nx++] = Double.parseDouble(valores[i]);
            i++;
        }

        i++; 
        while (i < valores.length && !valores[i].equals("-1")) {
            y[ny++] = Double.parseDouble(valores[i]);
            i++;
        }

        if (nx != ny) {
            return;
        }

        double soma = 0.0;
        for (int j = 0; j < nx - 1; j++) {
            soma += (x[j] + x[j + 1]) * (y[j + 1] - y[j]);
        }

        double area = Math.abs(soma / 2.0);
        System.out.printf("%.4f\n", area);
    }
}
