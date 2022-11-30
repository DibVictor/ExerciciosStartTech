package lista01;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numFileiras, cadeirasPorFileira, totalCadeiras, cadeirasReservadas;

        System.out.print("Informe o número de fileiras: ");
        numFileiras = scanner.nextInt();
        System.out.print("Informe o número de cadeiras por fileira: ");
        cadeirasPorFileira = scanner.nextInt();
        System.out.println();

        System.out.printf("A sala de cinema tem %d fileiras e %d cadeiras em cada.", numFileiras, cadeirasPorFileira);
        System.out.println();

        totalCadeiras = numFileiras * cadeirasPorFileira;
        cadeirasReservadas = (totalCadeiras * 10)/100;

        System.out.printf("A capacidade dessa sala é de %d pessoas, " +
                          "sendo que %d lugares são reservados para PCDs.", totalCadeiras, cadeirasReservadas);
    }
}
