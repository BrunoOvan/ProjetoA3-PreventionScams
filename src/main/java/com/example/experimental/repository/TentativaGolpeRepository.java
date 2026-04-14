package com.example.experimental.repository;

import com.example.experimental.model.TentativaGolpe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TentativaGolpeRepository extends JpaRepository<TentativaGolpe, Long> {
}