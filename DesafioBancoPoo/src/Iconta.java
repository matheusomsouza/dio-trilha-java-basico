public interface Iconta {
    public void sacar(double valorSaque);

    public void depositar(double valorDeposito);

    public void transferir(double valorTransferencia, Conta contaDestino);

    public void extrato();
}
