#include <stdio.h>
 
int main() {
    int n, i;
    double val1 = 0;
    double val2 = 0;
    double val3 = 0;
    double media = 0;
    
    scanf("%d", &n);
    
    for (i = 0; i < n; i++) {
        scanf("%lf", &val1);
        scanf("%lf", &val2);
        scanf("%lf", &val3);
        
        media = (val1 * 2 + val2 * 3 + val3 * 5) / 10;
        
        printf("%.1lf\n", media);
    }
    
    return 0;
}
