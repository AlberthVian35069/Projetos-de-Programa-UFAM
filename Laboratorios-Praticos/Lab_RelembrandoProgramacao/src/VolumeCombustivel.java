import java.util.Scanner;

public class VolumeCombustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double H = scanner.nextDouble(); 
        double h = scanner.nextDouble(); 
        double r = scanner.nextDouble();
        double pi = Math.PI;

        if (H <= 0 || h < 0 || h > H || r <= 0 || H < 2 * r) {
            System.out.println("-1.000");
            return;
        }

        double volume = 0.0;

        if (h <= r) {
            volume = (pi / 3.0) * Math.pow(h, 2) * (3 * r - h);
        } else if (h <= H - r) {
            double calotaInf = (pi / 3.0) * Math.pow(r, 2) * (3 * r - r);
            double alturaCilindro = h - r;
            double cilindro = pi * Math.pow(r, 2) * alturaCilindro;
            volume = calotaInf + cilindro;
        } else {
            double calotaInf = (pi / 3.0) * Math.pow(r, 2) * (3 * r - r);
            double cilindro = pi * Math.pow(r, 2) * (H - 2 * r);
            double x = h - (H - r); 
            double calotaSup = (pi / 3.0) * Math.pow(x, 2) * (3 * r - x);
            volume = calotaInf + cilindro + calotaSup;
        }

        System.out.printf("%.3f\n", volume);
    }
}
