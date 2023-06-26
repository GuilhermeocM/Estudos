#include <stdio.h>

int main() {

int numero;

  printf("Digite um numero: ");
  scanf("%d", &numero);
  
  if(numero > 100) {
    printf("\n%d", numero);
  }else{
    
    printf("\n0");
    
  }

  
}