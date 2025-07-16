import java.util.Scanner;

public class SomaDigitos {
    public static int calcularSoma(int numero) {
        int soma = 0;
        while (numero > 0) {
            soma += numero % 10; 
            numero /= 10;
        }
        return soma;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        scanner.close();
        
        System.out.println(calcularSoma(numero));
    }
}
