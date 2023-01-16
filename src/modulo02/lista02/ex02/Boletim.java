package modulo02.lista02.ex02;

public class Boletim {
    private String nomeDoAluno;
    private double[] notas;

    public Boletim(String nome, double[] notas) {
        this.nomeDoAluno = nome;
        this.notas = notas;
    }

    public String getNomeDoAluno() {
        return nomeDoAluno;
    }

    public void setNomeDoAluno(String nomeDoAluno) {
        this.nomeDoAluno = nomeDoAluno;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
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
