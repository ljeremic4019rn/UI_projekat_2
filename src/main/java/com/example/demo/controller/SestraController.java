package com.example.demo.controller;

import com.example.demo.dto.SestraDto;
import com.example.demo.mapper.SestraMapper;
import com.example.demo.model.Sestra;
import com.example.demo.service.SestraService;
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

@RequestMapping("/sestra")
@RestController
@Slf4j
@Api("sestra")
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
    public ResponseEntity<SestraDto> findById(@PathVariable("id") int id) {
        SestraDto sestra = sestraService.findById(id);
        return ResponseEntity.ok(sestra);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") int id) {
        sestraService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/page-query")
    public ResponseEntity<Page<SestraDto>> pageQuery(SestraDto sestraDto, @PageableDefault(sort = "createAt", direction = Sort.Direction.DESC) Pageable pageable) {
        Page<SestraDto> sestraPage = sestraService.findByCondition(sestraDto, pageable);
        return ResponseEntity.ok(sestraPage);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@RequestBody @Validated SestraDto sestraDto, @PathVariable("id") int id) {
        sestraService.update(sestraDto, id);
        return ResponseEntity.ok().build();
    }
}