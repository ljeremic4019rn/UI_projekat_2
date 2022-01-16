package com.example.demo.controller;

import com.example.demo.dto.BlokDto;
import com.example.demo.service.BlokService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/blok")
@RestController
public class BlokController {
    private final BlokService blokService;

    public BlokController(BlokService blokService) {
        this.blokService = blokService;
    }

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody @Validated BlokDto blokDto) {
        blokService.save(blokDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<BlokDto> findById(@PathVariable("id") int id) {
        BlokDto blok = blokService.findById(id);
        return ResponseEntity.ok(blok);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") int id) {
        blokService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/page-query")
    public ResponseEntity<Page<BlokDto>> pageQuery(BlokDto blokDto, @PageableDefault(sort = "createAt", direction = Sort.Direction.DESC) Pageable pageable) {
        Page<BlokDto> blokPage = blokService.findByCondition(blokDto, pageable);
        return ResponseEntity.ok(blokPage);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@RequestBody @Validated BlokDto blokDto, @PathVariable("id") int id) {
        blokService.update(blokDto, id);
        return ResponseEntity.ok().build();
    }
}