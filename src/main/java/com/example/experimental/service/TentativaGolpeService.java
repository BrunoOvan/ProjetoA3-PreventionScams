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
}