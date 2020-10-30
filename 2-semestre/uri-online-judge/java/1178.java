import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);

        double x = entrada.nextDouble();
        double[] n = new double[100];

        n[0] = x;

        System.out.printf("N[%d] = %.4f\n", 0, n[0]);

        for (int i = 1; i <= 99; i++) {
            x /= 2;
            n[i] = x;

            System.out.printf("N[%d] = %.4f\n", i, n[i]);
        }
    }
}
