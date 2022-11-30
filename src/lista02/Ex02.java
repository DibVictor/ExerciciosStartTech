package lista02;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tempEntrada, tempConvertida;
        String tipoEscalaTemp;

        System.out.print("Informe a temperatura em valor numérico: ");
        tempEntrada = scanner.nextDouble();
        System.out.print("Informe o tipo de escala da temperatura, usando 'C' pra Celsius, e 'F' para Fahrenheit: ");
        tipoEscalaTemp = scanner.next();
        System.out.println();
        System.out.println();

        if (tipoEscalaTemp.equalsIgnoreCase("C")){
            System.out.printf("A temperatura informada é de %.1f° Celsius.", tempEntrada);
            System.out.println();

            tempConvertida = (tempEntrada * 9/5) + 32;

            System.out.printf("Essa temperatura equivale a %.1f° Fahrenheit.", tempConvertida);
        } else if (tipoEscalaTemp.equalsIgnoreCase("F")){
            System.out.printf("A temperatura informada é de %.1f° Fahrenheit.", tempEntrada);
            System.out.println();

            tempConvertida = (tempEntrada - 32) * 5/9;

            System.out.printf("Essa temperatura equivale a %.1f Fahrenheit.", tempConvertida);
        } else {
            System.out.println("Caractere inválido. Digite 'C' para Celsius, e 'F' para Fahrenheit.");
        }
    }
}
