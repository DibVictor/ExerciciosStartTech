package modulo02.lista01.ex03;

import java.util.Random;

public class Baralho {
    String[] naipes = {"Copas", "Espadas", "Paus", "Ouros"};
    String[] ranks = {"Ás", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};
    int quantidadeCartas = 52;

    Carta[] cartas = new Carta[quantidadeCartas];
    Random sorteador = new Random();

    public Baralho() {
        int i = 0;

        for(String rank : ranks) {
            for(String naipe : naipes) {
                Carta carta = new Carta(rank, naipe);
                cartas[i] = carta;
                i++;
            }
        }
    }

    public Carta sortear() {
        int i = sorteador.nextInt(0, quantidadeCartas + 1);

        return cartas[i];
    }
}
