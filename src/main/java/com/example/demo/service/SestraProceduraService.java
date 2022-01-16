package com.example.demo.service;

import com.example.demo.dto.SestraProceduraDto;
import com.example.demo.mapper.SestraProceduraMapper;
import com.example.demo.model.usless.SestraProcedura;
import com.example.demo.repository.SestraProceduraRepository;
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
public class SestraProceduraService {
    private final SestraProceduraRepository repository;
    private final SestraProceduraMapper sestraProceduraMapper;

    public SestraProceduraService(SestraProceduraRepository repository, SestraProceduraMapper sestraProceduraMapper) {
        this.repository = repository;
        this.sestraProceduraMapper = sestraProceduraMapper;
    }

    public SestraProceduraDto save(SestraProceduraDto sestraProceduraDto) {
        SestraProcedura entity = sestraProceduraMapper.toEntity(sestraProceduraDto);
        return sestraProceduraMapper.toDto(repository.save(entity));
    }

    public void deleteById(int id) {
        repository.deleteById(id);
    }

    public SestraProceduraDto findById(int id) {
        return sestraProceduraMapper.toDto(repository.findById(id).orElseThrow(ResourceNotFoundException::new));
    }

    public Page<SestraProceduraDto> findByCondition(SestraProceduraDto sestraProceduraDto, Pageable pageable) {
        Page<SestraProcedura> entityPage = repository.findAll(pageable);
        List<SestraProcedura> entities = entityPage.getContent();
        return new PageImpl<>(sestraProceduraMapper.toDto(entities), pageable, entityPage.getTotalElements());
    }

    public SestraProceduraDto update(SestraProceduraDto sestraProceduraDto, int id) {
        SestraProceduraDto data = findById(id);
        SestraProcedura entity = sestraProceduraMapper.toEntity(sestraProceduraDto);
        BeanUtil.copyProperties(data, entity);
        return save(sestraProceduraMapper.toDto(entity));
    }
}