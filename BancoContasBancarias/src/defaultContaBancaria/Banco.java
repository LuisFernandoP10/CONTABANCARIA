package defaultContaBancaria;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private ContaBancaria[] contas;
    private int numeroDeContas;

    // Construtor que espera a capacidade máxima de contas
    public Banco(int capacidade) {
        contas = new ContaBancaria[capacidade];
        numeroDeContas = 0;
    }

    // Método para adicionar uma conta
    public void adicionarConta(ContaBancaria conta) {
        if (numeroDeContas < contas.length) {
            contas[numeroDeContas] = conta;
            numeroDeContas++;
        } else {
            System.out.println("Não há espaço para mais contas.");
        }
    }

    // Método para exibir o número de uma conta com base no índice
    public void exibirNumeroConta(int indice) {
        if (indice >= 0 && indice < numeroDeContas) {
            System.out.println("Número da Conta: " + contas[indice].getNumeroConta());
        } else {
            System.out.println("Índice inválido.");
        }
    }
}