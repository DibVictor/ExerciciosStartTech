package modulo02.lista02.ex01;

public class Piscina {
    private double largura;
    private double comprimento;
    private double profundidade;

    public Piscina(double largura, double comprimento, double profundidade) {
        this.largura = largura;
        this.comprimento = comprimento;
        this.profundidade = profundidade;
    }

    public double getLargura() {
        return largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public double getProfundidade() {
        return profundidade;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public void setProfundidade(double profundidade) {
        this.profundidade = profundidade;
    }

    double calcularVolume() {
        return largura * comprimento * profundidade;
    }

    public String toString() {
        return String.format("Piscina: %.2f, %.2f, %.2f.", largura, comprimento, profundidade);
    }

}
