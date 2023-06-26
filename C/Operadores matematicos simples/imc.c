#include <stdio.h>

int main(void) {

float altura, peso_ideal;

  printf("Qual sua altura? ");
  scanf("%f", &altura);

  peso_ideal = 72.7 * altura - 58;

  printf("\nSeu peso ideal é de %.2f quilos", peso_ideal);
  
  
}
