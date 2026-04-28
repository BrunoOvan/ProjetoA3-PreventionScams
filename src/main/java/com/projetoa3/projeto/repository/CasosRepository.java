package com.projetoa3.projeto.repository;

import com.projetoa3.projeto.model.CasosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CasosRepository extends JpaRepository<CasosModel, Long> {
}