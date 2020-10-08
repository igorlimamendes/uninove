#include <stdio.h>
 
int main() {
    int n, i, seguinte;
    
    scanf("%d\n", &n);
    
    for (i = 0; i < n; i++) {
        scanf("%d\n", &seguinte);
        
        if (seguinte == 0) printf("NULL\n");
        else if (seguinte % 2 == 0 && seguinte > 0) printf("EVEN POSITIVE\n");
        else if (seguinte % 2 == 0 && seguinte < 0) printf("EVEN NEGATIVE\n");
        else if (seguinte % 2 != 0 && seguinte > 0) printf("ODD POSITIVE\n");
        else if (seguinte % 2 != 0 && seguinte < 0) printf("ODD NEGATIVE\n");
    }
 
    return 0;
}
