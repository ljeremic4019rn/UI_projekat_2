package com.example.demo.repository;

import com.example.demo.model.Racunovodja;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface RacunovodjaRepository extends JpaRepository<Racunovodja, int>, JpaSpecificationExecutor<Racunovodja> {
}