package com.example.demo.controller;

import com.example.demo.dto.RacunovodjaDto;
import com.example.demo.mapper.RacunovodjaMapper;
import com.example.demo.model.Racunovodja;
import com.example.demo.service.RacunovodjaService;
import com.sun.tools.javac.util.DefinedBy.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequestMapping("/racunovodja")
@RestController
@Slf4j
@Api("racunovodja")
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
    public ResponseEntity<RacunovodjaDto> findById(@PathVariable("id") int id) {
        RacunovodjaDto racunovodja = racunovodjaService.findById(id);
        return ResponseEntity.ok(racunovodja);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") int id) {
        racunovodjaService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/page-query")
    public ResponseEntity<Page<RacunovodjaDto>> pageQuery(RacunovodjaDto racunovodjaDto, @PageableDefault(sort = "createAt", direction = Sort.Direction.DESC) Pageable pageable) {
        Page<RacunovodjaDto> racunovodjaPage = racunovodjaService.findByCondition(racunovodjaDto, pageable);
        return ResponseEntity.ok(racunovodjaPage);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@RequestBody @Validated RacunovodjaDto racunovodjaDto, @PathVariable("id") int id) {
        racunovodjaService.update(racunovodjaDto, id);
        return ResponseEntity.ok().build();
    }
}