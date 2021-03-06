package com.example.demo.repository;

import com.example.demo.model.Odeljenje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface OdeljenjeRepository extends JpaRepository<Odeljenje, Long>, JpaSpecificationExecutor<Odeljenje> {
}