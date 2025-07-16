import java.util.Scanner;

public class DistanciaAviao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[][] matriz = {
            {  0,  2, 11,  6, 15, 11,  1 },
            {  2,  0,  7, 12,  4,  2, 15 },
            { 11,  7,  0, 11,  8,  3, 13 },
            {  6, 12, 11,  0, 10,  2,  1 },
            { 15,  4,  8, 10,  0,  5, 13 },
            { 11,  2,  3,  2,  5,  0, 14 },
            {  1, 15, 13,  1, 13, 14,  0 }
        };

        int aux = -1;
        int soma = 0;
        int valor = scan.nextInt();

        while (valor != -1) {
            
            int cidade = -1;
            if (valor == 111) cidade = 0;
            else if (valor == 222) cidade= 1;
            else if (valor == 333) cidade = 2;
            else if (valor == 444) cidade = 3;
            else if (valor == 555) cidade = 4;
            else if (valor == 666) cidade = 5;
            else if (valor == 777) cidade = 6;

            if (aux != -1) {
                soma += matriz[aux][cidade]; 
            }
            aux = cidade;
            valor = scan.nextInt();
        }

        System.out.println(soma);
        scan.close();
    }
}
