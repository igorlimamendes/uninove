#include <stdio.h>

int main() {
    int codigo, quantidade;
    double total;
    
    scanf("%d", &codigo);
    scanf("%d", &quantidade);
    
    if (codigo == 1) total = quantidade * 4.00;
    if (codigo == 2) total = quantidade * 4.50;
    if (codigo == 3) total = quantidade * 5.00;
    if (codigo == 4) total = quantidade * 2.00;
    if (codigo == 5) total = quantidade * 1.50;
    
    printf("Total: R$ %.2lf\n", total);
    
    return 0;
}
