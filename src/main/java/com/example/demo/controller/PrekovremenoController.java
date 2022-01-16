package com.example.demo.controller;

import com.example.demo.dto.PrekovremenoDto;
import com.example.demo.mapper.PrekovremenoMapper;
import com.example.demo.model.Prekovremeno;
import com.example.demo.service.PrekovremenoService;
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

@RequestMapping("/prekovremeno")
@RestController
@Slf4j
@Api("prekovremeno")
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
    public ResponseEntity<PrekovremenoDto> findById(@PathVariable("id") int id) {
        PrekovremenoDto prekovremeno = prekovremenoService.findById(id);
        return ResponseEntity.ok(prekovremeno);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") int id) {
        prekovremenoService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/page-query")
    public ResponseEntity<Page<PrekovremenoDto>> pageQuery(PrekovremenoDto prekovremenoDto, @PageableDefault(sort = "createAt", direction = Sort.Direction.DESC) Pageable pageable) {
        Page<PrekovremenoDto> prekovremenoPage = prekovremenoService.findByCondition(prekovremenoDto, pageable);
        return ResponseEntity.ok(prekovremenoPage);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@RequestBody @Validated PrekovremenoDto prekovremenoDto, @PathVariable("id") int id) {
        prekovremenoService.update(prekovremenoDto, id);
        return ResponseEntity.ok().build();
    }
}