#include <stdio.h>
 
int main() {
    double x, n[100];
    int i;

    scanf("%lf", &x);

    n[0] = x;

    printf("N[%d] = %.4f\n", 0, n[0]);

    for (i = 1; i < 100; i++) {
        x /= 2;
        n[i] = x;

        printf("N[%d] = %.4f\n", i, n[i]);
    }

    return 0;
}
