import java.util.Scanner;

class cod_vetor {
  public static void main(String[] args) {
    
Scanner teclado = new Scanner(System.in);
int vetor[] = new int[5];
int cod;

System.out.print("Digite o codigo ");
cod = teclado.nextInt();

if(cod != 0 && cod < 3){
    for(int i = 0; i < 5; i++){
    System.out.printf("Digite o numero %d/5 ", i + 1);
    vetor[i] = teclado.nextInt();
}
}
    
if(cod == 1){
    for(int i = 0; i < 5; i++){
    System.out.println(vetor[i]);
  }
  }
    
  if(cod == 2){   
      for(int i = 4; i >= 0; i--){
      System.out.println(vetor[i]);
}
}
} 
}