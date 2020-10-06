import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        int valor;
        
        Scanner entrada = new Scanner(System.in);
        
        valor = entrada.nextInt();
        
        for (int i = 0; i < valor; i++) {
            if (i == valor - 1) {
                System.out.printf("Ho!\n");
                break;
            }
            
            System.out.printf("Ho ");
        }
    }
}
