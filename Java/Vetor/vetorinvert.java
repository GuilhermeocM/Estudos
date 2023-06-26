import java.util.Scanner;


class vetorinvert {
  public static void main(String[] args) {

Scanner teclado = new Scanner(System.in);
int vetor[] = new int[10];

for(int i = 0; i < 10; i++){
    System.out.print("Digite um numero ");
    vetor[i] = teclado.nextInt();
}
    
    for(int i = 9; i >= 0; i--){
      
    System.out.println(vetor[i]);
}
teclado.close();
}
}