package com.example.demo.service;

import com.example.demo.dto.LekarProceduraDto;
import com.example.demo.mapper.LekarProceduraMapper;
import com.example.demo.model.usless.LekarProcedura;
import com.example.demo.repository.LekarProceduraRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
@Transactional
public class LekarProceduraService {
    private final LekarProceduraRepository repository;
    private final LekarProceduraMapper lekarProceduraMapper;

    public LekarProceduraService(LekarProceduraRepository repository, LekarProceduraMapper lekarProceduraMapper) {
        this.repository = repository;
        this.lekarProceduraMapper = lekarProceduraMapper;
    }

    public LekarProceduraDto save(LekarProceduraDto lekarProceduraDto) {
        LekarProcedura entity = lekarProceduraMapper.toEntity(lekarProceduraDto);
        return lekarProceduraMapper.toDto(repository.save(entity));
    }

    public void deleteById(int id) {
        repository.deleteById(id);
    }

    public LekarProceduraDto findById(int id) {
        return lekarProceduraMapper.toDto(repository.findById(id).orElseThrow(ResourceNotFoundException::new));
    }

    public Page<LekarProceduraDto> findByCondition(LekarProceduraDto lekarProceduraDto, Pageable pageable) {
        Page<LekarProcedura> entityPage = repository.findAll(pageable);
        List<LekarProcedura> entities = entityPage.getContent();
        return new PageImpl<>(lekarProceduraMapper.toDto(entities), pageable, entityPage.getTotalElements());
    }

    public LekarProceduraDto update(LekarProceduraDto lekarProceduraDto, int id) {
        LekarProceduraDto data = findById(id);
        LekarProcedura entity = lekarProceduraMapper.toEntity(lekarProceduraDto);
        BeanUtil.copyProperties(data, entity);
        return save(lekarProceduraMapper.toDto(entity));
    }
}