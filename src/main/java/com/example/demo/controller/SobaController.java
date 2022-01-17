package com.example.demo.controller;

import com.example.demo.dto.SobaDto;
import com.example.demo.service.SobaService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/soba")
@RestController


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
    public ResponseEntity<SobaDto> findById(@PathVariable("id") Long id) {
        SobaDto soba = sobaService.findById(id);
        return ResponseEntity.ok(soba);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        sobaService.deleteById(id);
        return ResponseEntity.ok().build();
    }

//    @GetMapping("/page-query")
//    public ResponseEntity<Page<SobaDto>> pageQuery(SobaDto sobaDto, @PageableDefault(sort = "createAt", direction = Sort.Direction.DESC) Pageable pageable) {
//        Page<SobaDto> sobaPage = sobaService.findByCondition(sobaDto, pageable);
//        return ResponseEntity.ok(sobaPage);
//    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@RequestBody @Validated SobaDto sobaDto, @PathVariable("id") Long id) {
        sobaService.update(sobaDto, id);
        return ResponseEntity.ok().build();
    }
}