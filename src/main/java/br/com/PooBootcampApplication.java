package br.com;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.domain.Curso;
import br.com.domain.Mentoria;

@SpringBootApplication
public class PooBootcampApplication {

	public static void main(String[] args) {
		SpringApplication.run(PooBootcampApplication.class, args);
		
		Curso curso = new Curso();
		curso.setTitulo("Curso Java");
		curso.setDescricao("Curso de Programação Java");
		curso.setCargaHoraria(40);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria POO");
		mentoria.setDescricao("Mentoria de Orientação a Objetos");
		mentoria.setDataMentoria(LocalDate.now());
		
		System.out.println(curso);
		System.out.println(mentoria);
	}

}