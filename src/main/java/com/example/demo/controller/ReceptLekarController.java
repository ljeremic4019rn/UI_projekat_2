package com.example.demo.controller;

import com.example.demo.dto.ReceptLekarDto;
import com.example.demo.service.ReceptLekarService;
import com.sun.tools.javac.util.DefinedBy.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/recept-lekar")
@RestController
@Slf4j
@Api("recept-lekar")
public class ReceptLekarController {
    private final ReceptLekarService receptLekarService;

    public ReceptLekarController(ReceptLekarService receptLekarService) {
        this.receptLekarService = receptLekarService;
    }

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody @Validated ReceptLekarDto receptLekarDto) {
        receptLekarService.save(receptLekarDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ReceptLekarDto> findById(@PathVariable("id") int id) {
        ReceptLekarDto receptLekar = receptLekarService.findById(id);
        return ResponseEntity.ok(receptLekar);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") int id) {
        receptLekarService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/page-query")
    public ResponseEntity<Page<ReceptLekarDto>> pageQuery(ReceptLekarDto receptLekarDto, @PageableDefault(sort = "createAt", direction = Sort.Direction.DESC) Pageable pageable) {
        Page<ReceptLekarDto> receptLekarPage = receptLekarService.findByCondition(receptLekarDto, pageable);
        return ResponseEntity.ok(receptLekarPage);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@RequestBody @Validated ReceptLekarDto receptLekarDto, @PathVariable("id") int id) {
        receptLekarService.update(receptLekarDto, id);
        return ResponseEntity.ok().build();
    }
}