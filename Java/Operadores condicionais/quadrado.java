import java.util.Scanner;

class quadrado {
  public static void main(String[] args) {
 
Scanner teclado = new Scanner(System.in);
int num1, num2, num3, num4, pot1, pot2, pot3, pot4;

System.out.print("Digite o primeiro numero ");
num1 = teclado.nextInt();

System.out.print("Digite o segundo numero  ");
num2 = teclado.nextInt();

System.out.print("Digite o terceiro numero ");
num3 = teclado.nextInt();

System.out.print("Digite o quarto numero   ");
num4 = teclado.nextInt();

pot1 = num1 * num1;
pot2 = num2 * num2;
pot3 = num3 * num3;
pot4 = num4 * num4;

if(pot3 >= 1000){
    System.out.print(pot3);     
}
else{
    System.out.println("\nO quadrado do primeiro numero é: " + pot1);
    System.out.println("O quadrado do segundo numero é:  " + pot2);
    System.out.println("O quadrado do terceiro numero é: " + pot3);
    System.out.println("O quadrado do quarto numero é:  " + pot4);
   
}  
}
}