import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        int km, min;
        
        Scanner entrada = new Scanner(System.in);
        
        km = entrada.nextInt();
        
        min = km * 2;
        
        System.out.printf("%d minutos\n", min);
    }
}
