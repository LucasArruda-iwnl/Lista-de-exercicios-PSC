/*  
 * 6. Escreva um programa que lê dois valores reais. O primeiro valor é o saldo de uma conta bancária e o segundo é um
valor que o usuário deseja sacar desta conta. Caso seja possível efetuar o saque (ou seja, o saldo não fique negativo), o
programa deve mostrar o saldo remanescente. Caso contrário, deve informar o usuário que não foi possível realizar o
saque.
 */
import java.util.Scanner;
public class exercicio6 {
   
public static void main(String[] args) {
    



        Scanner sc = new Scanner(System.in); 

        System.out.println("Olá Usuario, por favor coloque seu saldo atual!");
        double atual, pos, saque; 
        atual = sc.nextDouble(); 
        System.out.println("Saldo verificado! Está tudo certo com sua conta, por favor nós dizer quanto quer de saldo");
        saque = sc.nextDouble(); 


        pos = (atual - saque); 

        if (saque > atual){
            System.out.println("O valor requerido para saque não é possivel ser realizado pelo fundo da conta"); 

        }
        
        else  { 
        System.out.println("o valor de " + saque + "acabou de ser retirado! atualmente a sua conta se encontra com" + pos + "Ótimo dia!" );
        }
    
        sc.close(); 
    }
    
}
