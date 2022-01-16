package com.example.demo.controller;

import com.example.demo.dto.SobaDto;
import com.example.demo.mapper.SobaMapper;
import com.example.demo.model.Soba;
import com.example.demo.service.SobaService;
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

@RequestMapping("/soba")
@RestController
@Slf4j
@Api("soba")
public class SobaController {
    private final SobaService sobaService;

    public SobaController(SobaService sobaService) {
        this.sobaService = sobaService;
    }

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody @Validated SobaDto sobaDto) {
        sobaService.save(sobaDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<SobaDto> findById(@PathVariable("id") int id) {
        SobaDto soba = sobaService.findById(id);
        return ResponseEntity.ok(soba);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") int id) {
        sobaService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/page-query")
    public ResponseEntity<Page<SobaDto>> pageQuery(SobaDto sobaDto, @PageableDefault(sort = "createAt", direction = Sort.Direction.DESC) Pageable pageable) {
        Page<SobaDto> sobaPage = sobaService.findByCondition(sobaDto, pageable);
        return ResponseEntity.ok(sobaPage);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@RequestBody @Validated SobaDto sobaDto, @PathVariable("id") int id) {
        sobaService.update(sobaDto, id);
        return ResponseEntity.ok().build();
    }
}