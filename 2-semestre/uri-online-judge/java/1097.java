import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int j = 3;
        
        for (int i = 1; i <= 9; i += 2) {
            j += 4;
            System.out.printf("I=%d J=%d\n", i, j);
            j--;
            System.out.printf("I=%d J=%d\n", i, j);
            j--;
            System.out.printf("I=%d J=%d\n", i, j);
        }
    }
}
