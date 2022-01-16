package com.example.demo.repository;

import com.example.demo.model.Recept;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceptRepository extends JpaRepository<Recept, int>, JpaSpecificationExecutor<Recept> {
}