import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        double s = 1, aux = 2;

        for (int i = 3; i <= 39; i += 2) {
            s += i / aux;
            aux *= 2;
        }

        System.out.printf("%.2f\n", s);
    }
}
