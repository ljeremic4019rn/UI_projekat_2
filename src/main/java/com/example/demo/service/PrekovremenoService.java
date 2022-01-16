package com.example.demo.service;

import com.example.demo.dto.PrekovremenoDto;
import com.example.demo.mapper.PrekovremenoMapper;
import com.example.demo.model.Prekovremeno;
import com.example.demo.repository.PrekovremenoRepository;
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
public class PrekovremenoService {
    private final PrekovremenoRepository repository;
    private final PrekovremenoMapper prekovremenoMapper;

    public PrekovremenoService(PrekovremenoRepository repository, PrekovremenoMapper prekovremenoMapper) {
        this.repository = repository;
        this.prekovremenoMapper = prekovremenoMapper;
    }

    public PrekovremenoDto save(PrekovremenoDto prekovremenoDto) {
        Prekovremeno entity = prekovremenoMapper.toEntity(prekovremenoDto);
        return prekovremenoMapper.toDto(repository.save(entity));
    }

    public void deleteById(int id) {
        repository.deleteById(id);
    }

    public PrekovremenoDto findById(int id) {
        return prekovremenoMapper.toDto(repository.findById(id).orElseThrow(ResourceNotFoundException::new));
    }

    public Page<PrekovremenoDto> findByCondition(PrekovremenoDto prekovremenoDto, Pageable pageable) {
        Page<Prekovremeno> entityPage = repository.findAll(pageable);
        List<Prekovremeno> entities = entityPage.getContent();
        return new PageImpl<>(prekovremenoMapper.toDto(entities), pageable, entityPage.getTotalElements());
    }

    public PrekovremenoDto update(PrekovremenoDto prekovremenoDto, int id) {
        PrekovremenoDto data = findById(id);
        Prekovremeno entity = prekovremenoMapper.toEntity(prekovremenoDto);
        BeanUtil.copyProperties(data, entity);
        return save(prekovremenoMapper.toDto(entity));
    }
}