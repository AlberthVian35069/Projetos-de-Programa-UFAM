import java.util.Scanner;

public class CifraCesar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String entrada = scan.nextLine();

        int primeiroEspaco = entrada.indexOf(' ');
        int desloc = Integer.parseInt(entrada.substring(0, primeiroEspaco));
        String mensagem = entrada.substring(primeiroEspaco + 1);

        String resultado = "";

        for (int i = 0; i < mensagem.length(); i++) {
            char c = mensagem.charAt(i);

            if (c >= 'a' && c <= 'z') {
                char cifrado = (char) (((c - 'a' + desloc) % 26) + 'A');
                resultado += cifrado;
            } else if (c >= 'A' && c <= 'Z') {
                char cifrado = (char) (((c - 'A' + desloc) % 26) + 'A');
                resultado += cifrado;
            } else {
                resultado += c;
            }
        }

        System.out.println(resultado);
    }
}
