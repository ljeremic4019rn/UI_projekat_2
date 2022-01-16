package com.example.demo.service;

import com.example.demo.dto.CovidListaLekDto;
import com.example.demo.mapper.CovidListaLekMapper;
import com.example.demo.model.usless.CovidListaLek;
import com.example.demo.repository.CovidListaLekRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
@Transactional
public class CovidListaLekService {
    private final CovidListaLekRepository repository;
    private final CovidListaLekMapper covidListaLekMapper;

    public CovidListaLekService(CovidListaLekRepository repository, CovidListaLekMapper covidListaLekMapper) {
        this.repository = repository;
        this.covidListaLekMapper = covidListaLekMapper;
    }

    public CovidListaLekDto save(CovidListaLekDto covidListaLekDto) {
        CovidListaLek entity = covidListaLekMapper.toEntity(covidListaLekDto);
        return covidListaLekMapper.toDto(repository.save(entity));
    }

    public void deleteById(int id) {
        repository.deleteById(id);
    }

    public CovidListaLekDto findById(int id) {
        return covidListaLekMapper.toDto(repository.findById(id).orElseThrow(ResourceNotFoundException::new));
    }

    public Page<CovidListaLekDto> findByCondition(CovidListaLekDto covidListaLekDto, Pageable pageable) {
        Page<CovidListaLek> entityPage = repository.findAll(pageable);
        List<CovidListaLek> entities = entityPage.getContent();
        return new PageImpl<>(covidListaLekMapper.toDto(entities), pageable, entityPage.getTotalElements());
    }

    public CovidListaLekDto update(CovidListaLekDto covidListaLekDto, int id) {
        CovidListaLekDto data = findById(id);
        CovidListaLek entity = covidListaLekMapper.toEntity(covidListaLekDto);
        BeanUtil.copyProperties(data, entity);
        return save(covidListaLekMapper.toDto(entity));
    }
}