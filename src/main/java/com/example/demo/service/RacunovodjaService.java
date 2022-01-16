package com.example.demo.service;

import com.example.demo.dto.RacunovodjaDto;
import com.example.demo.mapper.RacunovodjaMapper;
import com.example.demo.model.Racunovodja;
import com.example.demo.repository.RacunovodjaRepository;
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
public class RacunovodjaService {
    private final RacunovodjaRepository repository;
    private final RacunovodjaMapper racunovodjaMapper;

    public RacunovodjaService(RacunovodjaRepository repository, RacunovodjaMapper racunovodjaMapper) {
        this.repository = repository;
        this.racunovodjaMapper = racunovodjaMapper;
    }

    public RacunovodjaDto save(RacunovodjaDto racunovodjaDto) {
        Racunovodja entity = racunovodjaMapper.toEntity(racunovodjaDto);
        return racunovodjaMapper.toDto(repository.save(entity));
    }

    public void deleteById(int id) {
        repository.deleteById(id);
    }

    public RacunovodjaDto findById(int id) {
        return racunovodjaMapper.toDto(repository.findById(id).orElseThrow(ResourceNotFoundException::new));
    }

    public Page<RacunovodjaDto> findByCondition(RacunovodjaDto racunovodjaDto, Pageable pageable) {
        Page<Racunovodja> entityPage = repository.findAll(pageable);
        List<Racunovodja> entities = entityPage.getContent();
        return new PageImpl<>(racunovodjaMapper.toDto(entities), pageable, entityPage.getTotalElements());
    }

    public RacunovodjaDto update(RacunovodjaDto racunovodjaDto, int id) {
        RacunovodjaDto data = findById(id);
        Racunovodja entity = racunovodjaMapper.toEntity(racunovodjaDto);
        BeanUtil.copyProperties(data, entity);
        return save(racunovodjaMapper.toDto(entity));
    }
}