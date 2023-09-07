/*1. Escreva um programa que faz a leitura de um número inteiro e um número real. Caso o número inteiro seja menor
do que o número real, o programa deve imprimir uma mensagem dizendo isso ao usuário. Caso contrário, o programa
somente termina. */
import java.util.Scanner;

public class exercicio1  {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
System.out.println("Digite seu número, que iremos te dizer qual é maior"); 

System.out.println("Digite seu número inteiro"); 
int inteiro = sc.nextInt(); 


System.out.println("digite seu número Real");
 float real = sc.nextFloat(); 
 
 
if (real > inteiro) { 
    System.out.println("Seu número real é maior que o inteiro");
}


    sc.close(); 
    }
}
