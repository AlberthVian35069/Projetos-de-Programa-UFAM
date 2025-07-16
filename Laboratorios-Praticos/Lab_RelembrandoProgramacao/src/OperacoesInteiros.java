import java.util.Scanner;

public class OperacoesInteiros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int numero = scanner.nextInt();

            if (numero == -1) {
                if (scanner.hasNextInt()) {
                    int proximo = scanner.nextInt();
                    if (proximo == -1) {
                        break; 
                    } else {
                        numero = proximo; 
                    }
                } else {
                    break;
                }
            }

            double cont = 0;
            int qtdpar = 0;
            int qtdimpar = 0;
            int soma = 0;
            int maior = numero;
            int menor = numero;

            while (numero != -1) {
                if (numero % 2 == 0) {
                    qtdpar++;
                } else {
                    qtdimpar++;
                }

                if (numero > maior) {
                    maior = numero;
                }
                if (numero < menor) {
                    menor = numero;
                }

                soma += numero;
                cont++;

                if (scanner.hasNextInt()) {
                    numero = scanner.nextInt();
                } else {
                    break; 
                }
            }

 
            System.out.println((int) cont);
            System.out.println(qtdpar);
            System.out.println(qtdimpar);
            System.out.println(soma);
            double media = soma / cont;
            System.out.printf("%.2f%n", media);
            System.out.println(maior);
            System.out.println(menor);
        }

    }
}
