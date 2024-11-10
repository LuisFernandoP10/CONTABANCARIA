package defaultContaBancaria;

public class Main {
    public static void main(String[] args) {
        // Criando uma instância do Banco com capacidade para 5 contas
        Banco banco = new Banco(5);  // Passando a capacidade para 5

        // Criando contas bancárias
        ContaBancaria conta1 = new ContaBancaria(101, "João", 1500.00);
        ContaBancaria conta2 = new ContaBancaria(102, "Maria", 2000.00);

        // Adicionando as contas ao banco
        banco.adicionarConta(conta1);
        banco.adicionarConta(conta2);

        // Exibindo o número das contas
        banco.exibirNumeroConta(0);  // Exibindo o número da conta da primeira posição
        banco.exibirNumeroConta(1);  // Exibindo o número da conta da segunda posição

        // Realizando operações bancárias
        conta1.depositar(500.00);
        conta1.sacar(200.00);
        conta1.transferir(conta2, 300.00);

        // Consultando saldo
        conta1.consultarSaldo();
        conta2.consultarSaldo();
    }
}
