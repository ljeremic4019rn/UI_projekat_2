package com.example.demo.controller;

import com.example.demo.dto.PacijentLekDto;
import com.example.demo.service.PacijentLekService;
import com.sun.tools.javac.util.DefinedBy.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/pacijent-lek")
@RestController
@Slf4j
@Api("pacijent-lek")
public class PacijentLekController {
    private final PacijentLekService pacijentLekService;

    public PacijentLekController(PacijentLekService pacijentLekService) {
        this.pacijentLekService = pacijentLekService;
    }

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody @Validated PacijentLekDto pacijentLekDto) {
        pacijentLekService.save(pacijentLekDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PacijentLekDto> findById(@PathVariable("id") int id) {
        PacijentLekDto pacijentLek = pacijentLekService.findById(id);
        return ResponseEntity.ok(pacijentLek);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") int id) {
        pacijentLekService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/page-query")
    public ResponseEntity<Page<PacijentLekDto>> pageQuery(PacijentLekDto pacijentLekDto, @PageableDefault(sort = "createAt", direction = Sort.Direction.DESC) Pageable pageable) {
        Page<PacijentLekDto> pacijentLekPage = pacijentLekService.findByCondition(pacijentLekDto, pageable);
        return ResponseEntity.ok(pacijentLekPage);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@RequestBody @Validated PacijentLekDto pacijentLekDto, @PathVariable("id") int id) {
        pacijentLekService.update(pacijentLekDto, id);
        return ResponseEntity.ok().build();
    }
}