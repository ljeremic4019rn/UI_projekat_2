package com.example.demo.repository;

import com.example.demo.model.usless.PacijentLek;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface PacijentLekRepository extends JpaRepository<PacijentLek, int>, JpaSpecificationExecutor<PacijentLek> {
}