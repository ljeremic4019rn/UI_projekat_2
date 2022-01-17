package com.example.demo.repository;

import com.example.demo.model.Dezurstvo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface DezurstvoRepository extends JpaRepository<Dezurstvo, Long>, JpaSpecificationExecutor<Dezurstvo> {
}