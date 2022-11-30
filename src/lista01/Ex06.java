package lista01;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double largura, comprimento, profInicial, profFinal;


        System.out.print("Informe a largura da piscina: ");
        largura = scanner.nextDouble();
        System.out.print("Informe o comprimento da piscina: ");
        comprimento = scanner.nextDouble();
        System.out.print("Informe a profundidade inicial da piscina: ");
        profInicial = scanner.nextDouble();
        System.out.print("Informe a profundidade final da piscina: ");
        profFinal = scanner.nextDouble();
        System.out.println();

        System.out.printf("As dimensões da piscina são %.2fm de largura e %.2fm de comprimento.", largura, comprimento);
        System.out.println();
        System.out.printf("Sua profundiade inicial é %.2fm e sua profundidade final é %.2fm.", profInicial, profFinal);
        System.out.println();
        System.out.println();


        double profMedia = (profInicial + profFinal)/2;
        double volumeDaPiscina = largura * comprimento * profMedia;
        double totalLitros = volumeDaPiscina * 1000;


        System.out.printf("Essa piscina comporta %.2f litros de água.", totalLitros);
    }
}
