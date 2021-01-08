import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] valores = new int[5];
        int total = 0;

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < valores.length; i++) {
          valores[i] = entrada.nextInt();

          if (valores[i] % 2 == 0) total++;
        }

        System.out.printf("%d valores pares\n", total);
    }
}
