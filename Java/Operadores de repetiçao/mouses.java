import java.util.Scanner;

class mouses {
  public static void main(String[] args) {
    
Scanner teclado = new Scanner(System.in);
float cod, def, d1 =0, d2 =0, d3 = 0, d4 = 0, t = 0, p1, p2, p3, p4;

System.out.print("Digite o codigo do mouse ");
cod = teclado.nextFloat();
    
while(cod != 0){
    System.out.println("\nDigite o defeito: \n\n 1 necessita de esfera \n 2 necessita de limpeza \n 3 necessita da troca do cabo ou conector \n 4 quebrado ou inutilizado");
    def = teclado.nextFloat();      

    if (def == 1){
        d1 = d1 + 1;
}
  
    if (def == 2){
        d2 = d2 + 1;
}
  
    if (def == 3){
        d3 = d3 + 1;
}
  
    if (def == 4){
        d4 = d4 +1;
}

    t = t + 1;
      
    System.out.print("Digite o codigo do mouse ");
    cod = teclado.nextFloat();
}
    
p1 = (d1 / t) * 100;
p2 = (d2 / t) * 100;
p3 = (d3 / t) * 100;
p4 = (d4 / t) * 100;

System.out.printf("\nO total de mouses é %.0f\n", t);
System.out.printf("\n\tSituaçao \t\t\t Quant \t Percentual");
System.out.printf("\n1 - Necessita da esfera \t %.0f \t %.0f%%", d1, p1);
System.out.printf("\n2 - Necessita de limpeza \t %.0f \t %.0f%%", d2, p2);
System.out.printf("\n3 - Troca cabo ou conector \t %.0f \t %.0f%%", d3, p3);
System.out.printf("\n4 - Quebrado inutilizado \t %.0f \t %.0f%%", d4, p4);

teclado.close();
    
}
}