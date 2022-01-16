package com.example.demo.repository;

import com.example.demo.model.Blok;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface BlokRepository extends JpaRepository<Blok, Long>, JpaSpecificationExecutor<Blok> {
}