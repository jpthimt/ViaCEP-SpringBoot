package com.example.viacep.controllers;

import com.example.viacep.entidies.Endereco;
import com.example.viacep.repositories.EnderecoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class EnderecoController {
    private final EnderecoRepository enderecoRepository;

    public EnderecoController(EnderecoRepository enderecoRepository) {
        this.enderecoRepository = enderecoRepository;
    }

    @GetMapping("/enderecos")
    public List<Endereco> getEnderecos(){
        return (List<Endereco>) enderecoRepository.findAll();
    }

    @PostMapping("/enderecos")
    void addEndereco(@RequestBody Endereco endereco){
        enderecoRepository.save(endereco);
        System.out.println("Endereço salvo com sucesso!\n" +
                "CEP: " + endereco.getCep() + "\n" +
                "Logradouro: " + endereco.getLogradouro());
    }
}
