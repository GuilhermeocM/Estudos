import java.util.Scanner;

class somavetores {
  public static void main(String[] args) {
    
Scanner teclado = new Scanner(System.in);
int[] vetor1 = new int[10];
int[] vetor2 = new int[10];
int[] vetor3 = new int[10];

for(int i = 0; i < 10; i++){
    System.out.printf("Digite o numero %d/10 do primeiro vetor ", i+1);
    vetor1[i] = teclado.nextInt();
}
  
System.out.print("\n");
    
for(int i = 0; i < 10; i++){    
    System.out.printf("Digite o numero %d/10 do segundo vetor ", i+1);
    vetor2[i] = teclado.nextInt();
}
    
System.out.print("\n");

for(int i = 0; i < 10; i++){
    vetor3[i] = vetor1[i] + vetor2[i];
}
    
System.out.println("A soma dos elementos do dois vetores é: ");
    
for(int i = 0; i < 10; i++){
    System.out.println(vetor3[i]);
   
}
teclado.close();
}
}