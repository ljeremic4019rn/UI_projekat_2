package com.example.demo.controller;

import com.example.demo.dto.LekarDto;
import com.example.demo.mapper.LekarMapper;
import com.example.demo.model.Lekar;
import com.example.demo.service.LekarService;
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

@RequestMapping("/lekar")
@RestController
@Slf4j
@Api("lekar")
public class LekarController {
    private final LekarService lekarService;

    public LekarController(LekarService lekarService) {
        this.lekarService = lekarService;
    }

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody @Validated LekarDto lekarDto) {
        lekarService.save(lekarDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<LekarDto> findById(@PathVariable("id") int id) {
        LekarDto lekar = lekarService.findById(id);
        return ResponseEntity.ok(lekar);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") int id) {
        lekarService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/page-query")
    public ResponseEntity<Page<LekarDto>> pageQuery(LekarDto lekarDto, @PageableDefault(sort = "createAt", direction = Sort.Direction.DESC) Pageable pageable) {
        Page<LekarDto> lekarPage = lekarService.findByCondition(lekarDto, pageable);
        return ResponseEntity.ok(lekarPage);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@RequestBody @Validated LekarDto lekarDto, @PathVariable("id") int id) {
        lekarService.update(lekarDto, id);
        return ResponseEntity.ok().build();
    }
}