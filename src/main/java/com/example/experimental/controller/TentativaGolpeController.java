package com.example.experimental.controller;

import com.example.experimental.model.TentativaGolpe;
import com.example.experimental.service.TentativaGolpeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/golpes")
public class TentativaGolpeController {

    @Autowired
    private TentativaGolpeService service;

    @GetMapping
    public List<TentativaGolpe> listar() {
        return service.listarTodas();
    }

    @PostMapping
    public TentativaGolpe criar(@RequestBody TentativaGolpe tentativa) {
        return service.registrar(tentativa);
    }
}