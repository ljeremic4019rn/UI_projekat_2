package com.example.demo.controller;

import com.example.demo.dto.SestraProceduraDto;
import com.example.demo.service.SestraProceduraService;
import com.sun.tools.javac.util.DefinedBy.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/sestra-procedura")
@RestController
@Slf4j
@Api("sestra-procedura")
public class SestraProceduraController {
    private final SestraProceduraService sestraProceduraService;

    public SestraProceduraController(SestraProceduraService sestraProceduraService) {
        this.sestraProceduraService = sestraProceduraService;
    }

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody @Validated SestraProceduraDto sestraProceduraDto) {
        sestraProceduraService.save(sestraProceduraDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<SestraProceduraDto> findById(@PathVariable("id") int id) {
        SestraProceduraDto sestraProcedura = sestraProceduraService.findById(id);
        return ResponseEntity.ok(sestraProcedura);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") int id) {
        sestraProceduraService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/page-query")
    public ResponseEntity<Page<SestraProceduraDto>> pageQuery(SestraProceduraDto sestraProceduraDto, @PageableDefault(sort = "createAt", direction = Sort.Direction.DESC) Pageable pageable) {
        Page<SestraProceduraDto> sestraProceduraPage = sestraProceduraService.findByCondition(sestraProceduraDto, pageable);
        return ResponseEntity.ok(sestraProceduraPage);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@RequestBody @Validated SestraProceduraDto sestraProceduraDto, @PathVariable("id") int id) {
        sestraProceduraService.update(sestraProceduraDto, id);
        return ResponseEntity.ok().build();
    }
}