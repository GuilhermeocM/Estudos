#include <stdio.h>

int main() {

  int vetor[10], vetor2[10], vetor3[10];

  for(int i = 0; i < 10; i++){
    printf("Primeiro vetor %d/10 ",i+1);
    scanf("%d", &vetor[i]);}

  for(int i = 0; i < 10; i++){
    printf("Segundo vetor %d/10 ",i+1);
    scanf("%d", &vetor2[i]);

    vetor3[i] = vetor[i] + vetor2[i];
     }
    printf("\nTerceiro vetor = vetor1 + vetor2\n");
  for(int i = 0; i < 10; i++){
    printf("%d\n", vetor3[i]);
  }  
  }