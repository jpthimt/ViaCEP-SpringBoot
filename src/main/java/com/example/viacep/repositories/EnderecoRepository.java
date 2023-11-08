package com.example.viacep.repositories;

import com.example.viacep.entidies.Endereco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository  extends CrudRepository<Endereco, Long> {
}
