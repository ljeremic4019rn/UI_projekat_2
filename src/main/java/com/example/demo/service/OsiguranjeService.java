package com.example.demo.service;

import com.example.demo.dto.OsiguranjeDto;
import com.example.demo.mapper.OsiguranjeMapper;
import com.example.demo.model.Osiguranje;
import com.example.demo.repository.OsiguranjeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
@Transactional
public class OsiguranjeService {
    private final OsiguranjeRepository repository;
    private final OsiguranjeMapper osiguranjeMapper;

    public OsiguranjeService(OsiguranjeRepository repository, OsiguranjeMapper osiguranjeMapper) {
        this.repository = repository;
        this.osiguranjeMapper = osiguranjeMapper;
    }

    public OsiguranjeDto save(OsiguranjeDto osiguranjeDto) {
        Osiguranje entity = osiguranjeMapper.toEntity(osiguranjeDto);
        return osiguranjeMapper.toDto(repository.save(entity));
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public OsiguranjeDto findById(Long id) {
        if (repository.findById(id).isPresent())
            return osiguranjeMapper.toDto(repository.findById(id).get());
        return null;
    }
//    public Page<OsiguranjeDto> findByCondition(OsiguranjeDto osiguranjeDto, Pageable pageable) {
//        Page<Osiguranje> entityPage = repository.findAll(pageable);
//        List<Osiguranje> entities = entityPage.getContent();
//        return new PageImpl<>(osiguranjeMapper.toDto(entities), pageable, entityPage.getTotalElements());
//    }

    public OsiguranjeDto update(OsiguranjeDto osiguranjeDto, Long id) {
        OsiguranjeDto data = findById(id);
        Osiguranje entity = osiguranjeMapper.toEntity(osiguranjeDto);
        BeanUtils.copyProperties(data, entity);
        return save(osiguranjeMapper.toDto(entity));
    }
}