package com.example.demo.repository;

import com.example.demo.model.Sestra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface SestraRepository extends JpaRepository<Sestra, Long>, JpaSpecificationExecutor<Sestra> {
}