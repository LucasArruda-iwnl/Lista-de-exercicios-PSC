/* 10. Escreva um programa que oferece para o usuário as seguintes opções:
1 – Misto quente R$5,50
2 – Salada Chinesa R$10,20
3 – Suco de Laranja R$4,00
4 – Suco de Manga R$3,50*/
import java.util.Scanner; 

public class exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n; 
        System.out.println("Olá Caro cliente, o que gostaria de comer em nossa loja 1  Misto quente  2  Salada Chinesa   3  Suco de Laranja  4  Suco de Manga  ");
        n = sc.nextInt();

switch (n) { 

case 1: 

    System.out.println("uma boa escolha, misto esta sendo feito, deu total de 5,50 reias");
break; 

case 2:
     System.out.println("Uma boa escolha estamos preparando salada chinesa, deu total de 10,20 reais");
break;

case 3: 
System.out.println("Uma boa escolha, pegue aqui o suco, ficou 4 reais"); 
break;


case 4: 
System.out.println("Uma boa escolha Zé da manga");

break;
}




        sc.close(); 
    }

}
