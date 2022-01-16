package com.example.demo.controller;

import com.example.demo.dto.LekarProceduraDto;
import com.example.demo.service.LekarProceduraService;
import com.sun.tools.javac.util.DefinedBy.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/lekar-procedura")
@RestController
@Slf4j
@Api("lekar-procedura")
public class LekarProceduraController {
    private final LekarProceduraService lekarProceduraService;

    public LekarProceduraController(LekarProceduraService lekarProceduraService) {
        this.lekarProceduraService = lekarProceduraService;
    }

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody @Validated LekarProceduraDto lekarProceduraDto) {
        lekarProceduraService.save(lekarProceduraDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<LekarProceduraDto> findById(@PathVariable("id") int id) {
        LekarProceduraDto lekarProcedura = lekarProceduraService.findById(id);
        return ResponseEntity.ok(lekarProcedura);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") int id) {
        lekarProceduraService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/page-query")
    public ResponseEntity<Page<LekarProceduraDto>> pageQuery(LekarProceduraDto lekarProceduraDto, @PageableDefault(sort = "createAt", direction = Sort.Direction.DESC) Pageable pageable) {
        Page<LekarProceduraDto> lekarProceduraPage = lekarProceduraService.findByCondition(lekarProceduraDto, pageable);
        return ResponseEntity.ok(lekarProceduraPage);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@RequestBody @Validated LekarProceduraDto lekarProceduraDto, @PathVariable("id") int id) {
        lekarProceduraService.update(lekarProceduraDto, id);
        return ResponseEntity.ok().build();
    }
}