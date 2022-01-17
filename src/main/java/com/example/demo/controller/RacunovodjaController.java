package com.example.demo.controller;

import com.example.demo.dto.RacunovodjaDto;
import com.example.demo.service.RacunovodjaService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/racunovodja")
@RestController

public class RacunovodjaController {
    private final RacunovodjaService racunovodjaService;

    public RacunovodjaController(RacunovodjaService racunovodjaService) {
        this.racunovodjaService = racunovodjaService;
    }

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody @Validated RacunovodjaDto racunovodjaDto) {
        racunovodjaService.save(racunovodjaDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<RacunovodjaDto> findById(@PathVariable("id") Long id) {
        RacunovodjaDto racunovodja = racunovodjaService.findById(id);
        return ResponseEntity.ok(racunovodja);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        racunovodjaService.deleteById(id);
        return ResponseEntity.ok().build();
    }

//    @GetMapping("/page-query")
//    public ResponseEntity<Page<RacunovodjaDto>> pageQuery(RacunovodjaDto racunovodjaDto, @PageableDefault(sort = "createAt", direction = Sort.Direction.DESC) Pageable pageable) {
//        Page<RacunovodjaDto> racunovodjaPage = racunovodjaService.findByCondition(racunovodjaDto, pageable);
//        return ResponseEntity.ok(racunovodjaPage);
//    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@RequestBody @Validated RacunovodjaDto racunovodjaDto, @PathVariable("id") Long id) {
        racunovodjaService.update(racunovodjaDto, id);
        return ResponseEntity.ok().build();
    }
}