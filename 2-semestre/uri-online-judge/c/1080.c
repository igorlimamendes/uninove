#include <stdio.h>
 
int main() {
    int i;
    int valores[100];
    int maior = 0;
    int posicao = 0;
    int aux = 0;
    
    for (i = 0; i < 100; i++) {
        scanf("%d", &valores[i]);
        
        if (valores[i] > aux) {
            maior = valores[i];
            posicao = i+1;
            aux = valores[i];
        }
    }
    
    printf("%d\n", maior);
    printf("%d\n", posicao);
 
    return 0;
}
