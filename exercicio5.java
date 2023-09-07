import java.util.Scanner;
/*5. Escreva um programa que lê três inteiros a partir do teclado e imprime a soma, a média, o produto, o menor e o
maior desses números. */
public class exercicio5 {
    public static void main(String[] args) {
        
   Scanner sc = new Scanner(System.in); 
        double a, b, c, r1, r2, r3;  

        System.out.println("Olá, digite três números, lhe darei a soma, o produto e a média dentre eles"); 

 System.out.println("Seu primeiro valor");
        a = sc.nextDouble();
         System.out.println("Seu segundo valor");
        b = sc.nextDouble();
         System.out.println("Seu terceiro valor");
        c = sc.nextDouble();

   r1 = (a + b + c);

 r2 = (a * b * c); 

r3 = (r1 / 3); 


System.out.println("A soma do seus números é:" + r1 + "a multiplicação deles é:" + r2 + "e a média deles é" + r3 );










        sc.close();
    }
    
}
