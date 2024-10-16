public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Java");
        Cliente cliente2 = new Cliente("JavaJava");

        Conta conta1 = new ContaCorrente(cliente1);
        Conta conta2 = new ContaPoupanca(cliente1);
        Conta conta3 = new ContaCorrente(cliente2);

        conta1.depositar(500);
        conta1.transferir(250,conta2);
        conta1.sacar(100);

        conta1.extrato();
    }
}
