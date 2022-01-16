package com.example.demo.controller;

import com.example.demo.dto.LekDto;
import com.example.demo.mapper.LekMapper;
import com.example.demo.model.Lek;
import com.example.demo.service.LekService;
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

@RequestMapping("/lek")
@RestController
@Slf4j
@Api("lek")
public class LekController {
    private final LekService lekService;

    public LekController(LekService lekService) {
        this.lekService = lekService;
    }

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody @Validated LekDto lekDto) {
        lekService.save(lekDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<LekDto> findById(@PathVariable("id") int id) {
        LekDto lek = lekService.findById(id);
        return ResponseEntity.ok(lek);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") int id) {
        lekService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/page-query")
    public ResponseEntity<Page<LekDto>> pageQuery(LekDto lekDto, @PageableDefault(sort = "createAt", direction = Sort.Direction.DESC) Pageable pageable) {
        Page<LekDto> lekPage = lekService.findByCondition(lekDto, pageable);
        return ResponseEntity.ok(lekPage);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@RequestBody @Validated LekDto lekDto, @PathVariable("id") int id) {
        lekService.update(lekDto, id);
        return ResponseEntity.ok().build();
    }
}