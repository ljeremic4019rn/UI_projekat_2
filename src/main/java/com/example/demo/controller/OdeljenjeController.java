package com.example.demo.controller;

import com.example.demo.dto.OdeljenjeDto;
import com.example.demo.mapper.OdeljenjeMapper;
import com.example.demo.model.Odeljenje;
import com.example.demo.service.OdeljenjeService;
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

@RequestMapping("/odeljenje")
@RestController
@Slf4j
@Api("odeljenje")
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
    public ResponseEntity<OdeljenjeDto> findById(@PathVariable("id") int id) {
        OdeljenjeDto odeljenje = odeljenjeService.findById(id);
        return ResponseEntity.ok(odeljenje);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") int id) {
        odeljenjeService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/page-query")
    public ResponseEntity<Page<OdeljenjeDto>> pageQuery(OdeljenjeDto odeljenjeDto, @PageableDefault(sort = "createAt", direction = Sort.Direction.DESC) Pageable pageable) {
        Page<OdeljenjeDto> odeljenjePage = odeljenjeService.findByCondition(odeljenjeDto, pageable);
        return ResponseEntity.ok(odeljenjePage);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@RequestBody @Validated OdeljenjeDto odeljenjeDto, @PathVariable("id") int id) {
        odeljenjeService.update(odeljenjeDto, id);
        return ResponseEntity.ok().build();
    }
}