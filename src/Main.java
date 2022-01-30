
public class Main {

    public static void main(String[] args) {
        Cliente luis = new Cliente();
        luis.setNome("Luis");

        Conta cc = new ContaCorrente(luis);
        Conta poupanca = new ContaPoupanca(luis);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}