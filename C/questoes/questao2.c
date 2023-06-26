#include <stdio.h>

int main(void) {
long long vetor[60], n2 = 0, n3 = 1, ni, num, c = 0;
vetor[0] = 0;
vetor[1] = 1;

printf("Digite um número ");
scanf("%lli", &num);

for(int i = 2; i < 60; i++){
    vetor[i] = n2 + n3;
    ni = n2 + n3;
    n2 = n3;
    n3 = ni;
}

for(int i = 0; i < 60; i++){
    while(vetor[i] == num){
    printf("O número %lli está na posição %d da tabela de Fibonacci.", num, i);
    c = 1;
    return 0;
    
}
}
if(c == 0){
    printf("Este número não faz parte da tabela de Fibonacci.");
}
}

