package com.example.demo.controller;

import com.example.demo.dto.DijagonzaDto;
import com.example.demo.service.DijagonzaService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/dijagonza")
@RestController

public class DijagonzaController {
    private final DijagonzaService dijagonzaService;

    public DijagonzaController(DijagonzaService dijagonzaService) {
        this.dijagonzaService = dijagonzaService;
    }

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody @Validated DijagonzaDto dijagonzaDto) {
        dijagonzaService.save(dijagonzaDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<DijagonzaDto> findById(@PathVariable("id") Long id) {
        DijagonzaDto dijagonza = dijagonzaService.findById(id);
        return ResponseEntity.ok(dijagonza);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        dijagonzaService.deleteById(id);
        return ResponseEntity.ok().build();
    }
//
//    @GetMapping("/page-query")
//    public ResponseEntity<Page<DijagonzaDto>> pageQuery(DijagonzaDto dijagonzaDto, @PageableDefault(sort = "createAt", direction = Sort.Direction.DESC) Pageable pageable) {
//        Page<DijagonzaDto> dijagonzaPage = dijagonzaService.findByCondition(dijagonzaDto, pageable);
//        return ResponseEntity.ok(dijagonzaPage);
//    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@RequestBody @Validated DijagonzaDto dijagonzaDto, @PathVariable("id") Long id) {
        dijagonzaService.update(dijagonzaDto, id);
        return ResponseEntity.ok().build();
    }
}