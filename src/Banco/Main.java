package Banco;

public class Main {
    public static void main(String[] args) {

        Cliente karollyne = new Cliente();
        karollyne.setNome("Karollyne");

        Conta cc = new ContaCorrente(karollyne);
        Conta poupanca = new ContaPoupanca(karollyne);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
