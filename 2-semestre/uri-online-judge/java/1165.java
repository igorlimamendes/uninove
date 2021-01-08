import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);

        int n = entrada.nextInt();
        int x, c;

        for (int i = 0; i < n; i++) {
            x = entrada.nextInt();

            c = 0;

            for (int j = 1; j <= x; j++) {
                if (x % j == 0) c++;
            }

            if (c == 2) System.out.printf("%d eh primo\n", x);
            else System.out.printf("%d nao eh primo\n", x);
        }
    }
}
