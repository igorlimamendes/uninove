import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException { 
        Scanner entrada = new Scanner(System.in);
        
        int[] array = new int[10];
        int n = entrada.nextInt();

        array[0] = n;

        for (int i = 1; i < 10; i++) {
            array[i] = array[i-1] * 2;
        }

        for (int j = 0; j < 10; j++) {
            System.out.printf("N[%d] = %d\n", j, array[j]);
        }
    }
}
