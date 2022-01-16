package com.example.demo.controller;

import com.example.demo.dto.PrijemnaListaDto;
import com.example.demo.mapper.PrijemnaListaMapper;
import com.example.demo.model.PrijemnaLista;
import com.example.demo.service.PrijemnaListaService;
import com.sun.tools.javac.util.DefinedBy.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequestMapping("/prijemna-lista")
@RestController
@Slf4j
@Api("prijemna-lista")
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
    public ResponseEntity<PrijemnaListaDto> findById(@PathVariable("id") int id) {
        PrijemnaListaDto prijemnaLista = prijemnaListaService.findById(id);
        return ResponseEntity.ok(prijemnaLista);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") int id) {
        prijemnaListaService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/page-query")
    public ResponseEntity<Page<PrijemnaListaDto>> pageQuery(PrijemnaListaDto prijemnaListaDto, @PageableDefault(sort = "createAt", direction = Sort.Direction.DESC) Pageable pageable) {
        Page<PrijemnaListaDto> prijemnaListaPage = prijemnaListaService.findByCondition(prijemnaListaDto, pageable);
        return ResponseEntity.ok(prijemnaListaPage);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@RequestBody @Validated PrijemnaListaDto prijemnaListaDto, @PathVariable("id") int id) {
        prijemnaListaService.update(prijemnaListaDto, id);
        return ResponseEntity.ok().build();
    }
}