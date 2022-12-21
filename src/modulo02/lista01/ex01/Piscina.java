package modulo02.lista01.ex01;

public class Piscina {
    double largura;
    double comprimento;
    double profundidade;

    public Piscina(double largura, double comprimento, double profundidade) {
        this.largura = largura;
        this.comprimento = comprimento;
        this.profundidade = profundidade;
    }

    double calcularVolume() {
        return largura * comprimento * profundidade;
    }

    public String toString() {
        return String.format("Piscina: %.2f, %.2f, %.2f.", largura, comprimento, profundidade);
    }

}
