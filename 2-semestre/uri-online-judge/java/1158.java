import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);

        int n = entrada.nextInt();
        int x, y, s;

        for (int i = 0; i < n; i++) {
            x = entrada.nextInt();
            y = entrada.nextInt();
            s = 0;
            
            for (int j = 0; j < y; j++) {
                if (x % 2 != 0) s += x;
                else s += x+1;

                x += 2;
            }
            
            System.out.printf("%d\n", s);
        }
    }
}
