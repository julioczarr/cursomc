package com.juliocesar.services;

import com.juliocesar.domain.Categoria;
import com.juliocesar.repositories.CategoriaRepository;
import com.juliocesar.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    //automaticamente instanciada pelo spring
    //Atibuto de uma classe, que depende de uma instancia para funcionar
    @Autowired
    private CategoriaRepository repo;

    public Categoria buscar(Integer id){
        Optional<Categoria> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado " + "\nId: " + id + "\nTipo: " + Categoria.class.getName())) ;
    }
}
