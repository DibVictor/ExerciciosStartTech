package modulo02.lista01.ex03;

public class Carta {
        String rank;
        String naipe;

        public Carta(String rank, String naipe) {
            this.rank = rank;
            this.naipe = naipe;
        }

        public String toString() {
            return String.format("%s de %s", rank, naipe);
        }
}
