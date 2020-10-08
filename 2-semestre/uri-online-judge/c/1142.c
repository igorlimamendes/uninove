#include <stdio.h>
 
int main() {
    int n, x, i;
    
    scanf("%d\n", &n);
    
    x = 1;
    
    for (i = 0; i < n; i++) {
        printf("%d %d %d PUM\n", x, x+1, x+2);

        x += 4;
    }
 
    return 0;
}
