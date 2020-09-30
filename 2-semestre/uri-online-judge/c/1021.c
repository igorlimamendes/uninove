#include <stdio.h>
#include <math.h>

int main() {
    double valor, valorMoedas, v100, v50, v20, v10, v5, v2, v1, v050, v025, v010, v005, v001;

    scanf("%lf", &valor);
    valorMoedas = modf(valor, &valor) * 100;
    v100 = (int)valor / 100;
    v50 = ((int)valor % 100) / 50;
    v20 = (((int)valor % 100) % 50) / 20;
    v10 = ((((int)valor % 100) % 50) % 20) / 10;
    v5 = (((((int)valor % 100) % 50) % 20) % 10) / 5;
    v2 = ((((((int)valor % 100) % 50) % 20) % 10) % 5) / 2;
    v1 = ((((((int)valor % 100) % 50) % 20) % 10) % 5) % 2;
    v050 = (int)valorMoedas / 50;
    v025 = ((int)valorMoedas % 50) / 25;
    v010 = (((int)valorMoedas % 50) % 25) / 10;
    v005 = ((((int)valorMoedas % 50) % 25) % 10) / 5;
    v001 = ((((int)valorMoedas % 50) % 25) % 10) % 5;
    
    printf("NOTAS:\n");
    printf("%.0lf nota(s) de R$ 100.00\n", v100);
    printf("%.0lf nota(s) de R$ 50.00\n", v50);
    printf("%.0lf nota(s) de R$ 20.00\n", v20);
    printf("%.0lf nota(s) de R$ 10.00\n", v10);
    printf("%.0lf nota(s) de R$ 5.00\n", v5);
    printf("%.0lf nota(s) de R$ 2.00\n", v2);
    printf("MOEDAS:\n");
    printf("%.0lf moeda(s) de R$ 1.00\n", v1);
    printf("%.0lf moeda(s) de R$ 0.50\n", v050);
    printf("%.0lf moeda(s) de R$ 0.25\n", v025);
    printf("%.0lf moeda(s) de R$ 0.10\n", v010);
    printf("%.0lf moeda(s) de R$ 0.05\n", v005);
    printf("%.0lf moeda(s) de R$ 0.01\n", v001);
 
    return 0;
}
