package cadastrodeclientesinfo;

import java.util.Scanner;

public class CadastroDeClientesInfo {
    public CadastroDeClientesInfo() {
    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.printf("Informe o seu nome: ");
        String nome = entrada.nextLine();
        System.out.printf("Informe sua data de nascimento (exemplo, 01.01.1901): ");
        String nasc = entrada.nextLine();
        System.out.printf("Informe o seu RG (ex, 12.345.678-9): ");
        String rg = entrada.nextLine();
        System.out.printf("Informe o seu CPF (ex, 123-456-789.10): ");
        String cpf = entrada.nextLine();
        System.out.printf("Informe o seu e-mail (ex, teste@teste.com): ");
        String email = entrada.nextLine();
        System.out.printf("Informe o seu endereço (ex, Rua Abc, 123): ");
        String endereco = entrada.nextLine();
        System.out.printf("Informe o seu telefone (ex, 40028922): ");
        int tel = entrada.nextInt();
        
        System.out.printf("%s\n%s\n%s\n%s\n%s\n%s\n%d\n", nome, nasc, rg, cpf, email, endereco, tel);
    }
}
