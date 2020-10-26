#include <stdio.h>
 
int main() {
    int n, i, quad = 1, cubo = 1;

    scanf("%d", &n);

    for (i = 1; i <= n; i++) {
        quad = i*i;
        cubo = i*i*i;
        printf("%d %d %d\n", i, quad, cubo);
        quad++;
        cubo++;
        printf("%d %d %d\n", i, quad, cubo);
    }
 
    return 0;
}
