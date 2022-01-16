package com.example.demo.repository;

import com.example.demo.model.PrijemnaLista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface PrijemnaListaRepository extends JpaRepository<PrijemnaLista, int>, JpaSpecificationExecutor<PrijemnaLista> {
}