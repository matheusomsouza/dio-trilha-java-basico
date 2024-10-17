import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicio = LocalDate.now();
    private final LocalDate dataConclusao = dataInicio.plusDays(60);
    private Set<Atividade> listaAtividades = new LinkedHashSet<>();
    private Set<Dev> listaDevsInscritos = new HashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Set<Atividade> getListaAtividades() {
        return listaAtividades;
    }

    public void setListaAtividades(Set<Atividade> listaAtividades) {
        this.listaAtividades = listaAtividades;
    }

    public Set<Dev> getListaDevsInscritos() {
        return listaDevsInscritos;
    }

    public void setListaDevsInscritos(Set<Dev> listaDevsInscritos) {
        this.listaDevsInscritos = listaDevsInscritos;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataConclusao() {
        return dataConclusao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dataInicio, bootcamp.dataInicio) && Objects.equals(dataConclusao, bootcamp.dataConclusao) && Objects.equals(listaAtividades, bootcamp.listaAtividades) && Objects.equals(listaDevsInscritos, bootcamp.listaDevsInscritos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicio, dataConclusao, listaAtividades, listaDevsInscritos);
    }
}
