package com.example.demo.service;

import com.example.demo.dto.LekReceptDto;
import com.example.demo.mapper.LekReceptMapper;
import com.example.demo.model.usless.LekRecept;
import com.example.demo.repository.LekReceptRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
@Transactional
public class LekReceptService {
    private final LekReceptRepository repository;
    private final LekReceptMapper lekReceptMapper;

    public LekReceptService(LekReceptRepository repository, LekReceptMapper lekReceptMapper) {
        this.repository = repository;
        this.lekReceptMapper = lekReceptMapper;
    }

    public LekReceptDto save(LekReceptDto lekReceptDto) {
        LekRecept entity = lekReceptMapper.toEntity(lekReceptDto);
        return lekReceptMapper.toDto(repository.save(entity));
    }

    public void deleteById(int id) {
        repository.deleteById(id);
    }

    public LekReceptDto findById(int id) {
        return lekReceptMapper.toDto(repository.findById(id).orElseThrow(ResourceNotFoundException::new));
    }

    public Page<LekReceptDto> findByCondition(LekReceptDto lekReceptDto, Pageable pageable) {
        Page<LekRecept> entityPage = repository.findAll(pageable);
        List<LekRecept> entities = entityPage.getContent();
        return new PageImpl<>(lekReceptMapper.toDto(entities), pageable, entityPage.getTotalElements());
    }

    public LekReceptDto update(LekReceptDto lekReceptDto, int id) {
        LekReceptDto data = findById(id);
        LekRecept entity = lekReceptMapper.toEntity(lekReceptDto);
        BeanUtil.copyProperties(data, entity);
        return save(lekReceptMapper.toDto(entity));
    }
}