import java.util.ArrayList;
import java.util.List;

public abstract class Conta implements Iconta{
    protected Cliente cliente;
    protected int agencia;
    protected int numeroConta;
    protected double saldo = 0;
    private static int SEQUENCIAL = 1;
    List<String> listaMovimentacoes = new ArrayList<>();

    public Conta(Cliente cliente) {
        this.cliente = cliente;
        this.agencia = 1;
        this.numeroConta = SEQUENCIAL++;
    }

    @Override
    public void sacar(double valorSaque) {
        saldo -= valorSaque;
        listaMovimentacoes.add("Valor Sacado: " + valorSaque);
    }

    @Override
    public void depositar(double valorDeposito) {
        saldo += valorDeposito;
        listaMovimentacoes.add("Valor Depositado: " + valorDeposito);
    }

    @Override
    public void transferir(double valorTransferencia, Conta contaDestino) {
        saldo -= valorTransferencia;
        contaDestino.depositar(valorTransferencia);
        listaMovimentacoes.add("Valor Transferido: " + valorTransferencia + " Para " + contaDestino.cliente.getNome());
    }

    @Override
    public void extrato() {
        System.out.println("********** EXTRATO **********");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Agencia: " + agencia);
        System.out.println("Número Conta: " + numeroConta);
        System.out.println("********** MOVIMENTAÇÕES **********");
        System.out.println(listaMovimentacoes);
        System.out.println("********** SALDO **********");
        System.out.println("Saldo: " + saldo);
        System.out.println("***************************");
        System.out.println(" ");
    }
}
