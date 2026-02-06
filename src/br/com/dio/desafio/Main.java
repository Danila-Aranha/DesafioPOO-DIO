package br.com.dio.desafio;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Java Básico");
        cursoJava.setDescricao("Aprendendo POO na prática");
        cursoJava.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Tira dúvidas ao vivo");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Dominando POO com Java");
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(mentoria);

        Dev dev = new Dev();
        dev.setNome("Dan");
        dev.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos inscritos: " + dev.getConteudosInscritos());
        dev.progredir();
        System.out.println("Conteúdos concluídos: " + dev.getConteudosConcluidos());
        System.out.println("XP total: " + dev.calcularTotalXp());
    }
}
