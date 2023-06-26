#include <stdio.h>

int main() {

  int metros;
  float centimetros;

printf("Digite o valor em metros: ");
  scanf("%d", &metros);

  centimetros = metros * 100;

  printf("\nO valor em centimetros é: %.0f", centimetros);
    
}