import java.util.Scanner;
  
class salario {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    float ganho_hora, horas_trab, salario;
  
  System.out.print("Quanto voce ganha por hora? ");
    ganho_hora = teclado.nextFloat();

    System.out.print("Quantas horas voce trabalha por mes? ");
    horas_trab = teclado.nextFloat();

    salario = ganho_hora * horas_trab;

    System.out.printf("Seu salario é de R$:" + salario);

    teclado.close();
    
  }
  
}