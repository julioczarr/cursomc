package com.juliocesar.services;

import com.juliocesar.domain.Cliente;
import com.juliocesar.repositories.ClienteRepository;
import com.juliocesar.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    //automaticamente instanciada pelo spring
    //Atibuto de uma classe, que depende de uma instancia para funcionar
    @Autowired
    private ClienteRepository repo;

    public Cliente buscar(Integer id){
        Optional<Cliente> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado " + "\nId: " + id + "\nTipo: " + Cliente.class.getName())) ;
    }
}
