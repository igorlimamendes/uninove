import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        for (int i = 1; i <= 9; i += 2) {
            int j = 7;
            System.out.printf("I=%d J=%d\n", i, j);
            j--;
            System.out.printf("I=%d J=%d\n", i, j);
            j--;
            System.out.printf("I=%d J=%d\n", i, j);
        }
    }
}
