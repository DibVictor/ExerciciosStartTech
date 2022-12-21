public class Exemplo {
    public static void main(String[] args) {
        String[] cesta = {"banana", "maçã", "uva", "morango", "limão",
                "pêra", "cereja", "uva", "framboesa", "melancia"};
        int posicao1 = 0;
        int posicao2 = 0;

        for(int I = 0; I < cesta.length; I++){
            for(int J = I + 1; J < cesta.length; J++) {
                if (cesta[I].equals(cesta[J])) {
                    posicao1 = I;
                    posicao2 = J;
                }
            }
        }

        System.out.printf("posição %d e posição %d se repetem.", posicao1, posicao2);
    }
}
