import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        int n, x, y;
        double z = 0;
        
        Scanner entrada = new Scanner(System.in);

        n = entrada.nextInt();

        for (int i = 0; i < n; i++) {
            x = entrada.nextInt();
            y = entrada.nextInt();
            z = (double)x / (double)y;
            
            if (y == 0) System.out.printf("divisao impossivel\n");
            else System.out.printf("%.1f\n", z);
        }
    }
}
