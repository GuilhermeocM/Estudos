#include <stdio.h>

int main() {

  float id, p, p1 = 0, p2 = 0, p3 = 0, p4 = 0, t, tm = 0;
  float pc1, pc2, pc3, pc4;

  printf("Digite o id do mouse: ");
  scanf("%f", &id);
  
  while(id != 0){
  printf("\n1 esfera\n2 limpeza\n3 cabo ou conector\n4 inutilizado\nDigite o problema: ");
  scanf("%f", &p);

    if(p == 1){
      p1++;
        }
    if(p == 2){
      p2++;
        }   
    if(p == 3){
      p3++;
        }   
    if(p == 4){
      p4++;
        }
    tm = tm + 1;
    
    
  printf("\nDigite o id do mouse: ");
  scanf("%f", &id);    
    
  }

  t = p1 + p2 + p3 + p4;
  pc1 = (p1 / t) * 100;
  pc2 = (p2 / t) * 100;
  pc3 = (p3 / t) * 100;
  pc4 = (p4 / t) * 100;

  printf("\n\nTotal de mouses %0.0f\n", tm);
  printf("\nNecessita de esfera         %0.0f   %0.1f % \n", p1, pc1);
  printf("Necessita de limpeza        %0.0f   %0.1f % \n", p2, pc2);
  printf("Troca do cabo ou conector   %0.0f   %0.1f % \n", p3, pc3);
  printf("Inutilizado                 %0.0f   %0.1f % \n", p4, pc4);
      
}