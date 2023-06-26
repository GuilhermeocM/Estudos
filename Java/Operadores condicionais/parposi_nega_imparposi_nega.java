import java.util.Scanner;

class parposi_nega_imparposi_nega {
  public static void main(String[] args) {
  
Scanner teclado = new Scanner(System.in);
int n;

System.out.print("Digite um numero ");
n = teclado.nextInt();

if(n % 2 == 0 && n > 0){
    System.out.print("\n" + n + " é par e positivo");
}

if(n % 2 == 0 && n < 0){
    System.out.print("\n" + n + " é par e negativo");
}
    
if(n % 2 != 0 && n > 0){
    System.out.print("\n" + n + " é impar e positivo");
}
    
if(n % 2 != 0 && n < 0){
    System.out.print("\n" + n + " é impar e negativo");
}

teclado.close();
  
}
}