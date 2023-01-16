package modulo02.lista01.ex02;

public class Boletim {
    String nomeDoAluno;
    double[] notas;

    public Boletim(String nome, double[] notas) {
        this.nomeDoAluno = nome;
        this.notas = notas;
    }

    public double calcularMedia() {
        double soma = 0;

        for (double nota : notas) {
            soma += nota;
        }
        return soma;
    }
}
