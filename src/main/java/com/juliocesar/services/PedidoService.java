package com.juliocesar.services;

import com.juliocesar.domain.Categoria;
import com.juliocesar.domain.Pedido;
import com.juliocesar.repositories.CategoriaRepository;
import com.juliocesar.repositories.PedidoRepository;
import com.juliocesar.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {

    //automaticamente instanciada pelo spring
    //Atibuto de uma classe, que depende de uma instancia para funcionar
    @Autowired
    private PedidoRepository repo;

    public Pedido buscar(Integer id){
        Optional<Pedido> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado " + "\nId: " + id + "\nTipo: " + Pedido.class.getName())) ;
    }
}
