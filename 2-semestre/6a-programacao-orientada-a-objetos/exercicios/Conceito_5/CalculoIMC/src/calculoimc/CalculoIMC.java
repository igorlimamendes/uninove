package calculoimc;
import java.util.Scanner;

public class CalculoIMC {
    public CalculoIMC() {
    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.printf("Informe seu peso (ex: 77,7): ");
        float peso = entrada.nextFloat();
        System.out.printf("Informe sua altura (ex: 1,70): ");
        float altura = entrada.nextFloat();
        
        float imc = (float) (peso / (Math.pow(altura, 2)));
        
        System.out.printf("IMC: %.2f\n", imc);
        
        if (imc < 18.5) System.out.println("Abaixo do peso");
        else if (imc >= 18.5 && imc <= 24.9) System.out.println("Peso normal");
        else if (imc >= 25 && imc <= 29.9) System.out.println("Sobrepeso");
        else if (imc >= 30 && imc <= 34.9) System.out.println("Obesidade grau 1");
        else if (imc >= 35 && imc <= 39.9) System.out.println("Obesidade grau 2");
        else System.out.println("Obesidade grau 3");
    }
}
