import java.util.Scanner;

class estoque_medio {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
  float quant_minima, quant_maxima, estoque_medio;

    System.out.print("Informe a quantidade minima ");
    quant_minima = teclado.nextFloat();

    System.out.print("Informe a quantidade maxima ");
    quant_maxima = teclado.nextFloat();

    estoque_medio = (quant_maxima + quant_minima) / 2;

    System.out.print("O estoque medio é " + estoque_medio);

    teclado.close();
    

    
  }
}