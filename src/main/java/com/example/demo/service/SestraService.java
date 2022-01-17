package com.example.demo.service;

import com.example.demo.dto.SestraDto;
import com.example.demo.mapper.SestraMapper;
import com.example.demo.model.Sestra;
import com.example.demo.repository.SestraRepository;
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
public class SestraService {
    private final SestraRepository repository;
    private final SestraMapper sestraMapper;

    public SestraService(SestraRepository repository, SestraMapper sestraMapper) {
        this.repository = repository;
        this.sestraMapper = sestraMapper;
    }

    public SestraDto save(SestraDto sestraDto) {
        Sestra entity = sestraMapper.toEntity(sestraDto);
        return sestraMapper.toDto(repository.save(entity));
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public SestraDto findById(Long id) {
        if (repository.findById(id).isPresent())
            return sestraMapper.toDto(repository.findById(id).get());
        return null;
    }
//    public Page<SestraDto> findByCondition(SestraDto sestraDto, Pageable pageable) {
//        Page<Sestra> entityPage = repository.findAll(pageable);
//        List<Sestra> entities = entityPage.getContent();
//        return new PageImpl<>(sestraMapper.toDto(entities), pageable, entityPage.getTotalElements());
//    }

    public SestraDto update(SestraDto sestraDto, Long id) {
        SestraDto data = findById(id);
        Sestra entity = sestraMapper.toEntity(sestraDto);
        BeanUtils.copyProperties(data, entity);
        return save(sestraMapper.toDto(entity));
    }
}