#include <stdio.h>
#include <string.h>

int main(void) {

char palavra[50];

printf("Digite uma palavra ");
fgets(palavra, 50, stdin);

for(int i = strlen(palavra) - 2; i >= 0; i--){
    printf("%c", palavra[i]);
}
  
}