import java.util.Scanner;

class senha {
  public static void main(String[] args) {

Scanner teclado = new Scanner(System.in);
String nome, senha;

System.out.print("Qual nome de usuario? ");
nome = teclado.next();

System.out.print("Qual a senha? ");
senha = teclado.next();

while(nome.equals(senha)){
    System.out.print("Erro: A senha deve ser diferente do nome!\n\n");
  
    System.out.print("Qual nome de usuario? ");
    nome = teclado.next();

    System.out.print("Qual a senha? ");
    senha = teclado.next();
}
teclado.close();  
}
}