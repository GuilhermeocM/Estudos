import java.util.Scanner;

class soma {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int num1, num2, soma;

    System.out.print("Digite o primeiro numero ");
    num1 = teclado.nextInt();

    System.out.print("Digite o segundo numero ");
    num2 = teclado.nextInt();
  
   soma = num1 + num2;

    System.out.print(soma);

    teclado.close();
    
  
  }
}