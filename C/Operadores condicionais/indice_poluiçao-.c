#include <stdio.h>

int main() {

float i;

  printf("Informe o indice de poluiçao: ");
  scanf("%f", &i);

  if(i >= 0.3 && i < 0.4){

    printf("\nO gurpo 1 deve suspender as atividades.");

      }else{

    if (i >= 0.4 && i < 0.5){

      printf("\nOs grupos 1 e 2 devem suspender suas atividades.");
      
    }else{
      if(i >= 0.5){
printf("\nOs grupos 1, 2 e 3 devem suspender suas atividades.");
        
      }else{

      return 0;
        
   }
  }
 }
}