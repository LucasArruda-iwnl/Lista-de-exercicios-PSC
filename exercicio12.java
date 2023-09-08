/* 12. Escreva um programa que verifica se um dado número inteiro de quatro dígitos é uma senha válida. Para ser
considerado como uma senha válida, um número tem que ter as seguintes características:
- O primeiro dígito da esquerda para a direita tem que ser 8 ou 5
- O quarto dígito da esquerda para a direita tem que ser 5 ou 1
- A soma do segundo com o terceiro dígitos tem que ser 3 caso o quarto dígito seja 5 e 0 caso ele seja 1
Por exemplo, o número 8125 é uma senha válida pois começa com 8, termina com 5 e a soma dos dois dígitos do
meio é 3. */
import java.util.Scanner; 

public class exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  num1, num2, num3, num4; 
       
        System.out.println("Por favor digite a sua senha de 4 digitos uma por vez"); 
System.out.println("primeiro digito");
        num1 = sc.nextInt();
  System.out.println("segundo digito");
        num2 = sc.nextInt();
System.out.println("terceiro digito");
        num3 = sc.nextInt();
System.out.println("quarto digito");
        num4 = sc.nextInt();

        String senha = Integer.toString(num1) + Integer.toString(num2) + Integer.toString(num3) + Integer.toString(num4);

        switch (num1) {
            case 5:
            case 8:
                switch (num4) {
                    case 1:
                    case 5:
                        if ((num2 + num3 == 3 && num4 == 5) || (num2 + num3 == 0 && num4 == 1)) {
                            System.out.println("É uma senha válida.");
                        } else {
                            System.out.println("Não é uma senha válida.");
                        }
                        break;
                    default:
                        System.out.println("Não é uma senha válida.");
                        break;
                }
                break;
            default:
                System.out.println("Não é uma senha válida.");
                break;
        }
        sc.close();
    } 
   
        






} 

    
    

