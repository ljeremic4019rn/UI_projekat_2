package com.example.demo.repository;

import com.example.demo.model.Lek;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface LekRepository extends JpaRepository<Lek, Long>, JpaSpecificationExecutor<Lek> {
}