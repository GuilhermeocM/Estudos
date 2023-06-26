import java.util.Scanner;

class imc {

public static void main(String[] args) {
    
Scanner teclado = new Scanner(System.in);
float a, p;
char sexo;

System.out.print("Digite seu sexo ");
sexo = teclado.next().charAt(0);

if(sexo == 'm'){
  System.out.print("Digite sua altura ");
  a = teclado.nextFloat();
      
  p = (float) (72.7 * a) - 58;

  System.out.print("Seu peso ideal é " + p);
}
    
if (sexo == 'f'){
  System.out.print("Digite sua altura ");
  a = teclado.nextFloat();
      
  p = (float) (62.1 * a) - (float) 44.7;

  System.out.print("Seu peso ideal é " + p);     
}
    
if (sexo != 'm' && sexo != 'f'){
  System .out.print("Digite masculino ou feminino");
}
    
teclado.close();
}
}