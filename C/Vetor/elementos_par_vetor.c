#include <stdio.h>

int main() {

  int vetor[5];

  for (int i = 0; i < 5; i++) {
    printf("Digite um valor %d/5: ", i+1);
    scanf("%d", &vetor[i]);
      }
  
  
  for (int i = 0; i < 5; i++){
    if (vetor[i] % 2 == 0){
    printf("%d\n", vetor[i]);
    }
    }
  }
