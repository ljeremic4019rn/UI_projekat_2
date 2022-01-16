package com.example.demo.controller;

import com.example.demo.dto.ProceduraReceptDto;
import com.example.demo.service.ProceduraReceptService;
import com.sun.tools.javac.util.DefinedBy.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/procedura-recept")
@RestController
@Slf4j
@Api("procedura-recept")
public class ProceduraReceptController {
    private final ProceduraReceptService proceduraReceptService;

    public ProceduraReceptController(ProceduraReceptService proceduraReceptService) {
        this.proceduraReceptService = proceduraReceptService;
    }

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody @Validated ProceduraReceptDto proceduraReceptDto) {
        proceduraReceptService.save(proceduraReceptDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProceduraReceptDto> findById(@PathVariable("id") int id) {
        ProceduraReceptDto proceduraRecept = proceduraReceptService.findById(id);
        return ResponseEntity.ok(proceduraRecept);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") int id) {
        proceduraReceptService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/page-query")
    public ResponseEntity<Page<ProceduraReceptDto>> pageQuery(ProceduraReceptDto proceduraReceptDto, @PageableDefault(sort = "createAt", direction = Sort.Direction.DESC) Pageable pageable) {
        Page<ProceduraReceptDto> proceduraReceptPage = proceduraReceptService.findByCondition(proceduraReceptDto, pageable);
        return ResponseEntity.ok(proceduraReceptPage);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@RequestBody @Validated ProceduraReceptDto proceduraReceptDto, @PathVariable("id") int id) {
        proceduraReceptService.update(proceduraReceptDto, id);
        return ResponseEntity.ok().build();
    }
}