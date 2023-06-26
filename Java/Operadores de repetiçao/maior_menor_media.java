import java.util.Scanner;

class maior_menor_media {
  public static void main(String[] args) {
   
Scanner teclado = new Scanner(System.in);
int maior = -999, menor = 999;
float media;

for(int i = 1; i <=10; i++){
    System.out.print("Digite um numero ");
    i = teclado.nextInt();

    if(i > maior){
    maior = i;
}
  
if(i < menor){
    menor = i;
}              
}
   
media = (float) (maior + menor) / 2;

System.out.print("\nO maior numero é " + maior + " o menor numero é " + menor + " a media dos numeros é " + media);

teclado.close();
}
}