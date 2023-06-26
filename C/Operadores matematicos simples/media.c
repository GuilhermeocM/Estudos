#include <stdio.h>

int main() {

  float quant_minima, quant_max, estoque_medio;

  printf("Informe a quantidade minima: ");
  scanf("%f", &quant_minima);
  
  printf("Informe a quantidade maxima: ");
  scanf("%f", &quant_max);

  estoque_medio = (quant_max + quant_minima) / 2;

  printf("\nO estoque medio é de: %.2f", estoque_medio);
  
}