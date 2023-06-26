import java.util.Scanner;

class taxa_peixes {
  public static void main(String[] args) {

Scanner teclado = new Scanner(System.in);
float p, e, m;

System.out.print("Informe o peso dos peixes ");
p = teclado.nextFloat();

if(p > 50){
    e = p - 50;
    m = e * 4;

    System.out.printf("\nHouve excesso de %.2f quilos de peixe e voce terá que pagar multa de R$:%.2f reais.", e, m);
}
else{
    System.out.print("\nNao houve excesso");
}
teclado.close();
}
}