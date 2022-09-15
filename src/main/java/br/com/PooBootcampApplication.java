package br.com;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.domain.Bootcamp;
import br.com.domain.Curso;
import br.com.domain.Dev;
import br.com.domain.Mentoria;

@SpringBootApplication
public class PooBootcampApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(PooBootcampApplication.class, args);
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Introdução Java");
		curso1.setDescricao("Introdução a Programação Java");
		curso1.setCargaHoraria(15);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso Java OO");
		curso2.setDescricao("Programação Orientada a Objetos Java");
		curso2.setCargaHoraria(30);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria POO");
		mentoria.setDescricao("Mentoria de Orientação a Objetos");
		mentoria.setDataMentoria(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Experience");
		bootcamp.setDescricao("Bootcamp com Java e Spring");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev dev1 = new Dev();
		dev1.setNome("Anderson");
		dev1.inscreverBootcamp(bootcamp);
		dev1.progredir();
		
		System.out.println(bootcamp);
		System.out.println(curso1);
		System.out.println(mentoria);
		System.out.println(dev1);
		
		//Conteudo conteudo = new Conteudo();
		//Conteudo conteudo1 = new Curso();
		//Conteudo conteudo2 = new Mentoria();
	}

}