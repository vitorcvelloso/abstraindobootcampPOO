import java.time.LocalDate;

import br.com.dio.desafio.campos.Bootcamp;
import br.com.dio.desafio.campos.Curso;
import br.com.dio.desafio.campos.Dev;
import br.com.dio.desafio.campos.Mentoria;

public class Poo {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descriçao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descriçao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*
         * System.out.println(curso1);
         * System.out.println(curso2);
         * System.out.println(mentoria);
         */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDouglas = new Dev();
        devDouglas.setNome("Douglas");
        devDouglas.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devDouglas.getConteudosInscritos());
        devDouglas.progredir();
        devDouglas.progredir();
        devDouglas.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos" + devDouglas.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + devDouglas.getConteudosConcluidos());
        System.out.println("XP" + devDouglas.calcularTotalXp());

        System.out.println("----------------");

        Dev devPadua = new Dev();
        devPadua.setNome("Padua");
        devPadua.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devPadua.getConteudosInscritos());
        devPadua.progredir();
        devPadua.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos" + devPadua.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + devPadua.getConteudosConcluidos());
        System.out.println("XP" + devPadua.calcularTotalXp());

    }
}
