package com.example.demo.service;

import com.example.demo.dto.CovidListaDto;
import com.example.demo.mapper.CovidListaMapper;
import com.example.demo.model.CovidLista;
import com.example.demo.repository.CovidListaRepository;
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
public class CovidListaService {
    private final CovidListaRepository repository;
    private final CovidListaMapper covidListaMapper;

    public CovidListaService(CovidListaRepository repository, CovidListaMapper covidListaMapper) {
        this.repository = repository;
        this.covidListaMapper = covidListaMapper;
    }

    public CovidListaDto save(CovidListaDto covidListaDto) {
        CovidLista entity = covidListaMapper.toEntity(covidListaDto);
        return covidListaMapper.toDto(repository.save(entity));
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public CovidListaDto findById(Long id) {
        if (repository.findById(id).isPresent())
            return covidListaMapper.toDto(repository.findById(id).get());
        return null;
    }
//
//    public Page<CovidListaDto> findByCondition(CovidListaDto covidListaDto, Pageable pageable) {
//        Page<CovidLista> entityPage = repository.findAll(pageable);
//        List<CovidLista> entities = entityPage.getContent();
//        return new PageImpl<>(covidListaMapper.toDto(entities), pageable, entityPage.getTotalElements());
//    }

    public CovidListaDto update(CovidListaDto covidListaDto, Long id) {
        CovidListaDto data = findById(id);
        CovidLista entity = covidListaMapper.toEntity(covidListaDto);
        BeanUtils.copyProperties(data, entity);
        return save(covidListaMapper.toDto(entity));
    }
}