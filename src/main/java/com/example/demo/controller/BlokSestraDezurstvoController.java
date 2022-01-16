package com.example.demo.controller;

import com.example.demo.dto.BlokSestraDezurstvoDto;
import com.example.demo.service.BlokSestraDezurstvoService;
import com.sun.tools.javac.util.DefinedBy.Api;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/blok-sestra-dezurstvo")
@RestController
@Slf4j
@Api("blok-sestra-dezurstvo")
public class BlokSestraDezurstvoController {
    private final BlokSestraDezurstvoService blokSestraDezurstvoService;

    public BlokSestraDezurstvoController(BlokSestraDezurstvoService blokSestraDezurstvoService) {
        this.blokSestraDezurstvoService = blokSestraDezurstvoService;
    }

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody @Validated BlokSestraDezurstvoDto blokSestraDezurstvoDto) {
        blokSestraDezurstvoService.save(blokSestraDezurstvoDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<BlokSestraDezurstvoDto> findById(@PathVariable("id") int id) {
        BlokSestraDezurstvoDto blokSestraDezurstvo = blokSestraDezurstvoService.findById(id);
        return ResponseEntity.ok(blokSestraDezurstvo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") int id) {
        blokSestraDezurstvoService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/page-query")
    public ResponseEntity<Page<BlokSestraDezurstvoDto>> pageQuery(BlokSestraDezurstvoDto blokSestraDezurstvoDto, @PageableDefault(sort = "createAt", direction = Sort.Direction.DESC) Pageable pageable) {
        Page<BlokSestraDezurstvoDto> blokSestraDezurstvoPage = blokSestraDezurstvoService.findByCondition(blokSestraDezurstvoDto, pageable);
        return ResponseEntity.ok(blokSestraDezurstvoPage);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@RequestBody @Validated BlokSestraDezurstvoDto blokSestraDezurstvoDto, @PathVariable("id") int id) {
        blokSestraDezurstvoService.update(blokSestraDezurstvoDto, id);
        return ResponseEntity.ok().build();
    }
}