package modulo01.lista01;
/*
2. Calcular a quantidade de pessoas que cabem em uma sala de cinema

Crie um programa que receba a quantidade de cadeiras que existe em cada fileira 
de uma sala de cinema, e quantas fileiras existem na sala. O programa deve então imprimir 
no console a capacidade de pessoas sentadas nessa sala.

A sala de cinema tem 10 fileiras e 8 cadeiras em cada.
A capacidade dessa sala é de 80 pessoas.

Desafio extra: Considere que a sala de cinema reserve 10% de sua capacidade para pessoas 
com deficiência. Imprima no console a quantidade total de lugares e a quantidade reservada 
para pessoas com deficiência.

A sala de cinema tem 10 fileiras e 8 cadeiras em cada.
A capacidade dessa sala é de 80 pessoas, sendo que 8 lugares são reservados para PCDs.

 */
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
