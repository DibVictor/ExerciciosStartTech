package aula04;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escreva um número inteiro maior que 0: ");
        int numero = scanner.nextInt();

        for(int cont = 1;  cont <= numero; cont++){
            if(cont % 2 == 0){
                System.out.println(cont);
            }
        }
    }
}
