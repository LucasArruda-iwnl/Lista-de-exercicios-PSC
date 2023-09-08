
/*14. Escreva um programa que lê as notas de 10 alunos e calcula a média aritmética delas. Caso a média seja pelo
menos 6, o programa deve exibir a quantidade de alunos que tiveram nota maior do que 8. Caso contrário, o programa
deve exibir a quantidade de alunos que tiraram nota 0. */
import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota1, nota2, nota3, nota4, nota5, nota6, nota7, nota8, nota9, nota10;
        System.out.println("digite a nota do aluno1");
        nota1 = sc.nextInt();
        System.out.println("digite a nota do aluno2");
        nota2 = sc.nextInt();
        System.out.println("digite a nota do aluno3");
        nota3 = sc.nextInt();
        System.out.println("digite a nota do alun4");
        nota4 = sc.nextInt();
        System.out.println("digite a nota do aluno5");
        nota5 = sc.nextInt();
        System.out.println("digite a nota do aluno6");
        nota6 = sc.nextInt();
        System.out.println("digite a nota do aluno7");
        nota7 = sc.nextInt();
        System.out.println("digite a nota do aluno8");
        nota8 = sc.nextInt();
        System.out.println("digite a nota do aluno9");
        nota9 = sc.nextInt();
        System.out.println("digite a nota do aluno10");
        nota10 = sc.nextInt();

        double media = (nota1 + nota2 + nota3 + nota4 + nota5 + nota6 + nota7 + nota8 + nota9 + nota10) / 10;

        if (media < 6) {
            System.out.println("A quantidade de alunos que tiraram nota maior do que 8 é: " + (10 - media));
        } else {
            System.out.println("A quantidade de alunos que tiraram nota 0 é: " + media);
        }
        sc.close();
    }

}
