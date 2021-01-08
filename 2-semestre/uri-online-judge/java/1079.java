import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        
        int n = entrada.nextInt();
        double val1, val2, val3;
        double media = 0;
        
        for (int i = 0; i < n; i++) {
            val1 = entrada.nextDouble();
            val2 = entrada.nextDouble();
            val3 = entrada.nextDouble();
            
            media = (val1 * 2 + val2 * 3 + val3 * 5) / 10;
            
            System.out.printf("%.1f\n", media);
        }
    }
}
