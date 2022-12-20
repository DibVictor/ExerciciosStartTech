package modulo01.lista03;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] produto = new String[3];
        Double[] preco = new Double[3];


        for(int cont = 0; cont < 3; cont++) {
            System.out.print("Informe o 1º produto: ");
            produto[cont] = scanner.next();
            System.out.print("Informe o preço desse produto: ");
            preco[cont] = scanner.nextDouble();
        }

        Integer[] ordemDeTamanho = new Integer[3];
        Integer[] iguais = new Integer[3];

        /*for(int i = 0; i < 3; i++){
            if(i == 0){
                ordemDeTamanho[i] = 0;
            } else{
                for(int j = (i - 1); j >= 0; j--){
                    if(preco[i] > preco[j]){
                        ordemDeTamanho[j] = i;
                        ordemDeTamanho[i] = j;
                    } else if(preco[i].equals(preco[j])){
                        iguais[i] = i
                    }

                }
            }

        }*/

    }
}
