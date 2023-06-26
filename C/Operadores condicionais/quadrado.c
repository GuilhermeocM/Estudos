#include <stdio.h>

int main() {

  int n1, n2, n3, n4;

  printf("Digite um numero ");
  scanf("%d", &n1);

  printf("Digite um numero ");
  scanf("%d", &n2);
  

  printf("Digite um numero ");
  scanf("%d", &n3);

  printf("Digite um numero ");
  scanf("%d", &n4);

  n1 = n1 * n1;
  n2 = n2 * n2;
  n3 = n3 * n3;
  n4 = n4 * n4;

  if(n3 >= 1000){

    printf("O quadrado do numero 3 é %d", n3);
    
  }else{
    
    printf("O quadrado do numero 1 é %d\n", n1);
    printf("O quadrado do numero 2 é %d\n", n2);
    printf("O quadrado do numero 3 é %d\n", n3);
    printf("O quadrado do numero 4 é %d\n", n4);
    
  }
  


  
}