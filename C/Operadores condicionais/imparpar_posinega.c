#include <stdio.h>

int main() {

int n;

  printf("Digite um numero: ");
  scanf("%d", &n);

  if (n %2 ==0 && n > 0){

printf("\nO numero %d é par e positivo", n);
        
  }else{

   if (n %2 ==0 && n < 0){

     printf("\nO numero %d é par e negativo", n);
     
   }else{
     if (n > 0){

       printf("\nO numero %d é impar e positivo", n);
       
     }else{
       printf("\nO numero %d é impar e negativo", n);
       
     }
   }  
  }
}