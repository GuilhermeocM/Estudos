import java.util.Scanner;

class idade_nataçao {
  public static void main(String[] args) {
   
Scanner teclado = new Scanner(System.in);
int i;

System.out.print("Qual sua idade? ");
i = teclado.nextInt();

if(i < 5){
    System.out.print("A idade minima é de 5 anos.");
}

if(i >= 5 && i < 8){
    System.out.print("Nadador da categoria infantil A.");
}
    
if(i >= 8 && i < 12){
    System.out.print("Nadador da categoria infantil B.");
}
    
if(i >= 12 && i < 14){
    System.out.print("Nadador da categoria juvenil A.");
}
  
if(i >= 14 && i < 18){
    System.out.print("Nadador da categoria juvenil B.");    
}
    
if(i >= 18){
    System.out.print("Nadador da categoria adulta.");
}
    
teclado.close();
}
}