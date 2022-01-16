package com.example.demo.repository;

import com.example.demo.model.usless.LekRecept;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface LekReceptRepository extends JpaRepository<LekRecept, int>, JpaSpecificationExecutor<LekRecept> {
}