import java.util.Scanner;

class tabuada {
  public static void main(String[] args) {

Scanner teclado = new Scanner(System.in);
int n, m;

System.out.print("Digite um numero ");
n = teclado.nextInt();

for(int i = 1; i <= 10; i++){
    m = n * i;
      
    System.out.print(n + " * " + i + " = " + m + "\n");
}
teclado.close();
}
}