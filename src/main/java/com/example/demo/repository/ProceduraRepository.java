package com.example.demo.repository;

import com.example.demo.model.Procedura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ProceduraRepository extends JpaRepository<Procedura, int>, JpaSpecificationExecutor<Procedura> {
}