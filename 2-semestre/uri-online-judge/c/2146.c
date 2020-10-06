#include <stdio.h>

int main() {
    int senha, novaSenha;
    
    while (scanf("%d", &senha) != EOF) {
        novaSenha = senha - 1;
        
        printf("%d\n", novaSenha);
    }
    
    return 0;
}
