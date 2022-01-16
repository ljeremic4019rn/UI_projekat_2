package com.example.demo.repository;

import com.example.demo.model.Bolnica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ZaposleniRepository extends JpaRepository<Bolnica, int>, JpaSpecificationExecutor<Bolnica> {
}