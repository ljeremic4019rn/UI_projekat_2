package com.example.demo.repository;

import com.example.demo.model.Soba;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface SobaRepository extends JpaRepository<Soba, int>, JpaSpecificationExecutor<Soba> {
}