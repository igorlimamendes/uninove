#include <stdio.h>

int main() {
    float n1, n2, n3, n4, nExame, media;
    
    scanf("%f", &n1);
    scanf("%f", &n2);
    scanf("%f", &n3);
    scanf("%f", &n4);
    
    media = (n1 * 2 + n2 * 3 + n3 * 4 + n4 * 1) / 10;
    
    if (media >= 7.0) {
        printf("Media: %.1f\n", media);
        printf("Aluno aprovado.\n");
    } else if (media >= 5.0 && media <= 6.9) {
        scanf("%f", &nExame);
        
        printf("Media: %.1f\n", media);
        printf("Aluno em exame.\n");
        printf("Nota do exame: %.1f\n", nExame);
        
        media = (media + nExame) / 2;
        
        if (media >= 5.0) {
            printf("Aluno aprovado.\n");
        } else {
            printf("Aluno reprovado.\n");
        }
        
        printf("Media final: %.1f\n", media);
    } else {
        printf("Media: %.1f\n", media);
        printf("Aluno reprovado.\n");
    }
    
    return 0;
}
