
/*15. Faça um programa que lê os seguintes dados:
- valor/hora (é um número real positivo)
- horas trabalhadas (é um inteiro)
- imposto (um real entre 0 e 1, inclusive)
- comissão (é um real positivo)
Seu programa deve calcular e exibir para o usuário os seguintes valores:
Salário bruto, que é igual ao valor/hora multiplicado pelo número de horas trabalhadas.
Salário líquido, que é igual ao salário bruto menos o imposto mais a comissão. Note que a comissão somente
entrará nos cálculos caso o número de horas trabalhadas seja pelo menos 120. */
import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double horas, valorporhora;
        System.out.println("Digite quantas horas você trabalhou");
        horas = sc.nextDouble();
        System.out.println("Digite o valor por hora");
        valorporhora = sc.nextDouble();

        double salariobruto = horas * valorporhora;
        System.out.println("Digite caso haja imposto em seu salario, caso haja digite 1, caso contrario digite 0");
        double imposto = sc.nextDouble();
        double salarioliquido = salariobruto - (salariobruto * 0.15);

        if (imposto == 1) {
            System.out.println("Seu salario total do mês foi" + salarioliquido);
        } else if (imposto == 0) {
            System.out.println("Seu salario total do mês foi" + salariobruto);

            sc.close();
        }
    }
}
