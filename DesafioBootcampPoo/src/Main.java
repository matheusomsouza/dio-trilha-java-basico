import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso algoritmos = new Curso("Algoritmos","Curso logica e algoritmos em programação",40);
        Curso javaBasico = new Curso("Java Basico","Curso de Java Basico Sintaxe",80);
        Mentoria mentoriaJava = new Mentoria("Java","Mentoria Java basico", LocalDate.now().plusDays(30));

        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setNome("Bootcamp Java Basico");
        bootcampJava.setDescricao("Bootcamp Java Basico e Algoritmos");
        bootcampJava.getListaAtividades().add(algoritmos);
        bootcampJava.getListaAtividades().add(javaBasico);
        bootcampJava.getListaAtividades().add(mentoriaJava);

        Dev devJrJava = new Dev();
        devJrJava.setNome("Dev Jr Java");
        devJrJava.inscreverBootcamp(bootcampJava);
        System.out.println("Contéudos Inscritos do Bootcamp " + bootcampJava.getNome() + ":");
        devJrJava.exibirAtividadesInscritas();
        devJrJava.progredir();
        devJrJava.progredir();
        System.out.println("Atividades Concluidas por " + devJrJava.getNome() + ":");
        devJrJava.exibirAtividadesConcluidas();
        System.out.println("Ainda faltam concluir:");
        devJrJava.exibirAtividadesInscritas();
        System.out.println(devJrJava.getNome() + " já possui " + devJrJava.calcularTotalXp() + " em xp!");

    }
}
