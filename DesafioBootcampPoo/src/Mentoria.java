import java.time.LocalDate;

public class Mentoria extends Atividade {
    private LocalDate dataMentoria;

    public Mentoria(String titulo, String descricao, LocalDate dataMentoria) {
        this.dataMentoria = dataMentoria;
        this.setTitulo(titulo);
        this.setDescricao(descricao);
    }

    public LocalDate getDataMentoria() {
        return dataMentoria;
    }

    public void setDataMentoria(LocalDate dataMentoria) {
        this.dataMentoria = dataMentoria;
    }

    @Override
    public double calcularXp() {
        return XPPADRAO;
    }

    @Override
    public String toString() {
        return "{Mentoria: " + getTitulo() +
                ", Descrição: " + getDescricao() +
                ", Data Mentoria: " + dataMentoria +
                '}';
    }
}
