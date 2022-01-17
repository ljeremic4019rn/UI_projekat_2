package com.example.demo.controller;

import com.example.demo.dto.OdmorDto;
import com.example.demo.service.OdmorService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/odmor")

public class OdmorController {
    private final OdmorService odmorService;

    public OdmorController(OdmorService odmorService) {
        this.odmorService = odmorService;
    }

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody @Validated OdmorDto odmorDto) {
        odmorService.save(odmorDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<OdmorDto> findById(@PathVariable("id") Long id) {
        OdmorDto odmor = odmorService.findById(id);
        return ResponseEntity.ok(odmor);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        odmorService.deleteById(id);
        return ResponseEntity.ok().build();
    }

//    @GetMapping("/page-query")
//    public ResponseEntity<Page<OdmorDto>> pageQuery(OdmorDto odmorDto, @PageableDefault(sort = "createAt", direction = Sort.Direction.DESC) Pageable pageable) {
//        Page<OdmorDto> odmorPage = odmorService.findByCondition(odmorDto, pageable);
//        return ResponseEntity.ok(odmorPage);
//    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@RequestBody @Validated OdmorDto odmorDto, @PathVariable("id") Long id) {
        odmorService.update(odmorDto, id);
        return ResponseEntity.ok().build();
    }
}