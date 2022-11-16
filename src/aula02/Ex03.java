package aula02;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorKm, valorMilha;

        System.out.print("Informe o valor em Km: ");
        valorKm = scanner.nextDouble();
        System.out.println();
        System.out.printf("O valor recebido em kilômetros é %f, ", valorKm);

        valorMilha = valorKm * 0.621371;

        System.out.println();
        System.out.printf("e o equivalente em milhas é %f.", valorMilha);
    }
}
