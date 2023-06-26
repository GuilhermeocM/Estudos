#include <stdio.h>

int main() {

int idade;

  printf("Informe sua idade: ");
  scanf("%d", &idade);

  if (idade >= 5 && idade <= 7){

printf("\nNadador infantil A");
        
  }else{

    if(idade >= 8 && idade <= 11){

      printf("\nNadador infantil B");
      
    }else{

      if(idade >= 12 && idade <= 13){

        printf("\nNadador juvenil A");
      }else{

        if(idade >= 14 && idade <= 17){

          printf("\nNadador juvenil B");
          
        }else{

          if(idade > 17){

            printf("\nNadador adulto");
          }else{

            printf("\nIdade abaixo do permitido.");
          }
        }
      }
    }
    
  }
  



  
  
}