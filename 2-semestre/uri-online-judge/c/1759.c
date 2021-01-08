#include <stdio.h>
 
int main() {
    int valor, i;
        
    scanf("%d", &valor);
    
    for (i = 0; i < valor; i++) {
        if (i == valor - 1) {
            printf("Ho!\n");
            break;
        }
        
        printf("Ho ");
    }
    
    return 0;
}
