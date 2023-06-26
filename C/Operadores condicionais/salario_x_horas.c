#include <stdio.h>

int main() {

float c, n =0, e = 0, salario;

  printf("Digite o codigo: ");
  scanf("%f", &c);
  printf("Digite o numero de horas trabalhadas: ");
  scanf("%f", &n);

  if(n > 50){

  e = (n - 50) * 20;
  salario = 500 + e;

    printf("\nSeu salario total é de R$ %.2f reais.", salario);
    printf("\n\nHouve R$ %.2f reais em horas excedentes.", e);
    
  }else{
salario = n * 10;
  printf("Seu salario é de R$ %.2f\n", salario);
    printf("Nao houve horas excedentes");
    
  }
  

  
}