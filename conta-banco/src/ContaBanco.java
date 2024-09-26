import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        System.out.println("Por favor, digite o número da Agência!");
        Scanner leituraAgencia = new Scanner(System.in);
        String agencia = leituraAgencia.nextLine();

        System.out.println("Por favor, digite o número da Conta!");
        Scanner leituraNumero = new Scanner(System.in);
        int numero = leituraNumero.nextInt();

        System.out.println("Por favor, digite o nome do Cliente!");
        Scanner leituraNome = new Scanner(System.in);
        String nome = leituraNome.nextLine();

        System.out.println("Por favor, digite o saldo em Conta!");
        Scanner leituraSaldo = new Scanner(System.in);
        double saldo = leituraSaldo.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
