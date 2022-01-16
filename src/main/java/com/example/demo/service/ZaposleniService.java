package com.example.demo.service;

import com.example.demo.dto.ZaposleniDto;
import com.example.demo.mapper.ZaposleniMapper;
import com.example.demo.model.Bolnica;
import com.example.demo.repository.ZaposleniRepository;
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
public class ZaposleniService {
    private final ZaposleniRepository repository;
    private final ZaposleniMapper zaposleniMapper;

    public ZaposleniService(ZaposleniRepository repository, ZaposleniMapper zaposleniMapper) {
        this.repository = repository;
        this.zaposleniMapper = zaposleniMapper;
    }

    public ZaposleniDto save(ZaposleniDto zaposleniDto) {
        Bolnica entity = zaposleniMapper.toEntity(zaposleniDto);
        return zaposleniMapper.toDto(repository.save(entity));
    }

    public void deleteById(int id) {
        repository.deleteById(id);
    }

    public ZaposleniDto findById(int id) {
        return zaposleniMapper.toDto(repository.findById(id).orElseThrow(ResourceNotFoundException::new));
    }

    public Page<ZaposleniDto> findByCondition(ZaposleniDto zaposleniDto, Pageable pageable) {
        Page<Bolnica> entityPage = repository.findAll(pageable);
        List<Bolnica> entities = entityPage.getContent();
        return new PageImpl<>(zaposleniMapper.toDto(entities), pageable, entityPage.getTotalElements());
    }

    public ZaposleniDto update(ZaposleniDto zaposleniDto, int id) {
        ZaposleniDto data = findById(id);
        Bolnica entity = zaposleniMapper.toEntity(zaposleniDto);
        BeanUtil.copyProperties(data, entity);
        return save(zaposleniMapper.toDto(entity));
    }
}