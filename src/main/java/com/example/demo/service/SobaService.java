package com.example.demo.service;

import com.example.demo.dto.SobaDto;
import com.example.demo.mapper.SobaMapper;
import com.example.demo.model.Soba;
import com.example.demo.repository.SobaRepository;
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
public class SobaService {
    private final SobaRepository repository;
    private final SobaMapper sobaMapper;

    public SobaService(SobaRepository repository, SobaMapper sobaMapper) {
        this.repository = repository;
        this.sobaMapper = sobaMapper;
    }

    public SobaDto save(SobaDto sobaDto) {
        Soba entity = sobaMapper.toEntity(sobaDto);
        return sobaMapper.toDto(repository.save(entity));
    }

    public void deleteById(int id) {
        repository.deleteById(id);
    }

    public SobaDto findById(int id) {
        return sobaMapper.toDto(repository.findById(id).orElseThrow(ResourceNotFoundException::new));
    }

    public Page<SobaDto> findByCondition(SobaDto sobaDto, Pageable pageable) {
        Page<Soba> entityPage = repository.findAll(pageable);
        List<Soba> entities = entityPage.getContent();
        return new PageImpl<>(sobaMapper.toDto(entities), pageable, entityPage.getTotalElements());
    }

    public SobaDto update(SobaDto sobaDto, int id) {
        SobaDto data = findById(id);
        Soba entity = sobaMapper.toEntity(sobaDto);
        BeanUtil.copyProperties(data, entity);
        return save(sobaMapper.toDto(entity));
    }
}