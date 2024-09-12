import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criação dos cursos e mentorias
        Curso curso1 = new Curso("Curso Java", "descrição curso java", 8);

        Curso curso2 = new Curso("curso js", "descrição curso js", 4);

        Mentoria mentoria = new Mentoria("Mentoria java","descrição mentoria java",LocalDate.now());

        // Criação do Bootcamp e do Dev

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer","Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLeo = new Dev("Leo");
        devLeo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Leo: " + devLeo.getConteudosInscritos());
        devLeo.progredir();
        devLeo.progredir();
        System.out.println("Conteúdos ainda inscritos Leo: " + devLeo.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Leo: " + devLeo.getConteudosConcluidos());
        System.out.println("XP: " + devLeo.calcularXp());

        System.out.println("---------------");

        Dev devLucas = new Dev("Lucas");
        devLucas.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Lucas: " + devLucas.getConteudosInscritos());
        devLucas.progredir();
        System.out.println("Conteúdos ainda inscritos Lucas: " + devLucas.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Lucas: " + devLucas.getConteudosConcluidos());
        System.out.println("XP: " + devLucas.calcularXp());


    }
}