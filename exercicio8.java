/*8. Escreva um programa que lê a altura e peso do usuário e calcula o seu IMC, índice de massa corpórea.
O programa deve exibir um texto para o usuário conforme a tabela abaixo:
IMC Texto
Abaixo de 18,5 Abaixo do peso ideal.
Entre 18,5 e 24,9 Peso ideal, muito bem.
Entre 25,0 e 29,9 Sobrepeso, um regime leve pode ajudar.
Entre 30,0 e 34,9 Obesidade leve.
Entre 35,0 e 39,9 Obesidade moderada.
Acima de 40 Obesidade mórbida.
*/ 
import java.util.Scanner; 
public class exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float altura, peso, imc;   
        System.out.println("Olá, este aplicativo é para você calcular seu IMC!");

          System.out.println("vamos começar com seu peso, por favor informe abaixo");
          peso = sc.nextFloat(); 
           System.out.println("agora sua altura, por favor informe abaixo exp(1,72)");
           altura = sc.nextFloat(); 


          imc = (peso / (altura * altura));

          if (imc <= 18.4) {
          System.out.println("seu imc é:" + imc + "Abaixo do ideal");
          }
          
          else if (imc >= 18.5 && imc <= 29.9) { 
            System.out.println("seu imc é:" + imc + "Peso ideal, muito bem");
          }


        else if (imc >= 25.0 && imc <= 24.9 ){
               System.out.println("seu imc é:" + imc + " Sobrepeso, um regime leve pode ajudar");

        }

        else if ( imc >= 30.0 && imc <= 34.9) {
               System.out.println("seu imc é:" + imc + " Obesidade leve");

        }

        else if (imc >= 35.0 && imc <=39.9 ){ 
             System.out.println("seu imc é:" + imc + " Obesidade Moderada");


        }

        











          sc.close();
    }
    
}
