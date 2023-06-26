#include <stdio.h>

int main() {

  int numero, p, i;
  
  printf("Digite um numero: ");
  scanf("%d", &numero);
  
  if(numero % 2 == 0){
    p = numero;
    printf("\nO numero %d é par.", numero);
    
  }else{
    i = numero;
    printf("\nO numero %d é impar.", numero);
 
  }
  
  
}