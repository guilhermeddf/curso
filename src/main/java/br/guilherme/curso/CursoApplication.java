package br.guilherme.curso;

import br.guilherme.curso.domain.Category;
import br.guilherme.curso.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class CursoApplication implements CommandLineRunner {
	@Autowired
	private CategoryRepository categoryRepository;

	public static void main(String[] args)  {
		SpringApplication.run(CursoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category cat1 = new Category(1, "Informatica");
		Category cat2 = new Category(2, "Escritorio");
		categoryRepository.saveAll(Arrays.asList(cat1,cat2));

		
	}
}
