import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);

        int m, n;

        do {
            m = entrada.nextInt();
            n = entrada.nextInt();
            int soma = 0;

            if (m <= 0 || n <= 0) break;

            if (m < n) {
                for (int i = m; i <= n; i++) {
                    System.out.printf("%d ", i);
                    soma += i;
                }
            } else {
                for (int i = n; i <= m; i++) {
                    System.out.printf("%d ", i);
                    soma += i;
                }
            }

            System.out.printf("Sum=%d\n", soma);
        } while (m > 0 && n > 0);
    }
}
