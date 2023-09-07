import java.util.Scanner; 
/*4. Escreva um programa que pede para o usuário inserir dois números, obtém os números do usuário e então imprime
o maior número seguido pelas palavras “é o maior”. Se os números forem iguais, imprime a mensagem “Estes
números são iguais”. */
public class exercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num1, num2; 
        System.out.println("Olá, iremos comparar seus números ok? Nós envie"); 

        
          System.out.println("Nós enive seu primeiro número");

 num1 = sc.nextDouble(); 
        
  System.out.println("Nós enive seu segundo número");
  num2 = sc.nextDouble(); 

 if (num2 < num1) {
    System.out.println("Seu primeiro número é maior que o segundo"); 

  }
else if (num2 == num1) { 
    System.out.println("Seus números são iguais");
}

sc.close();

    }
    
}
