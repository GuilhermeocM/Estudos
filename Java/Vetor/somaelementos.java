import java.util.Scanner;

class somaelementos {
  public static void main(String[] args) {
    
Scanner teclado = new Scanner(System.in);
int soma = 0;
int vetor[] = new int[20];

for(int i = 0; i < 20; i++){
    System.out.printf("Digite o numero %d/20 ", i + 1);
    vetor[i] = teclado.nextInt();
    soma = soma + vetor[i];
}

for(int i = 0; i < 20; i++){
    System.out.println(vetor[i]);
}

System.out.printf("\nA soma dos elementos é: %d", soma);
    
teclado.close();
}
}