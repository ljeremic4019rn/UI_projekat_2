package com.example.demo.controller;

import com.example.demo.dto.ProceduraDto;
import com.example.demo.service.ProceduraService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/procedura")
@RestController

public class ProceduraController {
    private final ProceduraService proceduraService;

    public ProceduraController(ProceduraService proceduraService) {
        this.proceduraService = proceduraService;
    }

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody @Validated ProceduraDto proceduraDto) {
        proceduraService.save(proceduraDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProceduraDto> findById(@PathVariable("id") Long id) {
        ProceduraDto procedura = proceduraService.findById(id);
        return ResponseEntity.ok(procedura);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        proceduraService.deleteById(id);
        return ResponseEntity.ok().build();
    }
//
//    @GetMapping("/page-query")
//    public ResponseEntity<Page<ProceduraDto>> pageQuery(ProceduraDto proceduraDto, @PageableDefault(sort = "createAt", direction = Sort.Direction.DESC) Pageable pageable) {
//        Page<ProceduraDto> proceduraPage = proceduraService.findByCondition(proceduraDto, pageable);
//        return ResponseEntity.ok(proceduraPage);
//    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@RequestBody @Validated ProceduraDto proceduraDto, @PathVariable("id") Long id) {
        proceduraService.update(proceduraDto, id);
        return ResponseEntity.ok().build();
    }
}