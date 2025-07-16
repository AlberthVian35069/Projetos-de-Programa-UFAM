import java.util.Scanner;

public class AprovacaoDisciplina {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[100];
        int[] presencas = new int[100];

        int i = 0;
        int cont1 = 0;

        int numAp = 0;
        int numRn = 0;
        int numRFr = 0;
        
        double nota = scanner.nextDouble();
        while (nota != -1) {
            if (i >= 100) break;
            notas[i] = nota;
            i++;    
            cont1++;
            nota = scanner.nextDouble(); 
        }

        i = 0;
        int presenca = scanner.nextInt();
        while (presenca != -1) {
            if (i >= 100) break; 
            presencas[i] = presenca;
            i++;
            presenca = scanner.nextInt(); 
        }

       
        int cargah = scanner.nextInt();
        
        for (int j = 0; j < cont1; j++) {
            boolean passouNota = notas[j] >= 5.0;
            boolean passouFreq = presencas[j] >= cargah * 0.75;

            if (passouNota && passouFreq) {
                numAp++;
            } else if (!passouFreq) {
                numRFr++;
            } else {
                numRn++;
            }
        }

        System.out.print(numAp + " " + numRn + " " + numRFr);
        scanner.close();
    }
}
