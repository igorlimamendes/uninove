import java.io.IOException;
import java.util.Scanner;

public class Main { 
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);

        int n = entrada.nextInt();
        int quad = 1;
        int cubo = 1;

        for (int i = 1; i <= n; i++) {
            quad = i*i;
            cubo = i*i*i;
            System.out.printf("%d %d %d\n", i, quad, cubo);
            quad++;
            cubo++;
            System.out.printf("%d %d %d\n", i, quad, cubo);
        }
    }
}
