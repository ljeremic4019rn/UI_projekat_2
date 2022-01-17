package com.example.demo.service;

import com.example.demo.dto.BolnicaZaposleniDto;
import com.example.demo.mapper.BolnicaZaposleniMapper;
import com.example.demo.model.BolnicaZaposleni;
import com.example.demo.repository.BolnicaZaposleniRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@Transactional
public class BolnicaZaposleniService {
    private final BolnicaZaposleniRepository repository;
    private final BolnicaZaposleniMapper bolnicaZaposleniMapper;

    public BolnicaZaposleniService(BolnicaZaposleniRepository repository, BolnicaZaposleniMapper bolnicaZaposleniMapper) {
        this.repository = repository;
        this.bolnicaZaposleniMapper = bolnicaZaposleniMapper;
    }

    public BolnicaZaposleniDto save(BolnicaZaposleniDto bolnicaZaposleniDto) {
        BolnicaZaposleni entity = bolnicaZaposleniMapper.toEntity(bolnicaZaposleniDto);
        return bolnicaZaposleniMapper.toDto(repository.save(entity));
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public BolnicaZaposleniDto findById(Long id) {
        if (repository.findById(id).isPresent())
            return bolnicaZaposleniMapper.toDto(repository.findById(id).get());
        return null;
    }

//    public Page<BolnicaDto> findByCondition(BolnicaDto bolnicaDto, Pageable pageable) {
//        Page<Bolnica> entityPage = repository.findAll(pageable);
//        List<Bolnica> entities = entityPage.getContent();
//        return new PageImpl<>(bolnicaMapper.toDto(entities), pageable, entityPage.getTotalElements());
//    }

    public BolnicaZaposleniDto update(BolnicaZaposleniDto bolnicaZaposleniDto, Long id) {
        BolnicaZaposleniDto data = findById(id);
        BolnicaZaposleni entity = bolnicaZaposleniMapper.toEntity(bolnicaZaposleniDto);
        BeanUtils.copyProperties(data, entity);
        return save(bolnicaZaposleniMapper.toDto(entity));
    }
}