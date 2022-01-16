package com.example.demo.controller;

import com.example.demo.dto.DezurstvoDto;
import com.example.demo.mapper.DezurstvoMapper;
import com.example.demo.model.Dezurstvo;
import com.example.demo.service.DezurstvoService;
import com.sun.tools.javac.util.DefinedBy.Api;
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

@RequestMapping("/dezurstvo")
@RestController
@Slf4j
@Api("dezurstvo")
public class DezurstvoController {
    private final DezurstvoService dezurstvoService;

    public DezurstvoController(DezurstvoService dezurstvoService) {
        this.dezurstvoService = dezurstvoService;
    }

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody @Validated DezurstvoDto dezurstvoDto) {
        dezurstvoService.save(dezurstvoDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<DezurstvoDto> findById(@PathVariable("id") int id) {
        DezurstvoDto dezurstvo = dezurstvoService.findById(id);
        return ResponseEntity.ok(dezurstvo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") int id) {
        dezurstvoService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/page-query")
    public ResponseEntity<Page<DezurstvoDto>> pageQuery(DezurstvoDto dezurstvoDto, @PageableDefault(sort = "createAt", direction = Sort.Direction.DESC) Pageable pageable) {
        Page<DezurstvoDto> dezurstvoPage = dezurstvoService.findByCondition(dezurstvoDto, pageable);
        return ResponseEntity.ok(dezurstvoPage);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@RequestBody @Validated DezurstvoDto dezurstvoDto, @PathVariable("id") int id) {
        dezurstvoService.update(dezurstvoDto, id);
        return ResponseEntity.ok().build();
    }
}