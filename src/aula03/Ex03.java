package aula03;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a sua idade: ");
        int idade = scanner.nextInt();

        if (idade < 18 || idade > 65) {
            if (idade < 18){
                System.out.println("Você não tem idade suficiente para solicitar um empréstimo," +
                                   "e por isso não poderá solicitar um empréstimo.");
            } else {
                System.out.println("Você já passou da idade necessária para solicitar um empréstimo," +
                                   "e por isso não poderá solicitar um empréstimo.");
            }
        } else {
            System.out.print("Informe o seu salário: R$");
            double salario = scanner.nextDouble();
            System.out.print("Informe o valor do empréstimo: R$");
            double valorEmprestimo = scanner.nextDouble();
            System.out.print("Informe em quantas parcelas quer pagar: x");
            int quantParcelas = scanner.nextInt();

            if (quantParcelas < 3 || quantParcelas > 24) {
                if (quantParcelas < 3){
                    System.out.println("A quantidade de parcelas está abaixo da quantidade mínima permitida.");
                    System.out.println("Empréstimo negado.");
                } else{
                    System.out.println("A quantidade de parcelas está acima da quantidade máxima permitida.");
                    System.out.println("Empréstimo negado.");
                }
            } else{
                double valorParcela = valorEmprestimo/quantParcelas;
                double porcentDoSalario = (valorParcela * 100)/salario;

                if (porcentDoSalario > 30){
                    System.out.println("O valor por parcela equivale a mais de 30% seu salário.");
                    System.out.println("Empréstimo negado.");
                } else{
                    System.out.println("Sua solicitação se encontra dentro dos termos de aprovação.");
                    System.out.println("Empréstimo concedido.");
                }
            }

        }
    }
}
