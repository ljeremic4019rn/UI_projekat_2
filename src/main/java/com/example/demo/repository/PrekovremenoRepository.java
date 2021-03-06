package com.example.demo.repository;

import com.example.demo.model.Prekovremeno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface PrekovremenoRepository extends JpaRepository<Prekovremeno, Long>, JpaSpecificationExecutor<Prekovremeno> {
}