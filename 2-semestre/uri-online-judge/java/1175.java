import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException { 
        Scanner entrada = new Scanner(System.in);
        
        int[] array = new int[20];

        for (int i = 19; i >= 0; i--) {
            array[i] = entrada.nextInt();
        }

        for (int j = 0; j < 20; j++) {
            System.out.printf("N[%d] = %d\n", j, array[j]);
        }
    }
}
