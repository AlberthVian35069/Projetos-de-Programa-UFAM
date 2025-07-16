import java.util.Scanner;

public class Palindromos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String linha = scanner.nextLine();

        String textoLimpo = linha.replace(" ", "").toUpperCase();

        boolean ehPalindromo = true;
        int n = textoLimpo.length();
        for (int i = 0; i < n / 2; i++) {
            if (textoLimpo.charAt(i) != textoLimpo.charAt(n - 1 - i)) {
                ehPalindromo = false;
                break;
            }
        }

        System.out.println(textoLimpo + " " + (ehPalindromo ? 1 : 0));
    }
}
