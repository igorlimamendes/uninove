import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        int senha, novaSenha;
        
        Scanner entrada = new Scanner(System.in);
    
        while (entrada.hasNext()) {
            senha = entrada.nextInt();
            novaSenha = senha - 1;
            
            System.out.printf("%d\n", novaSenha);
        }
    }
}
