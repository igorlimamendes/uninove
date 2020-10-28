import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);

        int x = entrada.nextInt();
        int z = x, s = 0, c = 0;
        boolean flag = false;

        while (z <= x) z = entrada.nextInt();

        while (flag == false) {
            s += x;
            x++;
            c++;

            if (s > z) flag = true;
        }

        System.out.printf("%d\n", c);
    }
}
