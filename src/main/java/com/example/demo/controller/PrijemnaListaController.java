package com.example.demo.controller;

import com.example.demo.dto.PrijemnaListaDto;
import com.example.demo.service.PrijemnaListaService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/prijemna-lista")
@RestController

public class PrijemnaListaController {
    private final PrijemnaListaService prijemnaListaService;

    public PrijemnaListaController(PrijemnaListaService prijemnaListaService) {
        this.prijemnaListaService = prijemnaListaService;
    }

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody @Validated PrijemnaListaDto prijemnaListaDto) {
        prijemnaListaService.save(prijemnaListaDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PrijemnaListaDto> findById(@PathVariable("id") Long id) {
        PrijemnaListaDto prijemnaLista = prijemnaListaService.findById(id);
        return ResponseEntity.ok(prijemnaLista);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        prijemnaListaService.deleteById(id);
        return ResponseEntity.ok().build();
    }

//    @GetMapping("/page-query")
//    public ResponseEntity<Page<PrijemnaListaDto>> pageQuery(PrijemnaListaDto prijemnaListaDto, @PageableDefault(sort = "createAt", direction = Sort.Direction.DESC) Pageable pageable) {
//        Page<PrijemnaListaDto> prijemnaListaPage = prijemnaListaService.findByCondition(prijemnaListaDto, pageable);
//        return ResponseEntity.ok(prijemnaListaPage);
//    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@RequestBody @Validated PrijemnaListaDto prijemnaListaDto, @PathVariable("id") Long id) {
        prijemnaListaService.update(prijemnaListaDto, id);
        return ResponseEntity.ok().build();
    }
}