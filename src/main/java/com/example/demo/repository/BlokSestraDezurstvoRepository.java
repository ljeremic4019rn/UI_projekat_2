package com.example.demo.repository;

import com.example.demo.model.usless.BlokSestraDezurstvo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface BlokSestraDezurstvoRepository extends JpaRepository<BlokSestraDezurstvo, int>, JpaSpecificationExecutor<BlokSestraDezurstvo> {
}