package lista04;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de números que pretende informar: ");
        int quantValores = scanner.nextInt();
        int[] listaDeNumeros = new int[quantValores];
        for(int i = 0; i < listaDeNumeros.length; i++){
            System.out.printf("Informe o %dº número da lista: ", (i+1));
            listaDeNumeros[i] = scanner.nextInt();
        }

        int menorNum = 0;
        int maiorNum = 0;
        for(int i = 0; i < listaDeNumeros.length; i++){
            if(i == 0){
                menorNum = listaDeNumeros[i];
                maiorNum = listaDeNumeros[i];
            }else{
                if(menorNum > listaDeNumeros[i]){
                    menorNum = listaDeNumeros[i];
                }
                if(maiorNum < listaDeNumeros[i]){
                    maiorNum = listaDeNumeros[i];
                }
            }
        }

        System.out.println("A lista contém os seguintes números:");
        for(int i = 0; i < listaDeNumeros.length; i++){
            if(i < (listaDeNumeros.length - 1)){
                System.out.printf("%d e ", listaDeNumeros[i]);
            }else if(i == (listaDeNumeros.length - 1)){
                System.out.printf("%d.", listaDeNumeros[i]);
                System.out.println();
            }else{
                System.out.printf("%d, ", listaDeNumeros[i]);
            }
        }
        System.out.printf("O menor número é %d, e o maior número é %d.", menorNum, maiorNum);
    }
}
