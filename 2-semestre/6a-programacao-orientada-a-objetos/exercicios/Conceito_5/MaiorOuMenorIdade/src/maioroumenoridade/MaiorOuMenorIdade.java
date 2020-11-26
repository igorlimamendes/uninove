package maioroumenoridade;
import java.util.Scanner;

public class MaiorOuMenorIdade {
    public MaiorOuMenorIdade() {
    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int idade = entrada.nextInt();
        
        System.out.println(idade >= 18 ? "Maior de idade" : "Menor de idade");
    }
}
