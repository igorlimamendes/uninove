package mediaaritmetica;

public class MediaAritmetica {
    public static void main(String[] args) {
        double [] notas = new double [10];
        
        notas[0] = 5.5;
        notas[1] = 3.4;
        notas[2] = 6.5;
        notas[3] = 4.1;
        notas[4] = 5.2;
        notas[5] = 8.9;
        notas[6] = 9.5;
        notas[7] = 10.0;
        notas[8] = 4.2;
        notas[9] = 1.1;
        
        int i = 0;
        int media = 0;
        
        while (i < 10) {
            media += notas[i];
            
            i++;
        }
        
        media = media / 10;
        
        i = 0;
        
        while (i < 10) {
            System.out.printf("Nota %d: %.1f\n", i+1, notas[i]);
            
            i++;
        }
        
        System.out.println("Média: " + media);
    }
}
