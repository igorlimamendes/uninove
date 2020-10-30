import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);

        int t = entrada.nextInt(), c = 0;
        int[] array = new int[1000];

        for (int i = 0; i < 1000; i++) {
            array[i] = c;
            c++;

            if (array[i] == t-1) c = 0;

            System.out.printf("N[%d] = %d\n", i, array[i]);
        }
    }
}
