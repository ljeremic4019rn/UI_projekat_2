package com.example.demo.controller;

import com.example.demo.dto.OsiguranjeDto;
import com.example.demo.mapper.OsiguranjeMapper;
import com.example.demo.model.Osiguranje;
import com.example.demo.service.OsiguranjeService;
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

@RequestMapping("/osiguranje")
@RestController
@Slf4j
@Api("osiguranje")
public class OsiguranjeController {
    private final OsiguranjeService osiguranjeService;

    public OsiguranjeController(OsiguranjeService osiguranjeService) {
        this.osiguranjeService = osiguranjeService;
    }

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody @Validated OsiguranjeDto osiguranjeDto) {
        osiguranjeService.save(osiguranjeDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<OsiguranjeDto> findById(@PathVariable("id") int id) {
        OsiguranjeDto osiguranje = osiguranjeService.findById(id);
        return ResponseEntity.ok(osiguranje);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") int id) {
        osiguranjeService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/page-query")
    public ResponseEntity<Page<OsiguranjeDto>> pageQuery(OsiguranjeDto osiguranjeDto, @PageableDefault(sort = "createAt", direction = Sort.Direction.DESC) Pageable pageable) {
        Page<OsiguranjeDto> osiguranjePage = osiguranjeService.findByCondition(osiguranjeDto, pageable);
        return ResponseEntity.ok(osiguranjePage);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@RequestBody @Validated OsiguranjeDto osiguranjeDto, @PathVariable("id") int id) {
        osiguranjeService.update(osiguranjeDto, id);
        return ResponseEntity.ok().build();
    }
}