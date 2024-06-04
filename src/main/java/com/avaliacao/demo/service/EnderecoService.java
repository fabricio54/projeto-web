package com.avaliacao.demo.service;

import com.avaliacao.demo.model.Endereco;
import com.avaliacao.demo.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    public List<Endereco> getAllEnderecos() {
        return enderecoRepository.findAll();
    }

    public Endereco getEnderecoById(Integer id) {
        Optional<Endereco> optionalEndereco = enderecoRepository.findById(id);
        return optionalEndereco.orElse(null);
    }

    public Endereco saveEndereco(Endereco endereco) {
        return enderecoRepository.save(endereco);
    }

    public Endereco updateEndereco(Integer id, Endereco enderecoDetails) {
        Endereco endereco = getEnderecoById(id);
        if (endereco != null) {
            endereco.setRua(enderecoDetails.getRua());
            endereco.setNumero(enderecoDetails.getNumero());
            endereco.setCep(enderecoDetails.getCep());
            endereco.setCidade(enderecoDetails.getCidade());
            endereco.setEstado(enderecoDetails.getEstado());
            endereco.setPais(enderecoDetails.getPais());
            return enderecoRepository.save(endereco);
        }
        return null;
    }

    public void deleteEndereco(Integer id) {
        enderecoRepository.deleteById(id);
    }
}
