#include <stdio.h>
#include <ctype.h>

int main() {

float altura, peso_ideal;
char sexo;
  
  printf("Infome seu sexo, com m para masculino e f para feminino: ");
  scanf("%c", &sexo);

  if(tolower(sexo) != 'm' && tolower(sexo) != 'f'){
    printf("Sexo invalido");
    return 0;
  }
  
  printf("\nQual sua altura? ");
  scanf("%f", &altura);
  
  if(tolower(sexo) == 'm'){
    
    peso_ideal = 72.7 * altura - 58;
    
    printf("\nSeu peso ideal é: %.2f", peso_ideal);
    
    }
  if(tolower(sexo) == 'f'){
    
    peso_ideal = 62.1 * altura - 44.7;
    printf("\nSeu peso ideal é: %.2f", peso_ideal);
    }
  
}