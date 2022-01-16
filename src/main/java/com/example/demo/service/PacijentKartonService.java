package com.example.demo.service;

import com.example.demo.dto.PacijentKartonDto;
import com.example.demo.mapper.PacijentKartonMapper;
import com.example.demo.model.PacijentKarton;
import com.example.demo.repository.PacijentKartonRepository;
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
public class PacijentKartonService {
    private final PacijentKartonRepository repository;
    private final PacijentKartonMapper pacijentKartonMapper;

    public PacijentKartonService(PacijentKartonRepository repository, PacijentKartonMapper pacijentKartonMapper) {
        this.repository = repository;
        this.pacijentKartonMapper = pacijentKartonMapper;
    }

    public PacijentKartonDto save(PacijentKartonDto pacijentKartonDto) {
        PacijentKarton entity = pacijentKartonMapper.toEntity(pacijentKartonDto);
        return pacijentKartonMapper.toDto(repository.save(entity));
    }

    public void deleteById(int id) {
        repository.deleteById(id);
    }

    public PacijentKartonDto findById(int id) {
        return pacijentKartonMapper.toDto(repository.findById(id).orElseThrow(ResourceNotFoundException::new));
    }

    public Page<PacijentKartonDto> findByCondition(PacijentKartonDto pacijentKartonDto, Pageable pageable) {
        Page<PacijentKarton> entityPage = repository.findAll(pageable);
        List<PacijentKarton> entities = entityPage.getContent();
        return new PageImpl<>(pacijentKartonMapper.toDto(entities), pageable, entityPage.getTotalElements());
    }

    public PacijentKartonDto update(PacijentKartonDto pacijentKartonDto, int id) {
        PacijentKartonDto data = findById(id);
        PacijentKarton entity = pacijentKartonMapper.toEntity(pacijentKartonDto);
        BeanUtil.copyProperties(data, entity);
        return save(pacijentKartonMapper.toDto(entity));
    }
}