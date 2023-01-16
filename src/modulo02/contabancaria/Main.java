package modulo02.contabancaria;


import modulo02.contabancaria.conta.Conta;
import modulo02.contabancaria.pessoa.Pessoa;

public class Main {
    public static void main(String[] args) {
                Pessoa pessoa = Interface.criarPessoa();
                Conta conta = Interface.criarConta();

                pessoa.setConta(conta);

                Interface.imprimirResumo(pessoa);
    }
}

