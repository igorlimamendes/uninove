import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);

        int n = entrada.nextInt(), x[] = new int[n];
        int m = 0, p = 0;

        for (int i = 0; i < n; i++) {
            x[i] = entrada.nextInt();
        }

        m = x[0];

        for (int i = 0; i < n; i++) {
            if (x[i] < m) {
                m = x[i];
                p = i;
            }
        }

        System.out.printf("Menor valor: %d\nPosicao: %d\n", m, p);
    }
}
