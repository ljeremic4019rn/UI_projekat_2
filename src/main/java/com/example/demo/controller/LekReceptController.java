package com.example.demo.controller;

import com.example.demo.dto.LekReceptDto;
import com.example.demo.service.LekReceptService;
import com.sun.tools.javac.util.DefinedBy.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/lek-recept")
@RestController
@Slf4j
@Api("lek-recept")
public class LekReceptController {
    private final LekReceptService lekReceptService;

    public LekReceptController(LekReceptService lekReceptService) {
        this.lekReceptService = lekReceptService;
    }

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody @Validated LekReceptDto lekReceptDto) {
        lekReceptService.save(lekReceptDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<LekReceptDto> findById(@PathVariable("id") int id) {
        LekReceptDto lekRecept = lekReceptService.findById(id);
        return ResponseEntity.ok(lekRecept);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") int id) {
        lekReceptService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/page-query")
    public ResponseEntity<Page<LekReceptDto>> pageQuery(LekReceptDto lekReceptDto, @PageableDefault(sort = "createAt", direction = Sort.Direction.DESC) Pageable pageable) {
        Page<LekReceptDto> lekReceptPage = lekReceptService.findByCondition(lekReceptDto, pageable);
        return ResponseEntity.ok(lekReceptPage);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@RequestBody @Validated LekReceptDto lekReceptDto, @PathVariable("id") int id) {
        lekReceptService.update(lekReceptDto, id);
        return ResponseEntity.ok().build();
    }
}