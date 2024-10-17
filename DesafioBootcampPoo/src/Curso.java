public class Curso extends Atividade {
    private double cargaHoraria;

    public Curso(String titulo, String descricao, double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
        this.setTitulo(titulo);
        this.setDescricao(descricao);
    }

    public double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXp() {
        return cargaHoraria * XPPADRAO;
    }

    @Override
    public String toString() {
        return "{Curso: " + getTitulo() +
                ", Descrição: " + getDescricao() +
                "Carga Horaria: " + cargaHoraria +
                '}';
    }
}
