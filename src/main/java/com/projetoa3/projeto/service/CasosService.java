package com.projetoa3.projeto.service;

import com.projetoa3.projeto.model.CasosModel;
import com.projetoa3.projeto.repository.CasosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CasosService {

    @Autowired
    private CasosRepository repository;

    public List<CasosModel> listarTodas() {
        return repository.findAll();
    }

    public CasosModel registrar(CasosModel indices) {
        return repository.save(indices);
    }
    public void excluir(Long id) {
    repository.deleteById(id);
}
public CasosModel atualizar(Long id, CasosModel dadosAtualizados) {
    return repository.findById(id).map(registro -> {
        registro.setNomePrefeitura(dadosAtualizados.getNomePrefeitura());
        registro.setTipoGolpe(dadosAtualizados.getTipoGolpe());
        registro.setDescricao(dadosAtualizados.getDescricao());
        return repository.save(registro);
    }).orElseThrow(() -> new RuntimeException("Registro não encontrado!"));
}
}