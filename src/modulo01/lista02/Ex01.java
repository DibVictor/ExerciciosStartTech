package modulo01.lista02;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota1, nota2, nota3, nota4, mediaNotas;

        System.out.print("Informe a 1ª nota: ");
        nota1 = scanner.nextDouble();
        System.out.print("Informe a 2ª nota: ");
        nota2 = scanner.nextDouble();
        System.out.print("Informe a 3ª nota: ");
        nota3 = scanner.nextDouble();
        System.out.print("Informe a 4ª nota: ");
        nota4 = scanner.nextDouble();
        System.out.println();

        System.out.printf("As notas do aluno no ano são: 1ª %.2f, 2ª %.2f, 3ª %.2f e 4ª %.2f.",
                          nota1, nota2, nota3, nota4);
        System.out.println();

        mediaNotas = (nota1 + nota2 + nota3 + nota4)/2;
        System.out.printf("A média das notas é de %.2f.", mediaNotas);
        System.out.println();

        if (mediaNotas >= 6) {
            System.out.println("Parabéns! Você foi aprovado! :)");
        } else {
            System.out.println("Infelizmente, você foi reprovado! :(");
        }
    }
}
