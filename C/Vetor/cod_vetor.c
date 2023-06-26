#include <stdio.h>

int main() {

  int cod;
  float vetor[5];

  printf("Digite o codigo ");
  scanf("%d", &cod);

  if(cod == 0){
    return 0;
  }
  if(cod == 1){
    for(int i = 0; i < 5; i++){
      printf("Digite um numero para o vetor ");
      scanf("%f", &vetor[i]);
    }
    for(int i = 0; i < 5; i++){
      printf("%0.0f\n", vetor[i]);
    }
  }if(cod == 2){
    for(int i = 0; i < 5; i++){
      printf("Digite um numero para o vetor ");
      scanf("%f", &vetor[i]);
    
  }for(int i = 4; i >= 0; i--){
      printf("%0.0f\n", vetor[i]);
  
}
    }
  if(cod != 1){
    if(cod != 2){
      if(cod != 0){
    printf("Digite um codigo valido");
  }
    }
  }
  }