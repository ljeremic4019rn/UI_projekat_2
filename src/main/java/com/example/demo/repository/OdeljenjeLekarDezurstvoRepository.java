package com.example.demo.repository;

import com.example.demo.model.usless.OdeljenjeLekarDezurstvo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface OdeljenjeLekarDezurstvoRepository extends JpaRepository<OdeljenjeLekarDezurstvo, int>, JpaSpecificationExecutor<OdeljenjeLekarDezurstvo> {
}