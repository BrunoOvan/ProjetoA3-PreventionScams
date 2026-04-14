package com.example.experimental.service;

import com.example.experimental.model.TentativaGolpe;
import com.example.experimental.repository.TentativaGolpeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TentativaGolpeService {

    @Autowired
    private TentativaGolpeRepository repository;

    public List<TentativaGolpe> listarTodas() {
        return repository.findAll();
    }

    public TentativaGolpe registrar(TentativaGolpe tentativa) {
        return repository.save(tentativa);
    }
    public void excluir(Long id) {
    repository.deleteById(id);
}
public TentativaGolpe atualizar(Long id, TentativaGolpe dadosAtualizados) {
    return repository.findById(id).map(registro -> {
        registro.setNomePrefeitura(dadosAtualizados.getNomePrefeitura());
        registro.setTipoGolpe(dadosAtualizados.getTipoGolpe());
        registro.setDescricao(dadosAtualizados.getDescricao());
        return repository.save(registro);
    }).orElseThrow(() -> new RuntimeException("Registro não encontrado!"));
}
}