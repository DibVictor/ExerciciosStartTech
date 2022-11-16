package aula02;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gCelsius = 32.5;
        double gFahrenheit = (gCelsius * 9/5) + 32;
        System.out.printf("A temperatura informada é %.1fºC.", gCelsius);
        System.out.println();
        System.out.printf("Essa temperatura equivale a %.1f°F.", gFahrenheit);
    }
}
