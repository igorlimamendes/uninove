import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        double a, b, c, r1, r2, delta;
        
        Scanner entrada = new Scanner(System.in);
        
        a = entrada.nextDouble();
        b = entrada.nextDouble();
        c = entrada.nextDouble();
        
        delta = (b * b) - (4 * a * c);
        r1 = (-b + Math.sqrt(delta)) / (2 * a);
        r2 = (-b - Math.sqrt(delta)) / (2 * a);
        
        if (delta < 0 || 2 * a == 0) {
            System.out.printf("Impossivel calcular\n");
        } else {
            System.out.printf("R1 = %.5f\n", r1);
            System.out.printf("R2 = %.5f\n", r2);
        }
    }
}
