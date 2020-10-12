#include <stdio.h>
 
int main() {
    int valores[5];
    int i, total;
    
    for (i = 0; i < 5; i++) {
        scanf("%d", &valores[i]);
        
        if (valores[i] % 2 == 0) total++;
    }
    
    printf("%d valores pares\n", total);
    
    return 0;
}
