#include <stdio.h>
 
int main() {
    int valores[5];
    int i;
    int valorPar = 0;
    int valorImp = 0;
    int valorPos = 0;
    int valorNeg = 0;
    
    for (i = 0; i < 5; i++) {
        scanf("%d", &valores[i]);
        
        if (valores[i] % 2 == 0) valorPar++;
        if (valores[i] % 2 != 0) valorImp++;
        if (valores[i] > 0) valorPos++;
        if (valores[i] < 0) valorNeg++;
    }
    
    printf("%d valor(es) par(es)\n", valorPar);
    printf("%d valor(es) impar(es)\n", valorImp);
    printf("%d valor(es) positivo(s)\n", valorPos);
    printf("%d valor(es) negativo(s)\n", valorNeg);
    
    return 0;
}
