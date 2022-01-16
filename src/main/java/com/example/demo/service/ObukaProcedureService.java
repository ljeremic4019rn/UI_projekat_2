package com.example.demo.service;

import com.example.demo.dto.ObukaProcedureDto;
import com.example.demo.mapper.ObukaProcedureMapper;
import com.example.demo.model.ObukaProcedure;
import com.example.demo.repository.ObukaProcedureRepository;
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
public class ObukaProcedureService {
    private final ObukaProcedureRepository repository;
    private final ObukaProcedureMapper obukaProcedureMapper;

    public ObukaProcedureService(ObukaProcedureRepository repository, ObukaProcedureMapper obukaProcedureMapper) {
        this.repository = repository;
        this.obukaProcedureMapper = obukaProcedureMapper;
    }

    public ObukaProcedureDto save(ObukaProcedureDto obukaProcedureDto) {
        ObukaProcedure entity = obukaProcedureMapper.toEntity(obukaProcedureDto);
        return obukaProcedureMapper.toDto(repository.save(entity));
    }

    public void deleteById(int id) {
        repository.deleteById(id);
    }

    public ObukaProcedureDto findById(int id) {
        return obukaProcedureMapper.toDto(repository.findById(id).orElseThrow(ResourceNotFoundException::new));
    }

    public Page<ObukaProcedureDto> findByCondition(ObukaProcedureDto obukaProcedureDto, Pageable pageable) {
        Page<ObukaProcedure> entityPage = repository.findAll(pageable);
        List<ObukaProcedure> entities = entityPage.getContent();
        return new PageImpl<>(obukaProcedureMapper.toDto(entities), pageable, entityPage.getTotalElements());
    }

    public ObukaProcedureDto update(ObukaProcedureDto obukaProcedureDto, int id) {
        ObukaProcedureDto data = findById(id);
        ObukaProcedure entity = obukaProcedureMapper.toEntity(obukaProcedureDto);
        BeanUtil.copyProperties(data, entity);
        return save(obukaProcedureMapper.toDto(entity));
    }
}