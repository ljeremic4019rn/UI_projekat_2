package com.example.demo.service;

import com.example.demo.dto.LekarDto;
import com.example.demo.mapper.LekarMapper;
import com.example.demo.model.Lekar;
import com.example.demo.repository.LekarRepository;
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
public class LekarService {
    private final LekarRepository repository;
    private final LekarMapper lekarMapper;

    public LekarService(LekarRepository repository, LekarMapper lekarMapper) {
        this.repository = repository;
        this.lekarMapper = lekarMapper;
    }

    public LekarDto save(LekarDto lekarDto) {
        Lekar entity = lekarMapper.toEntity(lekarDto);
        return lekarMapper.toDto(repository.save(entity));
    }

    public void deleteById(int id) {
        repository.deleteById(id);
    }

    public LekarDto findById(int id) {
        return lekarMapper.toDto(repository.findById(id).orElseThrow(ResourceNotFoundException::new));
    }

    public Page<LekarDto> findByCondition(LekarDto lekarDto, Pageable pageable) {
        Page<Lekar> entityPage = repository.findAll(pageable);
        List<Lekar> entities = entityPage.getContent();
        return new PageImpl<>(lekarMapper.toDto(entities), pageable, entityPage.getTotalElements());
    }

    public LekarDto update(LekarDto lekarDto, int id) {
        LekarDto data = findById(id);
        Lekar entity = lekarMapper.toEntity(lekarDto);
        BeanUtil.copyProperties(data, entity);
        return save(lekarMapper.toDto(entity));
    }
}