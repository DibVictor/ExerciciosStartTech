package modulo02.lista02.ex03;

public class Carta {
        private final String rank;
        private final String naipe;

        public Carta(String rank, String naipe) {
            this.rank = rank;
            this.naipe = naipe;
        }

        public String toString() {
            return String.format("%s de %s", rank, naipe);
        }
}
