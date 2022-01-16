package com.example.demo.service;

import com.example.demo.dto.PacijentLekDto;
import com.example.demo.mapper.PacijentLekMapper;
import com.example.demo.model.usless.PacijentLek;
import com.example.demo.repository.PacijentLekRepository;
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
public class PacijentLekService {
    private final PacijentLekRepository repository;
    private final PacijentLekMapper pacijentLekMapper;

    public PacijentLekService(PacijentLekRepository repository, PacijentLekMapper pacijentLekMapper) {
        this.repository = repository;
        this.pacijentLekMapper = pacijentLekMapper;
    }

    public PacijentLekDto save(PacijentLekDto pacijentLekDto) {
        PacijentLek entity = pacijentLekMapper.toEntity(pacijentLekDto);
        return pacijentLekMapper.toDto(repository.save(entity));
    }

    public void deleteById(int id) {
        repository.deleteById(id);
    }

    public PacijentLekDto findById(int id) {
        return pacijentLekMapper.toDto(repository.findById(id).orElseThrow(ResourceNotFoundException::new));
    }

    public Page<PacijentLekDto> findByCondition(PacijentLekDto pacijentLekDto, Pageable pageable) {
        Page<PacijentLek> entityPage = repository.findAll(pageable);
        List<PacijentLek> entities = entityPage.getContent();
        return new PageImpl<>(pacijentLekMapper.toDto(entities), pageable, entityPage.getTotalElements());
    }

    public PacijentLekDto update(PacijentLekDto pacijentLekDto, int id) {
        PacijentLekDto data = findById(id);
        PacijentLek entity = pacijentLekMapper.toEntity(pacijentLekDto);
        BeanUtil.copyProperties(data, entity);
        return save(pacijentLekMapper.toDto(entity));
    }
}