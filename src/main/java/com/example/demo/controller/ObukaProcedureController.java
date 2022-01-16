package com.example.demo.controller;

import com.example.demo.dto.ObukaProcedureDto;
import com.example.demo.mapper.ObukaProcedureMapper;
import com.example.demo.model.ObukaProcedure;
import com.example.demo.service.ObukaProcedureService;
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

@RequestMapping("/obuka-procedure")
@RestController
@Slf4j
@Api("obuka-procedure")
public class ObukaProcedureController {
    private final ObukaProcedureService obukaProcedureService;

    public ObukaProcedureController(ObukaProcedureService obukaProcedureService) {
        this.obukaProcedureService = obukaProcedureService;
    }

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody @Validated ObukaProcedureDto obukaProcedureDto) {
        obukaProcedureService.save(obukaProcedureDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ObukaProcedureDto> findById(@PathVariable("id") int id) {
        ObukaProcedureDto obukaProcedure = obukaProcedureService.findById(id);
        return ResponseEntity.ok(obukaProcedure);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") int id) {
        obukaProcedureService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/page-query")
    public ResponseEntity<Page<ObukaProcedureDto>> pageQuery(ObukaProcedureDto obukaProcedureDto, @PageableDefault(sort = "createAt", direction = Sort.Direction.DESC) Pageable pageable) {
        Page<ObukaProcedureDto> obukaProcedurePage = obukaProcedureService.findByCondition(obukaProcedureDto, pageable);
        return ResponseEntity.ok(obukaProcedurePage);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@RequestBody @Validated ObukaProcedureDto obukaProcedureDto, @PathVariable("id") int id) {
        obukaProcedureService.update(obukaProcedureDto, id);
        return ResponseEntity.ok().build();
    }
}