#include <stdio.h>
 
int main() {
    int n, i;
    
    scanf("%d", &n);
    
    int valores[n];
    int in = 0;
    int out = 0;
    
    for (i = 0; i < n; i++) {
        scanf("%d", &valores[i]);
        
        if (valores[i] >= 10 && valores[i] <= 20) in++;
        else out++;
    }
    
    printf("%d in\n", in);
    printf("%d out\n", out);
    
    return 0;
}
