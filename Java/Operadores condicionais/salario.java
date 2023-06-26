import java.util.Scanner;

class salario {
  public static void main(String[] args) {

Scanner teclado = new Scanner(System.in);
float c, n, e, s, se, st;

System.out.print("Qual seu codigo? ");
c = teclado.nextFloat();

System.out.print("Quantas horas voce trabalhou? ");
n = teclado.nextFloat();

s = n * 10;

if(n > 50){
    e = n - 50;
    se = e * 20;
    s = s - e * 10;
    st = s + se;

    System.out.print("\nSeu salario total é de R$: " + st);
    System.out.print("\nHouve um excedente de R$: " + se);
}
else{
    System.out.print("\nSeu salario total é de R$:" + s);
}

teclado.close(); 
}
}