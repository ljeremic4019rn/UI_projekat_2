package com.example.demo.service;

import com.example.demo.dto.ReceptLekarDto;
import com.example.demo.mapper.ReceptLekarMapper;
import com.example.demo.model.usless.ReceptLekar;
import com.example.demo.repository.ReceptLekarRepository;
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
public class ReceptLekarService {
    private final ReceptLekarRepository repository;
    private final ReceptLekarMapper receptLekarMapper;

    public ReceptLekarService(ReceptLekarRepository repository, ReceptLekarMapper receptLekarMapper) {
        this.repository = repository;
        this.receptLekarMapper = receptLekarMapper;
    }

    public ReceptLekarDto save(ReceptLekarDto receptLekarDto) {
        ReceptLekar entity = receptLekarMapper.toEntity(receptLekarDto);
        return receptLekarMapper.toDto(repository.save(entity));
    }

    public void deleteById(int id) {
        repository.deleteById(id);
    }

    public ReceptLekarDto findById(int id) {
        return receptLekarMapper.toDto(repository.findById(id).orElseThrow(ResourceNotFoundException::new));
    }

    public Page<ReceptLekarDto> findByCondition(ReceptLekarDto receptLekarDto, Pageable pageable) {
        Page<ReceptLekar> entityPage = repository.findAll(pageable);
        List<ReceptLekar> entities = entityPage.getContent();
        return new PageImpl<>(receptLekarMapper.toDto(entities), pageable, entityPage.getTotalElements());
    }

    public ReceptLekarDto update(ReceptLekarDto receptLekarDto, int id) {
        ReceptLekarDto data = findById(id);
        ReceptLekar entity = receptLekarMapper.toEntity(receptLekarDto);
        BeanUtil.copyProperties(data, entity);
        return save(receptLekarMapper.toDto(entity));
    }
}