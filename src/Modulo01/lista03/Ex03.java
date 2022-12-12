package Modulo01.lista03;

import java.util.Random;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de números a sortear: ");
        int numSorteados = scanner.nextInt();
        System.out.println();

        int somaSorteados = 0;

        for(int cont = 1; cont <= numSorteados; cont++){
            int atualSorteado = random.nextInt(1, 6);
            System.out.printf("O %dº número sorteado é: %d.", cont, atualSorteado);
            System.out.println();
            somaSorteados += atualSorteado;
        }

        System.out.printf("A soma de todos esses números resulta em: %d", somaSorteados);


    }
}
