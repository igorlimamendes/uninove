package maioroumenorque100;
import java.util.Scanner;

public class MaiorOuMenorQue100 {
    public MaiorOuMenorQue100() {
    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int n = entrada.nextInt();
        
        System.out.println(n <= 100 ? "Número abaixo ou igual a 100" : "Número acima de 100");
    }    
}
