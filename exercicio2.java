/*2. Escreva um programa que faz a leitura de dois números reais e verifica se eles são iguais. Se forem, o programa
deve mostrar uma mensagem ao usuário informando-o disso. Caso contrário, o programa somente termina. */
import java.util.Scanner; 

public class exercicio2 {
    public static void main(String[] args) {
        float real, real2;
        Scanner sc = new Scanner(System.in); 

        System.out.println("Olá, nós iremos comparar seu números reais e verificar se eles são os mesmos!"); 

        

        System.out.println("Digite seu primeiro número real");
        real = sc.nextFloat(); 


        System.out.println("Digite seu segundo número real"); 
         real2 = sc.nextFloat(); 

        
        if ( real == real2){ 
            System.out.println("os  números são iguais e representam o mesmo valor"); 
        }
        
   
   
   
   sc.close();
    }
    
}
