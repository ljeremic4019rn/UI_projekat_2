package com.example.demo.controller;

import com.example.demo.dto.CovidListaDto;
import com.example.demo.service.CovidListaService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/covid-lista")
@RestController

public class CovidListaController {
    private final CovidListaService covidListaService;

    public CovidListaController(CovidListaService covidListaService) {
        this.covidListaService = covidListaService;
    }

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody @Validated CovidListaDto covidListaDto) {
        covidListaService.save(covidListaDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CovidListaDto> findById(@PathVariable("id") Long id) {
        CovidListaDto covidLista = covidListaService.findById(id);
        return ResponseEntity.ok(covidLista);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        covidListaService.deleteById(id);
        return ResponseEntity.ok().build();
    }
//
//    @GetMapping("/page-query")
//    public ResponseEntity<Page<CovidListaDto>> pageQuery(CovidListaDto covidListaDto, @PageableDefault(sort = "createAt", direction = Sort.Direction.DESC) Pageable pageable) {
//        Page<CovidListaDto> covidListaPage = covidListaService.findByCondition(covidListaDto, pageable);
//        return ResponseEntity.ok(covidListaPage);
//    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@RequestBody @Validated CovidListaDto covidListaDto, @PathVariable("id") Long id) {
        covidListaService.update(covidListaDto, id);
        return ResponseEntity.ok().build();
    }
}