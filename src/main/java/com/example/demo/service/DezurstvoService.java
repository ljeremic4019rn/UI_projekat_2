package com.example.demo.service;

import com.example.demo.dto.DezurstvoDto;
import com.example.demo.mapper.DezurstvoMapper;
import com.example.demo.model.Dezurstvo;
import com.example.demo.repository.DezurstvoRepository;
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
public class DezurstvoService {
    private final DezurstvoRepository repository;
    private final DezurstvoMapper dezurstvoMapper;

    public DezurstvoService(DezurstvoRepository repository, DezurstvoMapper dezurstvoMapper) {
        this.repository = repository;
        this.dezurstvoMapper = dezurstvoMapper;
    }

    public DezurstvoDto save(DezurstvoDto dezurstvoDto) {
        Dezurstvo entity = dezurstvoMapper.toEntity(dezurstvoDto);
        return dezurstvoMapper.toDto(repository.save(entity));
    }

    public void deleteById(int id) {
        repository.deleteById(id);
    }

    public DezurstvoDto findById(int id) {
        return dezurstvoMapper.toDto(repository.findById(id).orElseThrow(ResourceNotFoundException::new));
    }

    public Page<DezurstvoDto> findByCondition(DezurstvoDto dezurstvoDto, Pageable pageable) {
        Page<Dezurstvo> entityPage = repository.findAll(pageable);
        List<Dezurstvo> entities = entityPage.getContent();
        return new PageImpl<>(dezurstvoMapper.toDto(entities), pageable, entityPage.getTotalElements());
    }

    public DezurstvoDto update(DezurstvoDto dezurstvoDto, int id) {
        DezurstvoDto data = findById(id);
        Dezurstvo entity = dezurstvoMapper.toEntity(dezurstvoDto);
        BeanUtil.copyProperties(data, entity);
        return save(dezurstvoMapper.toDto(entity));
    }
}