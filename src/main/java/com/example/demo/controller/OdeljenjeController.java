package com.example.demo.controller;

import com.example.demo.dto.OdeljenjeDto;
import com.example.demo.service.OdeljenjeService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/odeljenje")
@RestController

public class OdeljenjeController {
    private final OdeljenjeService odeljenjeService;

    public OdeljenjeController(OdeljenjeService odeljenjeService) {
        this.odeljenjeService = odeljenjeService;
    }

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody @Validated OdeljenjeDto odeljenjeDto) {
        odeljenjeService.save(odeljenjeDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<OdeljenjeDto> findById(@PathVariable("id") Long id) {
        OdeljenjeDto odeljenje = odeljenjeService.findById(id);
        return ResponseEntity.ok(odeljenje);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        odeljenjeService.deleteById(id);
        return ResponseEntity.ok().build();
    }

//    @GetMapping("/page-query")
//    public ResponseEntity<Page<OdeljenjeDto>> pageQuery(OdeljenjeDto odeljenjeDto, @PageableDefault(sort = "createAt", direction = Sort.Direction.DESC) Pageable pageable) {
//        Page<OdeljenjeDto> odeljenjePage = odeljenjeService.findByCondition(odeljenjeDto, pageable);
//        return ResponseEntity.ok(odeljenjePage);
//    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@RequestBody @Validated OdeljenjeDto odeljenjeDto, @PathVariable("id") Long id) {
        odeljenjeService.update(odeljenjeDto, id);
        return ResponseEntity.ok().build();
    }
}