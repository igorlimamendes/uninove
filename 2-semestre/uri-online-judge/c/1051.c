#include <stdio.h>
 
int main() {
    double valor, aux, imposto;
    
    scanf("%lf", &valor);
    
    if (valor > 0 && valor <= 2000) {
        printf("Isento\n");
    } else if (valor > 2000 && valor <= 3000) {
        aux = valor - 2000;
        imposto = aux * 0.08;
        
        printf("R$ %.2lf\n", imposto);
    } else if (valor > 3000 && valor <= 4500) {
        aux = valor - 3000;
        imposto = aux * 0.18 + 1000 * 0.08;
        
        printf("R$ %.2lf\n", imposto);
    } else {
        aux = valor - 4500;
        imposto = aux * 0.28 + 1500 * 0.18 + 1000 * 0.08;
        
        printf("R$ %.2lf\n", imposto);
    }
 
    return 0;
}
