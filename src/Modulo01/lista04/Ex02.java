package Modulo01.lista04;

import java.util.Scanner;

public class Ex02 {
    static String[] linha1 = {" ", " ", " "};
    static String[] linha2 = {" ", " ", " "};
    static String[] linha3 = {" ", " ", " "};
    static String[][] jogoDaVelha = {linha1, linha2, linha3};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contagem = 0;
        int vencedor = 0;
        boolean vitoria = false;
        String[] caractereDoJogador = new String[2];

        System.out.println("Antes de mais nada, o primeiro jogador deve escolher seu caractere. Qual será?");
        System.out.print("Digite 'X' ou 'O': ");
        caractereDoJogador[0] = scanner.nextLine().toUpperCase();
        if(caractereDoJogador[0].equals("X")){
            caractereDoJogador[1] = "O";
        }else if(caractereDoJogador[0].equals("O")){
            caractereDoJogador[1] = "X";
        }

        System.out.println();
        System.out.println("--------------------------------------------");
        System.out.println();
        tabuleiro();
        System.out.println();
        System.out.println("---");
        System.out.println();

        while(contagem < 9 & !vitoria){
            System.out.printf("%dª rodada", contagem + 1);
            System.out.println("----------");
            System.out.println();

            if(contagem % 2 == 0){
                System.out.println("Jogador 1, sua vez.");
                entradaDeValores(caractereDoJogador[0]);
            }else{
                System.out.println("Jogador 2, sua vez.");
                entradaDeValores(caractereDoJogador[1]);
            }
            System.out.println();

            tabuleiro();

            int contagemDeVerificacao = 0;
            while(contagemDeVerificacao < 8 & !vitoria){
                if(contagemDeVerificacao < 3){
                    vitoria = verificadorLinha(contagemDeVerificacao);
                }else if(contagemDeVerificacao < 6){
                    vitoria = verificadorColuna(contagemDeVerificacao - 3);
                }else{
                    vitoria = verificadorDiagonal(contagemDeVerificacao);
                }

                contagemDeVerificacao++;
            }
            if(vitoria){
                if(contagem %2 == 0){
                    vencedor = 1;
                }else{
                    vencedor = 2;
                }
            }else{
                System.out.println("---");
                System.out.println();
            }

            contagem++;
        }
        System.out.println("--------------------------------------------");
        System.out.println();
        System.out.println();
        if(vitoria){
            System.out.printf("O vencedor é: Jogador %d!", vencedor);
        }else{
            System.out.println("O jogo deu Velha! Não há vencedor.");
        }

    }
    public static void entradaDeValores(String xisOuBola){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a linha da posição: ");
        int linha = scanner.nextInt() - 1;
        System.out.print("Informe a coluna da posição: ");
        int coluna = scanner.nextInt() - 1;
        jogoDaVelha[linha][coluna] = xisOuBola;

    }

    public static void tabuleiro(){
        for(int i = 0; i < jogoDaVelha.length; i++){
            for(int j = 0; j < jogoDaVelha.length; j++){
                if(j == (jogoDaVelha.length - 1)){
                    if(i == (jogoDaVelha.length - 1)){
                        System.out.println(jogoDaVelha[i][j]);
                    }else{
                        System.out.println(jogoDaVelha[i][j]);
                        System.out.println("- - - - -");
                    }
                }else{
                    System.out.printf("%s | ", jogoDaVelha[i][j]);
                }
            }
        }

    }
    public static boolean verificadorLinha(int posicaoDaLinha){
        boolean vitoria;
        if(jogoDaVelha[posicaoDaLinha][0].equals(jogoDaVelha[posicaoDaLinha][1]) &
           jogoDaVelha[posicaoDaLinha][0].equals(jogoDaVelha[posicaoDaLinha][2])){
            if(jogoDaVelha[posicaoDaLinha][0].equals(" ")){
                vitoria = false;
            }else{
                vitoria = true;
            }
        }else{
            vitoria = false;
        }
    return vitoria;
    }

    public static boolean verificadorColuna(int posicaoDaColuna){
        boolean vitoria;
        if(jogoDaVelha[0][posicaoDaColuna].equals(jogoDaVelha[1][posicaoDaColuna]) &
           jogoDaVelha[0][posicaoDaColuna].equals(jogoDaVelha[2][posicaoDaColuna])){
            if(jogoDaVelha[0][posicaoDaColuna].equals(" ")){
                vitoria = false;
            }else{
                vitoria = true;
            }
        }else{
            vitoria = false;
        }
    return vitoria;
    }

    public static boolean verificadorDiagonal(int parametroDaDiagonal){
        boolean vitoria;
        if(parametroDaDiagonal % 2 == 0){
            if(jogoDaVelha[0][0].equals(jogoDaVelha[1][1]) &
               jogoDaVelha[0][0].equals(jogoDaVelha[2][2])){
                if(jogoDaVelha[0][0].equals(" ")){
                    vitoria = false;
                }else{
                    vitoria = true;
                }
            }else{
                vitoria = false;
            }
        }else{
            if(jogoDaVelha[0][2].equals(jogoDaVelha[1][1]) &
               jogoDaVelha[0][2].equals(jogoDaVelha[2][0])){
                if(jogoDaVelha[0][2].equals(" ")){
                    vitoria = false;
                }else{
                    vitoria = true;
                }
            }else{
                vitoria = false;
            }
        }
    return vitoria;
    }

}
