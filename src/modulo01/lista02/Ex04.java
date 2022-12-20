package modulo01.lista02;

import java.util.Random;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escolha um número de 1 a 6: ");
        int numApostado = scanner.nextInt();
        int numSorteado = random.nextInt(6);
        System.out.println();

        System.out.printf("O número sorteado foi: %d", numSorteado);
        System.out.println();

        if (numApostado == numSorteado){
            System.out.println("Você acertou! Parabéns!");
        } else{
            System.out.println("Não foi dessa vez! Que pena!");
        }

    }
}
