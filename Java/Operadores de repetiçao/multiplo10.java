import java.util.Scanner;

class multiplo10 {
  public static void main(String[] args) {
    
Scanner teclado = new Scanner(System.in);

for(int i = 1; i <= 100; i++){
    System.out.print(i + "\n");

    if(i % 10 == 0){
    System.out.print("Multiplo de 10 \n");
}     
}
    
teclado.close();
}
}