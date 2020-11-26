package vetor3;

public class Vetor3 {
    public static void main(String[] args) {
        double [] notas = new double [10];
        
        notas[0] = 1.1;
        notas[1] = 2.2;
        notas[2] = 3.3;
        notas[3] = 4.4;
        notas[4] = 5.5;
        notas[5] = 6.6;
        notas[6] = 7.7;
        notas[7] = 8.8;
        notas[8] = 9.9;
        notas[9] = 10.0;
        
        int i = 0;
        int media = 0;
        
        do {
            media += notas[i];
            
            i++;
        } while (i < 10);
        
        media = media / 10;
        
        i = 0;
        
        do {
            System.out.printf("Nota %d: %.1f\n", i+1, notas[i]);
            
            i++;
        } while (i < 10);
    }
}
