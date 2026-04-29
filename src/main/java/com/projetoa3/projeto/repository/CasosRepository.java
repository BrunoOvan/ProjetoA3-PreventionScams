package com.projetoa3.projeto.repository;

import com.projetoa3.projeto.model.CasosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositório de dados para a entidade CasosModel.
 * Fornece métodos de acesso ao banco de dados através do JpaRepository.
 * A tabela associada é "tb_registros".
 */
@Repository
public interface CasosRepository extends JpaRepository<CasosModel, Long> {
}