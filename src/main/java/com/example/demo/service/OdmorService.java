package com.example.demo.service;

import com.example.demo.dto.OdmorDto;
import com.example.demo.mapper.OdmorMapper;
import com.example.demo.model.Odmor;
import com.example.demo.repository.OdmorRepository;
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
public class OdmorService {
    private final OdmorRepository repository;
    private final OdmorMapper odmorMapper;

    public OdmorService(OdmorRepository repository, OdmorMapper odmorMapper) {
        this.repository = repository;
        this.odmorMapper = odmorMapper;
    }

    public OdmorDto save(OdmorDto odmorDto) {
        Odmor entity = odmorMapper.toEntity(odmorDto);
        return odmorMapper.toDto(repository.save(entity));
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public OdmorDto findById(Long id) {
        if (repository.findById(id).isPresent())
            return odmorMapper.toDto(repository.findById(id).get());
        return null;
    }

//    public Page<OdmorDto> findByCondition(OdmorDto odmorDto, Pageable pageable) {
//        Page<Odmor> entityPage = repository.findAll(pageable);
//        List<Odmor> entities = entityPage.getContent();
//        return new PageImpl<>(odmorMapper.toDto(entities), pageable, entityPage.getTotalElements());
//    }

    public OdmorDto update(OdmorDto odmorDto, Long id) {
        OdmorDto data = findById(id);
        Odmor entity = odmorMapper.toEntity(odmorDto);
        BeanUtils.copyProperties(data, entity);
        return save(odmorMapper.toDto(entity));
    }
}