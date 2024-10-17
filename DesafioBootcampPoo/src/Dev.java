import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Atividade> listaAtividadesInscritas = new LinkedHashSet<>();
    private Set<Atividade> listaAtividadesConcluidas = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Atividade> getListaAtividadesInscritas() {
        return listaAtividadesInscritas;
    }

    public void setListaAtividadesInscritas(Set<Atividade> listaAtividadesInscritas) {
        this.listaAtividadesInscritas = listaAtividadesInscritas;
    }

    public Set<Atividade> getListaAtividadesConcluidas() {
        return listaAtividadesConcluidas;
    }

    public void setListaAtividadesConcluidas(Set<Atividade> listaAtividadesConcluidas) {
        this.listaAtividadesConcluidas = listaAtividadesConcluidas;
    }

    public void inscreverBootcamp(Bootcamp bootcamp) {
        bootcamp.getListaDevsInscritos().add(this);
        listaAtividadesInscritas.addAll(bootcamp.getListaAtividades());
    }

    public void progredir() {
        Optional<Atividade> atividade = this.listaAtividadesInscritas.stream().findFirst();
        if(atividade.isPresent()) {
            this.listaAtividadesConcluidas.add(atividade.get());
            this.listaAtividadesInscritas.remove(atividade.get());
        }
        else {
            System.err.println("Nenhum curso/mentoria inscrito!");
        }
    }

    public double calcularTotalXp() {
        if(!listaAtividadesConcluidas.isEmpty()) {
            return this.listaAtividadesConcluidas.stream().mapToDouble(Atividade::calcularXp).sum();
        }
        else {
            return 0;
        }
    }

    public void exibirAtividadesInscritas() {
        System.out.println(listaAtividadesInscritas);
    }

    public void exibirAtividadesConcluidas() {
        System.out.println(listaAtividadesConcluidas);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(listaAtividadesInscritas, dev.listaAtividadesInscritas) && Objects.equals(listaAtividadesConcluidas, dev.listaAtividadesConcluidas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, listaAtividadesInscritas, listaAtividadesConcluidas);
    }
}
