package com.example.demo.repository;

import com.example.demo.model.Dijagonza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface DijagonzaRepository extends JpaRepository<Dijagonza, Long>, JpaSpecificationExecutor<Dijagonza> {
}