package apresentarnome;
import java.util.Scanner;

public class ApresentarNome {
    public ApresentarNome() {
    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.printf("Informe seu nome: ");
        String nome = entrada.nextLine();
        System.out.printf("Informe o número limite: ");
        int numLimite = entrada.nextInt();
        
        for (int i = 1; i <= numLimite; i++) {
            System.out.println(nome);
        }
    }
}
