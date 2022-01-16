package com.example.demo.service;

import com.example.demo.dto.BlokSestraDezurstvoDto;
import com.example.demo.mapper.BlokSestraDezurstvoMapper;
import com.example.demo.model.usless.BlokSestraDezurstvo;
import com.example.demo.repository.BlokSestraDezurstvoRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
@Transactional
public class BlokSestraDezurstvoService {
    private final BlokSestraDezurstvoRepository repository;
    private final BlokSestraDezurstvoMapper blokSestraDezurstvoMapper;

    public BlokSestraDezurstvoService(BlokSestraDezurstvoRepository repository, BlokSestraDezurstvoMapper blokSestraDezurstvoMapper) {
        this.repository = repository;
        this.blokSestraDezurstvoMapper = blokSestraDezurstvoMapper;
    }

    public BlokSestraDezurstvoDto save(BlokSestraDezurstvoDto blokSestraDezurstvoDto) {
        BlokSestraDezurstvo entity = blokSestraDezurstvoMapper.toEntity(blokSestraDezurstvoDto);
        return blokSestraDezurstvoMapper.toDto(repository.save(entity));
    }

    public void deleteById(int id) {
        repository.deleteById(id);
    }

    public BlokSestraDezurstvoDto findById(int id) {
        return blokSestraDezurstvoMapper.toDto(repository.findById(id).orElseThrow(ResourceNotFoundException::new));
    }

    public Page<BlokSestraDezurstvoDto> findByCondition(BlokSestraDezurstvoDto blokSestraDezurstvoDto, Pageable pageable) {
        Page<BlokSestraDezurstvo> entityPage = repository.findAll(pageable);
        List<BlokSestraDezurstvo> entities = entityPage.getContent();
        return new PageImpl<>(blokSestraDezurstvoMapper.toDto(entities), pageable, entityPage.getTotalElements());
    }

    public BlokSestraDezurstvoDto update(BlokSestraDezurstvoDto blokSestraDezurstvoDto, int id) {
        BlokSestraDezurstvoDto data = findById(id);
        BlokSestraDezurstvo entity = blokSestraDezurstvoMapper.toEntity(blokSestraDezurstvoDto);
        BeanUtil.copyProperties(data, entity);
        return save(blokSestraDezurstvoMapper.toDto(entity));
    }
}