package com.example.demo.service;

import com.example.demo.dto.OdeljenjeLekarDezurstvoDto;
import com.example.demo.mapper.OdeljenjeLekarDezurstvoMapper;
import com.example.demo.model.usless.OdeljenjeLekarDezurstvo;
import com.example.demo.repository.OdeljenjeLekarDezurstvoRepository;
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
public class OdeljenjeLekarDezurstvoService {
    private final OdeljenjeLekarDezurstvoRepository repository;
    private final OdeljenjeLekarDezurstvoMapper odeljenjeLekarDezurstvoMapper;

    public OdeljenjeLekarDezurstvoService(OdeljenjeLekarDezurstvoRepository repository, OdeljenjeLekarDezurstvoMapper odeljenjeLekarDezurstvoMapper) {
        this.repository = repository;
        this.odeljenjeLekarDezurstvoMapper = odeljenjeLekarDezurstvoMapper;
    }

    public OdeljenjeLekarDezurstvoDto save(OdeljenjeLekarDezurstvoDto odeljenjeLekarDezurstvoDto) {
        OdeljenjeLekarDezurstvo entity = odeljenjeLekarDezurstvoMapper.toEntity(odeljenjeLekarDezurstvoDto);
        return odeljenjeLekarDezurstvoMapper.toDto(repository.save(entity));
    }

    public void deleteById(int id) {
        repository.deleteById(id);
    }

    public OdeljenjeLekarDezurstvoDto findById(int id) {
        return odeljenjeLekarDezurstvoMapper.toDto(repository.findById(id).orElseThrow(ResourceNotFoundException::new));
    }

    public Page<OdeljenjeLekarDezurstvoDto> findByCondition(OdeljenjeLekarDezurstvoDto odeljenjeLekarDezurstvoDto, Pageable pageable) {
        Page<OdeljenjeLekarDezurstvo> entityPage = repository.findAll(pageable);
        List<OdeljenjeLekarDezurstvo> entities = entityPage.getContent();
        return new PageImpl<>(odeljenjeLekarDezurstvoMapper.toDto(entities), pageable, entityPage.getTotalElements());
    }

    public OdeljenjeLekarDezurstvoDto update(OdeljenjeLekarDezurstvoDto odeljenjeLekarDezurstvoDto, int id) {
        OdeljenjeLekarDezurstvoDto data = findById(id);
        OdeljenjeLekarDezurstvo entity = odeljenjeLekarDezurstvoMapper.toEntity(odeljenjeLekarDezurstvoDto);
        BeanUtil.copyProperties(data, entity);
        return save(odeljenjeLekarDezurstvoMapper.toDto(entity));
    }
}