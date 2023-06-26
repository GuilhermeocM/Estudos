#include <stdio.h>

int main(){
float devo;
int cont_total, cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, troco, m1 = 250, m2 = 100, m3 = 50, m4 = 10;

do{
  printf("Quanto lhe devo? ");
  scanf("%f", &devo);
  }while(devo < 0.0);

troco = devo * 1000;
  
while(troco >= m1){
  cont1++;
  troco = troco - m1;
}
while(troco >= m2){
  cont2++;
  troco = troco - m2;
}
while(troco >= m3){
  cont3++;
  troco = troco - m3;
}
while(troco >= m4){
  cont4++;
  troco = troco - m4;
}
  cont_total = cont1 + cont2 + cont3 + cont4;
 
printf("\nDevolva %d moedas de 0,25c\n", cont1);
printf("Devolva %d moedas de 0,10c\n", cont2);
printf("Devolva %d moedas de 0,05c\n", cont3);
printf("Devolva %d moedas de 0,01c\n\n", cont4);
printf("O total de moedas devolvidas é %d", cont_total);
  
}