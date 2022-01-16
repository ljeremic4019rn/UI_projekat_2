package com.example.demo.repository;

import com.example.demo.model.ObukaProcedure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ObukaProcedureRepository extends JpaRepository<ObukaProcedure, int>, JpaSpecificationExecutor<ObukaProcedure> {
}