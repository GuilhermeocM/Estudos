#include <stdio.h>
#include <string.h>

int main() {

  char nome [100], senha[100];

    printf("Digite seu nome: ");
    gets(nome);
    printf("Digite a senha: ");
    gets(senha);

  while(!strcmp (nome, senha)){
    printf("\nNome e senha devem ser difeentes\n\n");
    printf("Digite seu nome: ");
    gets(nome);
    printf("Digite a senha: ");
    gets(senha);
    
  }
  
  
}