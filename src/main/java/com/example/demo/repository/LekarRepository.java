package com.example.demo.repository;

import com.example.demo.model.Lekar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface LekarRepository extends JpaRepository<Lekar, Long>, JpaSpecificationExecutor<Lekar> {
}