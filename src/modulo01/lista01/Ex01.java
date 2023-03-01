package modulo01.lista01;
/*
1. Crie um programa que receba o ano de nascimento de uma pessoa e calcule quantos anos ela tem 
considerando que o ano atual é 2022. Obs: Não vamos considerar o mês do nascimento nesse exercício.

O ano de nascimento informado é 1998.
A pessoa tem (ou vai completar) 24 anos em 2022. 

 */
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