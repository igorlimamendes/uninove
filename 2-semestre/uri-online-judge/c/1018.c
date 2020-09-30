#include <stdio.h>
 
int main() {
    int valor;
    double valor100, valor50, valor20, valor10, valor5, valor2, valor1;
    
    scanf("%d", &valor);
    valor100 = valor / 100;
    valor50 = (valor % 100) / 50;
    valor20 = ((valor % 100) % 50) / 20;
    valor10 = (((valor % 100) % 50) % 20) / 10;
    valor5 = ((((valor % 100) % 50) % 20) % 10) / 5;
    valor2 = (((((valor % 100) % 50) % 20) % 10) % 5) / 2;
    valor1 = (((((valor % 100) % 50) % 20) % 10) % 5) % 2;
    
    printf("%d\n", valor);
    printf("%.0lf nota(s) de R$ 100,00\n", valor100);
    printf("%.0lf nota(s) de R$ 50,00\n", valor50);
    printf("%.0lf nota(s) de R$ 20,00\n", valor20);
    printf("%.0lf nota(s) de R$ 10,00\n", valor10);
    printf("%.0lf nota(s) de R$ 5,00\n", valor5);
    printf("%.0lf nota(s) de R$ 2,00\n", valor2);
    printf("%.0lf nota(s) de R$ 1,00\n", valor1);
 
    return 0;
}
