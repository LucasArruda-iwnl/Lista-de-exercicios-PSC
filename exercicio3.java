import java.util.Scanner;
/*3. Escreva um programa que faz a leitura de 2 números inteiros. Caso o primeiro seja maior do que o segundo, o
programa imprime “primeiro maior do que o segundo”. Caso contrário, o programa imprime “segundo maior do que o
primeiro”. */
public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

int inteiro1, inteiro2;


System.out.println("Olá User, podeira nos enviar números inteiros para compara-los em nosso sistema?");


System.out.println("Nós mande o primeiro número inteiro"); 
inteiro1 = sc.nextInt();

System.out.println("Nós mande agora o segundo número inteiro"); 
inteiro2 = sc.nextInt(); 


if (inteiro1 > inteiro2) { 
    System.out.println("Seu primeiro número é maior que o segundo:");
}

else  {
      System.out.println("Seu segundo número é maior que o primeiro:");
}
sc.close();
    }
    
}
