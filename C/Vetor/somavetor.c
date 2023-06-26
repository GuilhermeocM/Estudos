#include <stdio.h>

int main() {

  int vetor[20], soma = 0;

  for(int i = 0; i < 20; i++){
    printf(" Digite um valor %d/20 ",i+1);
    scanf("%d", &vetor[i]);
    soma = soma + vetor[i];
    
  }
  printf("\nA soma é %d", soma);
    
}