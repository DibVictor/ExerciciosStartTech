package lista03;


import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String palavra = scanner.next().toLowerCase();
        char letra = scanner.next().toLowerCase().charAt(0);
        int posicao = 0;
        int quant = 0;
        while(posicao != palavra.length() && posicao != -1){
            posicao = palavra.indexOf(letra, (posicao + 1));
            if(posicao != -1){
                System.out.println(posicao);
                quant++;
            }
        }
        System.out.printf("Foram encontradas %d ocorrências dessa letra.", quant);

    }
}
