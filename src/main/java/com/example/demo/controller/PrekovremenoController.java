package com.example.demo.controller;

import com.example.demo.dto.PrekovremenoDto;
import com.example.demo.service.PrekovremenoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/prekovremeno")
@RestController

public class PrekovremenoController {
    private final PrekovremenoService prekovremenoService;

    public PrekovremenoController(PrekovremenoService prekovremenoService) {
        this.prekovremenoService = prekovremenoService;
    }

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody @Validated PrekovremenoDto prekovremenoDto) {
        prekovremenoService.save(prekovremenoDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PrekovremenoDto> findById(@PathVariable("id") Long id) {
        PrekovremenoDto prekovremeno = prekovremenoService.findById(id);
        return ResponseEntity.ok(prekovremeno);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        prekovremenoService.deleteById(id);
        return ResponseEntity.ok().build();
    }

//    @GetMapping("/page-query")
//    public ResponseEntity<Page<PrekovremenoDto>> pageQuery(PrekovremenoDto prekovremenoDto, @PageableDefault(sort = "createAt", direction = Sort.Direction.DESC) Pageable pageable) {
//        Page<PrekovremenoDto> prekovremenoPage = prekovremenoService.findByCondition(prekovremenoDto, pageable);
//        return ResponseEntity.ok(prekovremenoPage);
//    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@RequestBody @Validated PrekovremenoDto prekovremenoDto, @PathVariable("id") Long id) {
        prekovremenoService.update(prekovremenoDto, id);
        return ResponseEntity.ok().build();
    }
}