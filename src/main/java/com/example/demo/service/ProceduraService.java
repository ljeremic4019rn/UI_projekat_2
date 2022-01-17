package com.example.demo.service;

import com.example.demo.dto.ProceduraDto;
import com.example.demo.mapper.ProceduraMapper;
import com.example.demo.model.Procedura;
import com.example.demo.repository.ProceduraRepository;
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
public class ProceduraService {
    private final ProceduraRepository repository;
    private final ProceduraMapper proceduraMapper;

    public ProceduraService(ProceduraRepository repository, ProceduraMapper proceduraMapper) {
        this.repository = repository;
        this.proceduraMapper = proceduraMapper;
    }

    public ProceduraDto save(ProceduraDto proceduraDto) {
        Procedura entity = proceduraMapper.toEntity(proceduraDto);
        return proceduraMapper.toDto(repository.save(entity));
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public ProceduraDto findById(Long id) {
        if (repository.findById(id).isPresent())
            return proceduraMapper.toDto(repository.findById(id).get());
        return null;
    }
//    public Page<ProceduraDto> findByCondition(ProceduraDto proceduraDto, Pageable pageable) {
//        Page<Procedura> entityPage = repository.findAll(pageable);
//        List<Procedura> entities = entityPage.getContent();
//        return new PageImpl<>(proceduraMapper.toDto(entities), pageable, entityPage.getTotalElements());
//    }

    public ProceduraDto update(ProceduraDto proceduraDto, Long id) {
        ProceduraDto data = findById(id);
        Procedura entity = proceduraMapper.toEntity(proceduraDto);
        BeanUtils.copyProperties(data, entity);
        return save(proceduraMapper.toDto(entity));
    }
}