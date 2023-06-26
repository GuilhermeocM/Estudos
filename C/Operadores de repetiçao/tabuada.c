#include <stdio.h>

int main() {

int n, t;

  printf("Informe um numero para a tabuada ");
  scanf("%d", &n);
 
  for(int i = 1; i <= 10; i++){
    t = n * i;
    printf("%d x %d = %d\n", n, i, t);
    
  }
  
  
}