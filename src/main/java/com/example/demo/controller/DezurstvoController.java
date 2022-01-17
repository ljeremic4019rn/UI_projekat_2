package com.example.demo.controller;

import com.example.demo.dto.DezurstvoDto;
import com.example.demo.service.DezurstvoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/dezurstvo")
@RestController

public class DezurstvoController {
    private final DezurstvoService dezurstvoService;

    public DezurstvoController(DezurstvoService dezurstvoService) {
        this.dezurstvoService = dezurstvoService;
    }

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody @Validated DezurstvoDto dezurstvoDto) {
        dezurstvoService.save(dezurstvoDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<DezurstvoDto> findById(@PathVariable("id") Long id) {
        DezurstvoDto dezurstvo = dezurstvoService.findById(id);
        return ResponseEntity.ok(dezurstvo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        dezurstvoService.deleteById(id);
        return ResponseEntity.ok().build();
    }
//
//    @GetMapping("/page-query")
//    public ResponseEntity<Page<DezurstvoDto>> pageQuery(DezurstvoDto dezurstvoDto, @PageableDefault(sort = "createAt", direction = Sort.Direction.DESC) Pageable pageable) {
//        Page<DezurstvoDto> dezurstvoPage = dezurstvoService.findByCondition(dezurstvoDto, pageable);
//        return ResponseEntity.ok(dezurstvoPage);
//    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@RequestBody @Validated DezurstvoDto dezurstvoDto, @PathVariable("id") Long id) {
        dezurstvoService.update(dezurstvoDto, id);
        return ResponseEntity.ok().build();
    }
}