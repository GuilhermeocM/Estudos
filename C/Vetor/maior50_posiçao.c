#include <stdio.h>

int main() {

  int vetor[10], verificacao = 0;

  for(int i = 0; i < 10; i++){
    printf("Digite um valor %d/10 ",i+1);
    scanf("%d", &vetor[i]);
    
    }
  
  for(int i = 0; i < 10; i++){
    if(vetor[i] > 50){
    printf("%d está na posiçao %d\n", vetor[i], i + 1);
      verificacao = 1;
  }
    
    }
  if(verificacao == 0){
    printf("Nao tem numeros maiores que 50");
  }
  }
  
