package com.example.demo.service;

import com.example.demo.dto.PrijemnaListaDto;
import com.example.demo.mapper.PrijemnaListaMapper;
import com.example.demo.model.PrijemnaLista;
import com.example.demo.repository.PrijemnaListaRepository;
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
public class PrijemnaListaService {
    private final PrijemnaListaRepository repository;
    private final PrijemnaListaMapper prijemnaListaMapper;

    public PrijemnaListaService(PrijemnaListaRepository repository, PrijemnaListaMapper prijemnaListaMapper) {
        this.repository = repository;
        this.prijemnaListaMapper = prijemnaListaMapper;
    }

    public PrijemnaListaDto save(PrijemnaListaDto prijemnaListaDto) {
        PrijemnaLista entity = prijemnaListaMapper.toEntity(prijemnaListaDto);
        return prijemnaListaMapper.toDto(repository.save(entity));
    }

    public void deleteById(int id) {
        repository.deleteById(id);
    }

    public PrijemnaListaDto findById(int id) {
        return prijemnaListaMapper.toDto(repository.findById(id).orElseThrow(ResourceNotFoundException::new));
    }

    public Page<PrijemnaListaDto> findByCondition(PrijemnaListaDto prijemnaListaDto, Pageable pageable) {
        Page<PrijemnaLista> entityPage = repository.findAll(pageable);
        List<PrijemnaLista> entities = entityPage.getContent();
        return new PageImpl<>(prijemnaListaMapper.toDto(entities), pageable, entityPage.getTotalElements());
    }

    public PrijemnaListaDto update(PrijemnaListaDto prijemnaListaDto, int id) {
        PrijemnaListaDto data = findById(id);
        PrijemnaLista entity = prijemnaListaMapper.toEntity(prijemnaListaDto);
        BeanUtil.copyProperties(data, entity);
        return save(prijemnaListaMapper.toDto(entity));
    }
}