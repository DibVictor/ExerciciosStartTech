package lista01;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valorReal, valorDolar, valorEuro, valorIene, valorLibra, valorPesoArg;
        System.out.print("Informe o valor em reais: ");
        valorReal = scanner.nextDouble();
        valorDolar = valorReal * 0.19;
        valorEuro = valorReal * 0.19;
        valorIene = valorReal * 28.34;
        valorLibra = valorReal * 0.17;
        valorPesoArg = valorReal * 30.94;
        System.out.printf("O valor recebido é de %.2f reais.", valorReal);
        System.out.println();
        System.out.println("Esse valor em equivale a:");
        System.out.printf("%.2f dólares,", valorDolar);
        System.out.println();
        System.out.printf("%.2f euros,", valorEuro);
        System.out.println();
        System.out.printf("%.2f ienes,", valorIene);
        System.out.println();
        System.out.printf("%.2f libras esterlinas,", valorLibra);
        System.out.println();
        System.out.printf("e %.2f pesos argentinos.", valorPesoArg);
    }
}
