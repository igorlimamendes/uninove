#include <stdio.h>

int main() {
    double a, b, c, perimetro, trapezio;
    
    scanf("%lf", &a);
    scanf("%lf", &b);
    scanf("%lf", &c);
    
    if ((a < b + c) && (b < a + c) && (c < a + b)) {
        perimetro = a + b + c;
        
        printf("Perimetro = %.1lf\n", perimetro);
    } else {
        trapezio = ((a + b) * c) / 2;
        
        printf("Area = %.1lf\n", trapezio);
    }
    
    return 0;
}
