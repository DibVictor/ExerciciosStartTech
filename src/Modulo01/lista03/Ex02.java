package Modulo01.lista03;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número inteiro maior que 1: ");
        int numero = scanner.nextInt();
        System.out.println();

        for(int i = 1; i <= numero; i++){
            for(int j = 1; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
