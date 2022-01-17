package com.example.demo.controller;

import com.example.demo.dto.SestraDto;
import com.example.demo.service.SestraService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/sestra")
@RestController

public class SestraController {
    private final SestraService sestraService;

    public SestraController(SestraService sestraService) {
        this.sestraService = sestraService;
    }

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody @Validated SestraDto sestraDto) {
        sestraService.save(sestraDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<SestraDto> findById(@PathVariable("id") Long id) {
        SestraDto sestra = sestraService.findById(id);
        return ResponseEntity.ok(sestra);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        sestraService.deleteById(id);
        return ResponseEntity.ok().build();
    }

//    @GetMapping("/page-query")
//    public ResponseEntity<Page<SestraDto>> pageQuery(SestraDto sestraDto, @PageableDefault(sort = "createAt", direction = Sort.Direction.DESC) Pageable pageable) {
//        Page<SestraDto> sestraPage = sestraService.findByCondition(sestraDto, pageable);
//        return ResponseEntity.ok(sestraPage);
//    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@RequestBody @Validated SestraDto sestraDto, @PathVariable("id") Long id) {
        sestraService.update(sestraDto, id);
        return ResponseEntity.ok().build();
    }
}