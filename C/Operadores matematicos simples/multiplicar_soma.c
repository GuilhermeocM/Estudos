#include <stdio.h>

int main() {
    
  int num1, num2, resultado, multiplicacao;
  
  printf("Digite o primeiro numero: ");
  scanf("%d", &num1);
  
  printf("Digite o segundo numero: ");
  scanf("%d", &num2);

  resultado = num1 + num2;
  multiplicacao = resultado * num1;

  printf("\nO resultado da multiplicaçao da soma dos numeros com primeiro número é = %d", multiplicacao);
  
}
