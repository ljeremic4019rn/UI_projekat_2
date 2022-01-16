package com.example.demo.repository;

import com.example.demo.model.Osiguranje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface OsiguranjeRepository extends JpaRepository<Osiguranje, int>, JpaSpecificationExecutor<Osiguranje> {
}