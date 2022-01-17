package com.example.demo.repository;

import com.example.demo.model.CovidLista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface CovidListaRepository extends JpaRepository<CovidLista, Long>, JpaSpecificationExecutor<CovidLista> {
}