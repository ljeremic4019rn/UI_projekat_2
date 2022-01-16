package com.example.demo.service;

import com.example.demo.dto.ProceduraReceptDto;
import com.example.demo.mapper.ProceduraReceptMapper;
import com.example.demo.model.usless.ProceduraRecept;
import com.example.demo.repository.ProceduraReceptRepository;
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
public class ProceduraReceptService {
    private final ProceduraReceptRepository repository;
    private final ProceduraReceptMapper proceduraReceptMapper;

    public ProceduraReceptService(ProceduraReceptRepository repository, ProceduraReceptMapper proceduraReceptMapper) {
        this.repository = repository;
        this.proceduraReceptMapper = proceduraReceptMapper;
    }

    public ProceduraReceptDto save(ProceduraReceptDto proceduraReceptDto) {
        ProceduraRecept entity = proceduraReceptMapper.toEntity(proceduraReceptDto);
        return proceduraReceptMapper.toDto(repository.save(entity));
    }

    public void deleteById(int id) {
        repository.deleteById(id);
    }

    public ProceduraReceptDto findById(int id) {
        return proceduraReceptMapper.toDto(repository.findById(id).orElseThrow(ResourceNotFoundException::new));
    }

    public Page<ProceduraReceptDto> findByCondition(ProceduraReceptDto proceduraReceptDto, Pageable pageable) {
        Page<ProceduraRecept> entityPage = repository.findAll(pageable);
        List<ProceduraRecept> entities = entityPage.getContent();
        return new PageImpl<>(proceduraReceptMapper.toDto(entities), pageable, entityPage.getTotalElements());
    }

    public ProceduraReceptDto update(ProceduraReceptDto proceduraReceptDto, int id) {
        ProceduraReceptDto data = findById(id);
        ProceduraRecept entity = proceduraReceptMapper.toEntity(proceduraReceptDto);
        BeanUtil.copyProperties(data, entity);
        return save(proceduraReceptMapper.toDto(entity));
    }
}