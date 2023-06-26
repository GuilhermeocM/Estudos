#include <stdio.h>

int main() {

float salario_hora, horas_trabalhadas, salario;

  printf("Qual seu salario por hora? ");
  scanf("%f", &salario_hora);
  
  printf("Quantas horas foram trabalhadas? ");
  scanf("%f", &horas_trabalhadas);
  
salario = horas_trabalhadas * salario_hora;

  printf("\nSeu salario é de R$ %.2f", salario);
  

  
}