import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int primeiroNum = leitura.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int segundoNum = leitura.nextInt();
        try {
            verificarContador(primeiroNum,segundoNum);
        }catch (ParametrosInvalidosException e) {
            System.out.println("O primeiro parâmetro deve ser menor que o segundo parâmetro!");
            e.printStackTrace();
        }
    }

    public static void verificarContador(int primeiroNum, int segundoNum) throws ParametrosInvalidosException {
        if(primeiroNum > segundoNum) {
            throw new ParametrosInvalidosException();
        }
        int contador = segundoNum - primeiroNum;
        for(int i = 1; i <= contador; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
