import java.util.Scanner;

class zero_maior {
  public static void main(String[] args) {
    
Scanner teclado = new Scanner(System.in);
int n, maior = -999;

System.out.print("Digite um numero ");
n = teclado.nextInt();

while(n != 0){
    if(n > maior){
    maior = n;
    System.out.print("Digite um numero ");
    n = teclado.nextInt();
  
}
}
    
System.out.print("\nO maior numero é " + maior);

teclado.close();
    
}
}