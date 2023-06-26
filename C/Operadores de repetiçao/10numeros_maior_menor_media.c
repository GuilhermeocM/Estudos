#include <stdio.h>

int main() {

  int valor, maior = -999, menor = 999, soma = 0;
  float media;
  
for(int i = 0; i < 10; i++){
  printf("Informe um valor inteiro e positivo: ");
  scanf("%d", &valor);
    
  if(valor > 0){
    if(valor > maior){
      maior = valor;
    }
    if(valor < menor){
      menor = valor;
    }
    
    
}else{
    i--;
}
  soma = soma + valor;

}
  
    media = soma / 10;
  
   printf("O maior numero é %d\n", maior);
  printf("O menor numero é %d\n", menor);
  printf("A media de todos os numeros é %0.2f", media);

  }