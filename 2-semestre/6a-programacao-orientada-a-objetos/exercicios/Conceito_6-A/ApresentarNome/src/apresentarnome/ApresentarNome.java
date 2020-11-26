package apresentarnome;
import java.util.Scanner;

public class ApresentarNome {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.printf("Informe seu nome: ");
        String nome = entrada.nextLine();
        System.out.printf("Informe o número limite: ");
        int limite = entrada.nextInt();
        
        int i = 0;
        
        while (i < limite) {
            System.out.println(nome);
            
            i++;
        }
    }
}
