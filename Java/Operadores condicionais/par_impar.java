import java.util.Scanner;

class par_impar {
  public static void main(String[] args) {
  
Scanner teclado = new Scanner (System.in);
int p, i, n;

System.out.print("Digite um numero ");
n = teclado.nextInt();
    
if( n % 2 == 0){
    p = n;

    System.out.print("\n" + p + " é par");
}else{
    i = n;
    System.out.print("\n" + i + " é impar " + i);   
}
    
teclado.close();
}
}