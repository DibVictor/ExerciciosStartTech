package aula02;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calendar calendar = GregorianCalendar.getInstance();

        int anoNasc, anoAtual, idade;

        System.out.print("Informe o ano de nascimento: ");
        anoNasc = scanner.nextInt();
        anoAtual = calendar.get(Calendar.YEAR);

        idade =  anoAtual - anoNasc;

        System.out.printf("O ano de nascimento informado é %d.", anoNasc);
        System.out.println();
        System.out.printf("A idade dessa pessoa é de %d anos.", idade);
    }
}