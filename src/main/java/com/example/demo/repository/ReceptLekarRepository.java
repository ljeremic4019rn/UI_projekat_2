package com.example.demo.repository;

import com.example.demo.model.usless.ReceptLekar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceptLekarRepository extends JpaRepository<ReceptLekar, int>, JpaSpecificationExecutor<ReceptLekar> {
}