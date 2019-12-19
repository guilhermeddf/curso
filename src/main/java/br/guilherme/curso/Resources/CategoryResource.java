package br.guilherme.curso.Resources;

import br.guilherme.curso.Domain.Category;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

    @RequestMapping(method = RequestMethod.GET)
    public List<Category> list(){
        Category cat1 = new Category(1, "informatica");
        Category cat2 = new Category(2, "escritorio");

        List<Category> list = new ArrayList<>();
        list.add(cat1);
        list.add(cat2);


        return list;
    }

}
