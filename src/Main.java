public class Main {
    public static void main(String[] args) {
        Cliente matheus = new Cliente();
        matheus.setNome("Matheus");

        Conta corrente = new ContaCorrente(matheus);
        corrente.depositar(100);

        Conta poupanca = new ContaPoupança(matheus);

        corrente.transferir(100, poupanca);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
