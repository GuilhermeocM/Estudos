import java.util.ArrayList;

class vetorpar {
  public static void main(String[] args) {
    
ArrayList <Integer> vetor = new ArrayList<Integer>();
ArrayList <Integer> par = new ArrayList<Integer>();

for(int i = 0; i < 5; i++){
    vetor.add(i);
    if(i % 2 == 0 && i > 0){
    par.add(i);
}
}
    
for(Integer n : par){
      System.out.println(n);
      
}
}
}