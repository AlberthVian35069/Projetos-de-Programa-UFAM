import java.util.Scanner;

public class CaixaEletronico{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int saque = scanner.nextInt();
        scanner.close();
        if(saque < 0 || saque%2 != 0 ){
            System.out.print("Valor Invalido");
        }else{
            int cinquenta = saque/50;
            int temp50 = cinquenta * 50;
            int dez = (saque - temp50)/10;
            int temp10 = dez * 10;
            int dois = (saque - (temp50 + temp10))/2;
            System.out.println(cinquenta + " notas de R$50, " + dez + 
            " notas de R$10 e " + dois + " notas de R$2");
        }
    }
}