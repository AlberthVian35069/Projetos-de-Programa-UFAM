import java.util.Scanner;

public class Xadrez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < numero; i++) { 
            if (i % 2 != 0) { 
                System.out.print(" "); 
            }
            for (int j = 0; j < numero; j++) { 
                System.out.print("* ");
            }
            System.out.println(); 
        }
    }
}

