import java.util.Scanner;

class taxa_poluiçao {
  public static void main(String[] args) {
    
Scanner teclado = new Scanner(System.in);
float p;
    
System.out.print("Informe o indice de poluiçao: ");
p = teclado.nextFloat();

if(p >= 0.3 && p < 0.4){
    System.out.print("Industrias do grupo 1 devem suspender as atividades.");
}
    
if(p >= 0.4 && p < 0.5){
    System.out.print("Industrias do grupo 2 devem suspender as atividades.");
}
    
if(p >= 0.5){
    System.out.print("Todas as industrias devem suspender as atividades.");
}
    
teclado.close();
}
}