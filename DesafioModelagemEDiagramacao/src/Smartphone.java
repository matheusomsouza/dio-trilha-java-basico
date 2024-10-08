public class Smartphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    public static void main(String[] args) {
    }

    @Override
    public void ligar(String numero) {
        System.out.println("LIGANDO PARA O NÚMERO " + numero);
    }

    @Override
    public void atender() {
        System.out.println("ATENDENDO LIGAÇÃO");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("EXIBINDO A PÁGINA " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ABRINDO NOVA ABA");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PÁGINA");
    }

    @Override
    public void tocar() {
        System.out.println("REPRODUZINDO MÚSICAS");
    }

    @Override
    public void pausar() {
        System.out.println("PAUSANDO A REPRODUÇÃO DE MÚSICAS");
    }

    @Override
    public void selecionarMusica(String nomeMusica) {
        System.out.println("REPRODUZINDO A MÚSICA " + nomeMusica);
    }
}
