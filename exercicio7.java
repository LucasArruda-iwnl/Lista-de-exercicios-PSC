/*7. Faça um programa que lê um valor real, representando o valor de uma peça de roupa. A seguir, o programa deve ler
um inteiro (0, 1 ou 2) os quais representam as seguintes opções:
0 – Compra à vista
1 – Compra parcelada no cartão
2 – Crediário
Na opção 0, o programa deve calcular quanto custa a peça de roupa com 10% de desconto.
Na opção 1, o programa deve perguntar ao usuário quantas parcelas deseja utilizar e exibir o valor da parcela.
Na opção 2, o usuário pagará juros de 10% sobre o valor total. O programa deve ler o número de parcelas
desejado e exibir o valor de cada parcela, que é calculado sobre o valor com juros.
Caso o usuário digite alguma opção diferente de 0, 1 ou 2, o programa deve informar “opção inválida” e
terminar.*/
import java.util.Scanner; 
public class exercicio7 {
    public static void main(String[] args) {
        double  valor, desc, forma, porcen, parcela, cadaparcela, juros, cdp;  
      
 Scanner sc = new Scanner(System.in); 
System.out.println("Olá Vendedor! Por gentileza, selecione a forma de pagamento 0- caso o cliente queira pagar a vista. 2 parcelado. 3 parcelado com 10% de juros");
forma = sc.nextDouble(); 


if (forma == 0) { 
    System.out.println("Digite o valor da peça"); 
    valor = sc.nextDouble(); 
    porcen = (valor * 0.10); 
    desc = (valor - porcen);
    System.out.println("o valor com 10% de desconto é" + desc);
    
}

else if (forma == 1) { 
 System.out.println("Digite o valor da peça "); 
    valor = sc.nextDouble(); 
     System.out.println("Digite a quantidade de parcelas "); 
    parcela = sc.nextDouble(); 
    cadaparcela = (valor / parcela); 
    System.out.println("o valor de cada parcela será" + cadaparcela); 

}

 else if (forma == 2) {
System.out.println("Digite o valor da peça e logo em seguida a quantidade de parcelas"); 
valor = sc.nextDouble();
System.out.println("Digite a quantidade de parcelas "); 
parcela = sc.nextDouble(); 
cdp = (valor / parcela);
porcen = (valor * 0.10); 
juros = (cdp + porcen); 
 System.out.println("o valor de cada parcela com juros será" + juros); 


}






sc.close();
}
        
    }
    

