/*11. Faça um programa que lê os seguintes dados:
- código de estado (um inteiro de 1 a 5)
- valor inicial de carga
Seu programa deve calcular qual o valor final de uma carga de acordo com as seguintes regras.
Caso o código de estado seja 2 ou 5 o valor final da carga é o valor inicial menos 12%.
Caso o código de estado seja 1, 3 ou 4, o valor final da carga é o valor inicial menos 15%. */

import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int estado;
       double  carga, valor, porcen;
       

        System.out.println("Por favor me diga o cód de estado da aonde você está agora para que possamos aplicar as leis estaduais");
        estado = sc.nextInt(); 
        System.out.println("Por favor me diga em kilos a carga que quer transportar");
        
         
        if (estado == 2) { 
            carga = sc.nextDouble(); 
            porcen = (carga * 0.12);
            valor = (porcen + carga);
            System.out.println("O valor para transporte" + valor); 
        }
        
        else if (estado == 5) { 
            carga = sc.nextDouble(); 
            porcen = (carga * 0.12);
            valor = (porcen + carga);
            System.out.println("O valor para transporte" + valor); 
        }

          else if (estado == 1) { 
            carga = sc.nextDouble(); 
            porcen = (carga * 0.16);
            valor = (porcen + carga);
            System.out.println("O valor para transporte" + valor); 
        }
            else if (estado == 3) { 
            carga = sc.nextDouble(); 
            porcen = (carga * 0.16);
            valor = (porcen + carga);
            System.out.println("O valor para transporte" + valor); 
        }
            else if (estado == 4) { 
            carga = sc.nextDouble(); 
            porcen = (carga * 0.16);
            valor = (porcen + carga);
            System.out.println("O valor para transporte" + valor); 
        }

        sc.close();
        
    }
    
}
