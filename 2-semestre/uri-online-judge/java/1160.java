import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);

        int t = entrada.nextInt(), pa, pb, anos;
        double g1, g2;

        for (int i = 1; i <= t; i++) {
            anos = 0;

            pa = entrada.nextInt();
            pb = entrada.nextInt();
            g1 = entrada.nextDouble();
            g2 = entrada.nextDouble();

            while (pb >= pa) {
                pa += (pa * g1) / 100;
                pb += (pb * g2) / 100;
                anos++;

                if (anos > 100) break;
            }

            if (anos > 100) System.out.printf("Mais de 1 seculo.\n");
            else System.out.printf("%d anos.\n", anos);
        }
    }
}
