package com.example.demo.controller;

import com.example.demo.dto.PacijentKartonDto;
import com.example.demo.service.PacijentKartonService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/pacijent-karton")
@RestController

public class PacijentKartonController {
    private final PacijentKartonService pacijentKartonService;

    public PacijentKartonController(PacijentKartonService pacijentKartonService) {
        this.pacijentKartonService = pacijentKartonService;
    }

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody @Validated PacijentKartonDto pacijentKartonDto) {
        pacijentKartonService.save(pacijentKartonDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PacijentKartonDto> findById(@PathVariable("id") Long id) {
        PacijentKartonDto pacijentKarton = pacijentKartonService.findById(id);
        return ResponseEntity.ok(pacijentKarton);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        pacijentKartonService.deleteById(id);
        return ResponseEntity.ok().build();
    }

//    @GetMapping("/page-query")
//    public ResponseEntity<Page<PacijentKartonDto>> pageQuery(PacijentKartonDto pacijentKartonDto, @PageableDefault(sort = "createAt", direction = Sort.Direction.DESC) Pageable pageable) {
//        Page<PacijentKartonDto> pacijentKartonPage = pacijentKartonService.findByCondition(pacijentKartonDto, pageable);
//        return ResponseEntity.ok(pacijentKartonPage);
//    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@RequestBody @Validated PacijentKartonDto pacijentKartonDto, @PathVariable("id") Long id) {
        pacijentKartonService.update(pacijentKartonDto, id);
        return ResponseEntity.ok().build();
    }
}