/*13. Escreva um programa que lê três números inteiros diferentes e os exibe em ordrescente. Se o usuário digitar
números iguais, seu programa deve exibir uma mensagem de erro e terminar.*/
import java.util.Scanner;
public class exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int num1, num2, num3, decrescente;
        System.out.println("Olá por gentileza digite três números diferentes");
        System.out.println("primeiro");
        num1 = sc.nextInt();
 System.out.println("segundo");
        num2 = sc.nextInt();
 System.out.println("terceiro");
        num3 = sc.nextInt();

        decrescente = Integer.parseInt(Integer.toString(num3) + Integer.toString(num2) + Integer.toString(num1));

       
        if (num1 == num2 || num1 == num3 || num2 == num3) {
            System.out.println("erro.");
        } 
        else {
           System.out.println("Seu número decrescente fica:" + decrescente);  
        }


       sc.close();
    }
} 

