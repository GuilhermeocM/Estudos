#include <stdio.h>

void degraus();
int main(void) {
  degraus(15);

}


void degraus(int n){
  if(n < 0 || n > 20){
    printf("So é aceito números de gregraus entre 1 a 20!");
    return;
  }
for(int i = 0; i < n; i++){
  for(int e = 0; e < 20 - i; e++){
    printf(" ");}
  for(int c = 0; c < 1 + i; c++){
    printf("#");
}
printf("\n");
}
}