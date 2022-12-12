package Modulo01.lista03;

import java.util.Random;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Informe o número que quer que seja sorteado: ");
        int numApostado = scanner.nextInt();
        System.out.println();
        int numSorteado = 0, quantSorteios = 0;

        while(numSorteado != numApostado){
            numSorteado = random.nextInt(1, 6);
            System.out.printf("%dº Sorteio: %d", (quantSorteios + 1), numSorteado);
            System.out.println();
            quantSorteios++;
        }
        System.out.printf("Foram realizados %d soretios até que o número escolhido fosse o sorteado.", quantSorteios);

    }
}
