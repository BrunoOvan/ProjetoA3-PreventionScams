package com.projetoa3.projeto.controller;

import com.projetoa3.projeto.model.CasosModel;
import com.projetoa3.projeto.service.CasosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Incidentes")
public class CasosController {

    @Autowired
    private CasosService service;

    @GetMapping
    public List<CasosModel> listar() {
        return service.listarTodas();
    }

    @PostMapping
    public CasosModel criar(@RequestBody CasosModel Casos) {
        return service.registrar(Casos);
    }
    @DeleteMapping("/{id}")
public void deletar(@PathVariable Long id) {
    service.excluir(id);
}
@PutMapping("/{id}")
public CasosModel atualizar(@PathVariable Long id, @RequestBody CasosModel Casos) {
    return service.atualizar(id, Casos);
}
}