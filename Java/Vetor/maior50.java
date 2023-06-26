import java.util.Scanner;

class maior50 {
  public static void main(String[] args) {
    
Scanner teclado = new Scanner(System.in);
int vetor[] = new int[10];
int maior = 0;

for(int i = 0; i < 10;i++){
    System.out.printf("Digite o numero %d/10 ", i + 1);
    vetor[i] = teclado.nextInt();

}

for(int i = 0; i < 10;i++){
    if(vetor[i] > 50){
    maior = 1;
    System.out.printf("O numero %d esta na posiçao %d \n", vetor[i], i);
}
}

if(maior != 1){
    System.out.print("\nNao existem numeros maiores que 50");
}
teclado.close();
}
}
