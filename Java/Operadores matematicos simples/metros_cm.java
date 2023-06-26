import java.util.Scanner;

class metros_cm {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int metros, centimetros;

    System.out.print("Digite o valor em metros ");
    metros = teclado.nextInt();

    centimetros = metros * 100;

   System.out.print(centimetros);

    teclado.close();
    
  }
}