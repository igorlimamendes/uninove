package vetor3;

public class Vetor3 {
    public static void main(String[] args) {
        double [] notas = new double [10];
        double media = 0;
        
        notas[0] = 4.5;
        notas[1] = 3.2;
        notas[2] = 5.4;
        notas[3] = 6.7;
        notas[4] = 7.8;
        notas[5] = 8.9;
        notas[6] = 6.2;
        notas[7] = 9.1;
        notas[8] = 3.4;
        notas[9] = 4.4;
        
        for (int i = 0; i < 10; i++) {
            System.out.printf("Vetor[%d] Nota: %.1f\n", i, notas[i]);
            media += notas[i];
        }
        
        media = media / 10;
        
        System.out.printf("Média: %.1f\n", media);
    }
}
