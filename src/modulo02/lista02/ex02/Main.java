package modulo02.lista02.ex02;

import utils.Leitor;

public class Main {
    private final static int quantidadeAlunos = 3;
    private final static int quantidadeNotas = 3;

    public static void main(String[] args) {
        Boletim[] boletins = new Boletim[quantidadeAlunos];
        Leitor leitor = new Leitor();

        for(int i = 0; i < quantidadeAlunos; i++){
            String nome = leitor.lerString("Digite o nome do aluno: ");
            double[] notas = new double[quantidadeNotas];
            for(int j = 0; j < quantidadeNotas; j++){
                String msg = "Digite a" + j + "ª nota do aluno: ";
                notas[j] = leitor.lerDecimal(msg);
            }
            boletins[i] = new Boletim(nome, notas);
        }

        for(Boletim boletim : boletins) {
            System.out.printf("%s teve a média %.2f.\n", boletim.getNomeDoAluno(), boletim.calcularMedia());
        }
    }
}
