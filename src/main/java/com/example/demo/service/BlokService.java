package com.example.demo.service;

import com.example.demo.dto.BlokDto;
import com.example.demo.mapper.BlokMapper;
import com.example.demo.model.Blok;
import com.example.demo.repository.BlokRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BlokService {
    private final BlokRepository repository;
    private final BlokMapper blokMapper;

    public BlokService(BlokRepository repository, BlokMapper blokMapper) {
        this.repository = repository;
        this.blokMapper = blokMapper;
    }

    public BlokDto save(BlokDto blokDto) {
        Blok entity = blokMapper.toEntity(blokDto);
        return blokMapper.toDto(repository.save(entity));
    }

    public void deleteById(int id) {
        repository.deleteById(id);
    }

    public BlokDto findById(int id) {
        if (repository.findById(id).isPresent())
            return blokMapper.toDto(repository.findById(id));
        return null;
    }

    public Page<BlokDto> findByCondition(BlokDto blokDto, Pageable pageable) {
        Page<Blok> entityPage = repository.findAll(pageable);
        List<Blok> entities = entityPage.getContent();
        return new PageImpl<>(blokMapper.toDto(entities), pageable, entityPage.getTotalElements());
    }

    public BlokDto update(BlokDto blokDto, int id) {
        BlokDto data = findById(id);
        if (data == null) return null;
        Blok entity = blokMapper.toEntity(blokDto);
        BeanUtils.copyProperties(data, entity);
        return save(blokMapper.toDto(entity));
    }
}