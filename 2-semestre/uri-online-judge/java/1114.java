import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        int senha;
        
        Scanner entrada = new Scanner(System.in);
        
        do {
            senha = entrada.nextInt();

            System.out.printf(senha != 2002 ? "Senha Invalida\n" : "Acesso Permitido\n");
        } while (senha != 2002);
    }
}
