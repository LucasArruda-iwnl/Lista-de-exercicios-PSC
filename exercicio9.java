/* 9. Escreva um programa que lê duas notas de um estudante, ambas sendo valores reais. O programa deve calcular a
média e exibir um texto para o usuário conforme a tabela a seguir:
Nota Texto
média >= 9 Parabéns, continue assim!
7 <= média < 9 Aprovado.
6 <= média < 7 Aprovado no limite, estude um pouco mais.
2 < = média < 6 Não está aprovado mas ainda pode fazer a segunda época
média < 2 Reprovado. Nos vemos semestre que vem.*/ 
import java.util.Scanner; 

public class exercicio9 {
    public static void main(String[] args) {
       
        Double nota; 
Scanner sc = new Scanner(System.in); 

System.out.println(" digite a nota atribuida para o aluno"); 
nota = sc.nextDouble();


if (nota >= 9){
    System.out.println( "parabens continua assim Albert");
}

else if (nota >= 7 && nota <= 8) {
    System.out.println( "mais um pouco você decola!");
}

else if (nota == 6  ) { 
    System.out.println("Foi de raspão, se esforce mais para não depender de sorte na próxima"); 
}

else if (nota >= 5 && nota <= 3) 
 System.out.println("Você está sendo direcionado para recuperaçao");

 else {
    System.out.println("reprovado, nos vemos semestre que vem");
 }


 sc.close(); 
    }
    
}
