#include <stdio.h>
 
int main() {
    int senha;
    
    do {
        scanf("%d\n", &senha);
        
        if (senha != 2002) printf("Senha Invalida\n");
        if (senha == 2002) printf("Acesso Permitido\n");
    } while (senha != 2002);
 
    return 0;
}
