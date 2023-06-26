#include <stdio.h>

int main(void) {
  
int n;
  
  do{
    printf("Digite o numero de degraus(1a8): ");
scanf("%d", &n);
  }
while(n < 1 || n > 8);
  
for(int i = 0; i < n; i++){
    for(int a = 0; a < 8 - i; a++){
    printf(" ");
      }
  for(int c = 0; c < 1 + i; c++){
    printf("#");
    }
printf("\n");
}
 }
