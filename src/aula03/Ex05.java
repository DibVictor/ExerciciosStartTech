package aula03;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o salário: ");
        double salario = scanner.nextDouble();
        System.out.println();
        double aliquotaTotal;

        if (salario > 3641.03){
            double salarioExcedente = salario - 3641.03;
            aliquotaTotal = 90.9 + 218.4615 + 436.9236 + (salarioExcedente * 0.14);
            System.out.printf("A alíquota total que você deve pagar ao INSS é de R$%.2f.", aliquotaTotal);
        } else if (salario > 2427.35){
            double salarioExcedente = salario - 2427.35;
            aliquotaTotal = 90.9 + 218.4615 + (salarioExcedente * 0.12);
            System.out.printf("A alíquota total que você deve pagar ao INSS é de R$%.2f.", aliquotaTotal);
        } else if (salario > 1212) {
            double salarioExcedente = salario - 1212;
            aliquotaTotal = 90.9 + (salarioExcedente * 0.09);
            System.out.printf("A alíquota total que você deve pagar ao INSS é de R$%.2f.", aliquotaTotal);
        } else {
            aliquotaTotal = salario * 0.075;
            System.out.printf("A alíquota total que você deve pagar ao INSS é de R$%.2f.", aliquotaTotal);
        }
    }
}
