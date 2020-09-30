#include <stdio.h>
 
int main() {
    double a, b, c, trianguloRet, circRaio, trapezio, quadrado, retangulo;
    
    scanf("%lf", &a);
    scanf("%lf", &b);
    scanf("%lf", &c);
    trianguloRet = (a * c) / 2;
    circRaio = (3.14159 * c * c);
    trapezio = ((a + b) * c) / 2;
    quadrado = b * b;
    retangulo = a * b;
    
    printf("TRIANGULO: %.3lf\n", trianguloRet);
    printf("CIRCULO: %.3lf\n", circRaio);
    printf("TRAPEZIO: %.3lf\n", trapezio);
    printf("QUADRADO: %.3lf\n", quadrado);
    printf("RETANGULO: %.3lf\n", retangulo);
    
    return 0;
}
