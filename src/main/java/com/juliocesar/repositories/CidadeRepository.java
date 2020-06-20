package com.juliocesar.repositories;

import com.juliocesar.domain.Categoria;
import com.juliocesar.domain.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//jpa identificar qual é entidade que você vai recuperar do banco, qual tipo da chave primaria
@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

}
