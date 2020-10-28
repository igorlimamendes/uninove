import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);

        boolean flag = false;
        int x, s;

        while (flag == false) {
            x = entrada.nextInt();

            s = 0;
            
            if (x != 0) {
                for (int i = 0; i < 5; i++) {
                    if (x % 2 == 0) s += x;
                    else s += x+1;

                    x += 2;
                }

                System.out.printf("%d\n", s);
            } else flag = true;
        }
    }
}
