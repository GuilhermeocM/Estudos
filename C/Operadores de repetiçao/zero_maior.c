#include <stdio.h>

int main() {

int n, m = 0;

  printf("Digite um numero ");
  scanf("%d", &n);
  
  while (n != 0){
    if(n > m){
      m = n;
    }

  printf("Digite um numero ");
  scanf("%d", &n);
      
      
  }

  printf("\nO numero maior é %d", m);
  
    
  
}