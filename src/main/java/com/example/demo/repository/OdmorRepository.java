package com.example.demo.repository;

import com.example.demo.model.Odmor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface OdmorRepository extends JpaRepository<Odmor, int>, JpaSpecificationExecutor<Odmor> {
}