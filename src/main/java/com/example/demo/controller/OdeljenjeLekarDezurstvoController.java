package com.example.demo.controller;

import com.example.demo.dto.OdeljenjeLekarDezurstvoDto;
import com.example.demo.service.OdeljenjeLekarDezurstvoService;
import com.sun.tools.javac.util.DefinedBy.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/odeljenje-lekar-dezurstvo")
@RestController
@Slf4j
@Api("odeljenje-lekar-dezurstvo")
public class OdeljenjeLekarDezurstvoController {
    private final OdeljenjeLekarDezurstvoService odeljenjeLekarDezurstvoService;

    public OdeljenjeLekarDezurstvoController(OdeljenjeLekarDezurstvoService odeljenjeLekarDezurstvoService) {
        this.odeljenjeLekarDezurstvoService = odeljenjeLekarDezurstvoService;
    }

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody @Validated OdeljenjeLekarDezurstvoDto odeljenjeLekarDezurstvoDto) {
        odeljenjeLekarDezurstvoService.save(odeljenjeLekarDezurstvoDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<OdeljenjeLekarDezurstvoDto> findById(@PathVariable("id") int id) {
        OdeljenjeLekarDezurstvoDto odeljenjeLekarDezurstvo = odeljenjeLekarDezurstvoService.findById(id);
        return ResponseEntity.ok(odeljenjeLekarDezurstvo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") int id) {
        odeljenjeLekarDezurstvoService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/page-query")
    public ResponseEntity<Page<OdeljenjeLekarDezurstvoDto>> pageQuery(OdeljenjeLekarDezurstvoDto odeljenjeLekarDezurstvoDto, @PageableDefault(sort = "createAt", direction = Sort.Direction.DESC) Pageable pageable) {
        Page<OdeljenjeLekarDezurstvoDto> odeljenjeLekarDezurstvoPage = odeljenjeLekarDezurstvoService.findByCondition(odeljenjeLekarDezurstvoDto, pageable);
        return ResponseEntity.ok(odeljenjeLekarDezurstvoPage);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@RequestBody @Validated OdeljenjeLekarDezurstvoDto odeljenjeLekarDezurstvoDto, @PathVariable("id") int id) {
        odeljenjeLekarDezurstvoService.update(odeljenjeLekarDezurstvoDto, id);
        return ResponseEntity.ok().build();
    }
}