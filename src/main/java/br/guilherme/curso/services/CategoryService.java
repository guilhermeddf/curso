package br.guilherme.curso.services;

import br.guilherme.curso.domain.Category;
import br.guilherme.curso.repositories.CategoryRepository;
import br.guilherme.curso.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public Category search(Integer id){
        Optional<Category> category = categoryRepository.findById(id);
        return category.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! ID: " + id + ", Tipo: " + Category.class.getName() ));
    }

}
