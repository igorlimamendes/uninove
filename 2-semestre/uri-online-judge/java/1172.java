import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);

        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            array[i] = entrada.nextInt();

            if (array[i] <= 0) array[i] = 1;
        }

        for (int j = 0; j < 10; j++) {
            System.out.printf("X[%d] = %d\n", j, array[j]);
        }
    }
}
