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

    /**
     * Lista todos os registros de casos/incidentes.
     * Método GET acessível em /api/Incidentes
     * @return Lista de todos os CasosModel cadastrados
     */
    @GetMapping
    public List<CasosModel> listar() {
        return service.listarTodas();
    }

    /**
     * Cria um novo registro de caso/incidente.
     * Método POST acessível em /api/Incidentes
     * @param Casos Objeto CasosModel contendo os dados do incidente
     * @return O CasosModel criado e salvo no banco de dados
     */
    @PostMapping
    public CasosModel criar(@RequestBody CasosModel Casos) {
        return service.registrar(Casos);
    }

    /**
     * Exclui um registro de caso/incidente pelo ID.
     * Método DELETE acessível em /api/Incidentes/{id}
     * @param id ID do registro a ser excluído
     */
    @DeleteMapping("/{id}")
public void deletar(@PathVariable Long id) {
    service.excluir(id);
}
@PutMapping("/{id}")
public CasosModel atualizar(@PathVariable Long id, @RequestBody CasosModel Casos) {
    return service.atualizar(id, Casos);
}
}