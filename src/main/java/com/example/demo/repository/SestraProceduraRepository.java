package com.example.demo.repository;

import com.example.demo.model.usless.SestraProcedura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface SestraProceduraRepository extends JpaRepository<SestraProcedura, int>, JpaSpecificationExecutor<SestraProcedura> {
}