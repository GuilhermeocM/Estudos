import java.util.Scanner;

class maior100 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int n;

    System.out.print("Digite um numero ");
    n = teclado.nextInt();

    if ( n > 100){
      System.out.print(n);

      
    }else{
      System.out.print("0");
    }
  }
}