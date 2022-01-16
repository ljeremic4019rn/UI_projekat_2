package com.example.demo.service;

import com.example.demo.dto.ReceptDto;
import com.example.demo.mapper.ReceptMapper;
import com.example.demo.model.Recept;
import com.example.demo.repository.ReceptRepository;
import lombok.extern.slf4j.Slf4j;
import org.mapstruct.factory.Mappers;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@Transactional
public class ReceptService {
    private final ReceptRepository repository;
    private final ReceptMapper receptMapper;

    public ReceptService(ReceptRepository repository, ReceptMapper receptMapper) {
        this.repository = repository;
        this.receptMapper = receptMapper;
    }

    public ReceptDto save(ReceptDto receptDto) {
        Recept entity = receptMapper.toEntity(receptDto);
        return receptMapper.toDto(repository.save(entity));
    }

    public void deleteById(int id) {
        repository.deleteById(id);
    }

    public ReceptDto findById(int id) {
        return receptMapper.toDto(repository.findById(id).orElseThrow(ResourceNotFoundException::new));
    }

    public Page<ReceptDto> findByCondition(ReceptDto receptDto, Pageable pageable) {
        Page<Recept> entityPage = repository.findAll(pageable);
        List<Recept> entities = entityPage.getContent();
        return new PageImpl<>(receptMapper.toDto(entities), pageable, entityPage.getTotalElements());
    }

    public ReceptDto update(ReceptDto receptDto, int id) {
        ReceptDto data = findById(id);
        Recept entity = receptMapper.toEntity(receptDto);
        BeanUtil.copyProperties(data, entity);
        return save(receptMapper.toDto(entity));
    }
}