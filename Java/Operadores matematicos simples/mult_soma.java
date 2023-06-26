import java.util.Scanner;

  class mult_soma {
  public static void main(String[] args) {
    int num1, num2, soma, resultado;
    Scanner teclado = new Scanner(System.in);

    System.out.print(" Digite um numero ");
num1 = teclado.nextInt();
System.out.print(" Digite um numero ");
num2 = teclado.nextInt();

  soma = num1 + num2;
    
    resultado = num1 * soma;
    
System.out.printf("\n O resultado da operaçao é %d", resultado);

    teclado.close();
     
  }
}