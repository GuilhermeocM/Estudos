import java.util.Scanner;

class imc {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    float altura, peso_ideal;

    System.out.print("Qual sua altura? ");
    altura = teclado.nextFloat();

    peso_ideal = (float) (altura * 72.7) - 58;

    System.out.print("\n Seu peso ideal é " + peso_ideal);

    teclado.close();
    
  }
}