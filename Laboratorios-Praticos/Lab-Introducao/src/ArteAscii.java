import java.util.Scanner;

public class ArteAscii{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        scanner.close();
        char asterisco = '*';
        for(int i = numero; i != 0; i--){
            for(int j=0; j<i; j++){
                System.out.print(asterisco);
            }
            System.out.println();
        }
        for(int l = 1; l <= numero; l++){
            for(int a = 0; a < l; a++){
                System.out.print(asterisco);
            }
            System.out.println();
        }
        
    }
}