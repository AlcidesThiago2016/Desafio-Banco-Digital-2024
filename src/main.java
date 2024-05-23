public class main {
    public static void main(String[] args) {
        Cliente alcides = new Cliente();
        alcides.setNome("Alcides");

        Conta cc = new ContaCorrente(alcides);
        Conta pp = new ContaPoupanca(alcides);

        cc.depositar(100);
        cc.transferir(50, pp);

        cc.imprimirExtrato();
        pp.imprimirExtrato();
    }
}
