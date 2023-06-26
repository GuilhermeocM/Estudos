import java.util.Scanner;

class posit_negat {
  public static void main(String[] args) {

Scanner teclado = new Scanner(System.in);

int a, b, c;

System.out.print("Digite um numero ");
c = teclado.nextInt();

if (c > 0){
    a = c;
    System.out.print(c + " é positivo ");         
}
    
if (c < 0){
b = c;
System.out.print(c + " é negativo ");
      
}
teclado.close();
}
}