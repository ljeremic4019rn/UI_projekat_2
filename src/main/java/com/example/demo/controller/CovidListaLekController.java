package com.example.demo.controller;

import com.example.demo.dto.CovidListaLekDto;
import com.example.demo.service.CovidListaLekService;
import com.sun.tools.javac.util.DefinedBy.Api;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/covid-lista-lek")
@RestController
@Slf4j
@Api("covid-lista-lek")
public class CovidListaLekController {
    private final CovidListaLekService covidListaLekService;

    public CovidListaLekController(CovidListaLekService covidListaLekService) {
        this.covidListaLekService = covidListaLekService;
    }

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody @Validated CovidListaLekDto covidListaLekDto) {
        covidListaLekService.save(covidListaLekDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CovidListaLekDto> findById(@PathVariable("id") int id) {
        CovidListaLekDto covidListaLek = covidListaLekService.findById(id);
        return ResponseEntity.ok(covidListaLek);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") int id) {
        covidListaLekService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/page-query")
    public ResponseEntity<Page<CovidListaLekDto>> pageQuery(CovidListaLekDto covidListaLekDto, @PageableDefault(sort = "createAt", direction = Sort.Direction.DESC) Pageable pageable) {
        Page<CovidListaLekDto> covidListaLekPage = covidListaLekService.findByCondition(covidListaLekDto, pageable);
        return ResponseEntity.ok(covidListaLekPage);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@RequestBody @Validated CovidListaLekDto covidListaLekDto, @PathVariable("id") int id) {
        covidListaLekService.update(covidListaLekDto, id);
        return ResponseEntity.ok().build();
    }
}