package com.example.demo.controller;

import com.example.demo.dto.LekDto;
import com.example.demo.service.LekService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/lek")
@RestController


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
    public ResponseEntity<LekDto> findById(@PathVariable("id") Long id) {
        LekDto lek = lekService.findById(id);
        return ResponseEntity.ok(lek);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        lekService.deleteById(id);
        return ResponseEntity.ok().build();
    }

//    @GetMapping("/page-query")
//    public ResponseEntity<Page<LekDto>> pageQuery(LekDto lekDto, @PageableDefault(sort = "createAt", direction = Sort.Direction.DESC) Pageable pageable) {
//        Page<LekDto> lekPage = lekService.findByCondition(lekDto, pageable);
//        return ResponseEntity.ok(lekPage);
//    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@RequestBody @Validated LekDto lekDto, @PathVariable("id") Long id) {
        lekService.update(lekDto, id);
        return ResponseEntity.ok().build();
    }
}