#include <stdio.h>

int main() {

float p, e = 0, m = 0;

  printf("Informe o peso dos peixes: ");
  scanf("%f", &p);

if (p > 50){

e = p - 50;
  m = e * 4;

  printf("\nHouve excesso de peso de %.2f quilos, o que acarretou em multa de R$ %.2f reais", e, m);
  
}else{
  printf("\nNao houve excesso.");
  
}
  
  
}