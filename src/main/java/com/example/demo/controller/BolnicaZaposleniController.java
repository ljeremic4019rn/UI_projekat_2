package com.example.demo.controller;

import com.example.demo.dto.BolnicaZaposleniDto;
import com.example.demo.service.BolnicaZaposleniService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/zaposleni")
@RestController

public class BolnicaZaposleniController {
    private final BolnicaZaposleniService bolnicaZaposleniService;

    public BolnicaZaposleniController(BolnicaZaposleniService bolnicaZaposleniService) {
        this.bolnicaZaposleniService = bolnicaZaposleniService;
    }

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody @Validated BolnicaZaposleniDto bolnicaZaposleniDto) {
        bolnicaZaposleniService.save(bolnicaZaposleniDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<BolnicaZaposleniDto> findById(@PathVariable("id") Long id) {
        BolnicaZaposleniDto zaposleni = bolnicaZaposleniService.findById(id);
        return ResponseEntity.ok(zaposleni);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        bolnicaZaposleniService.deleteById(id);
        return ResponseEntity.ok().build();
    }
//
//    @GetMapping("/page-query")
//    public ResponseEntity<Page<BolnicaDto>> pageQuery(BolnicaDto bolnicaDto, @PageableDefault(sort = "createAt", direction = Sort.Direction.DESC) Pageable pageable) {
//        Page<BolnicaDto> zaposleniPage = bolnicaService.findByCondition(bolnicaDto, pageable);
//        return ResponseEntity.ok(zaposleniPage);
//    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@RequestBody @Validated BolnicaZaposleniDto bolnicaZaposleniDto, @PathVariable("id") Long id) {
        bolnicaZaposleniService.update(bolnicaZaposleniDto, id);
        return ResponseEntity.ok().build();
    }
}