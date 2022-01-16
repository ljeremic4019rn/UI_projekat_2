package com.example.demo.service;

import com.example.demo.dto.OdeljenjeDto;
import com.example.demo.mapper.OdeljenjeMapper;
import com.example.demo.model.Odeljenje;
import com.example.demo.repository.OdeljenjeRepository;
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
public class OdeljenjeService {
    private final OdeljenjeRepository repository;
    private final OdeljenjeMapper odeljenjeMapper;

    public OdeljenjeService(OdeljenjeRepository repository, OdeljenjeMapper odeljenjeMapper) {
        this.repository = repository;
        this.odeljenjeMapper = odeljenjeMapper;
    }

    public OdeljenjeDto save(OdeljenjeDto odeljenjeDto) {
        Odeljenje entity = odeljenjeMapper.toEntity(odeljenjeDto);
        return odeljenjeMapper.toDto(repository.save(entity));
    }

    public void deleteById(int id) {
        repository.deleteById(id);
    }

    public OdeljenjeDto findById(int id) {
        return odeljenjeMapper.toDto(repository.findById(id).orElseThrow(ResourceNotFoundException::new));
    }

    public Page<OdeljenjeDto> findByCondition(OdeljenjeDto odeljenjeDto, Pageable pageable) {
        Page<Odeljenje> entityPage = repository.findAll(pageable);
        List<Odeljenje> entities = entityPage.getContent();
        return new PageImpl<>(odeljenjeMapper.toDto(entities), pageable, entityPage.getTotalElements());
    }

    public OdeljenjeDto update(OdeljenjeDto odeljenjeDto, int id) {
        OdeljenjeDto data = findById(id);
        Odeljenje entity = odeljenjeMapper.toEntity(odeljenjeDto);
        BeanUtil.copyProperties(data, entity);
        return save(odeljenjeMapper.toDto(entity));
    }
}