package com.example.demo.service;

import com.example.demo.dto.DijagonzaDto;
import com.example.demo.mapper.DijagonzaMapper;
import com.example.demo.model.Dijagonza;
import com.example.demo.repository.DijagonzaRepository;
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
public class DijagonzaService {
    private final DijagonzaRepository repository;
    private final DijagonzaMapper dijagonzaMapper;

    public DijagonzaService(DijagonzaRepository repository, DijagonzaMapper dijagonzaMapper) {
        this.repository = repository;
        this.dijagonzaMapper = dijagonzaMapper;
    }

    public DijagonzaDto save(DijagonzaDto dijagonzaDto) {
        Dijagonza entity = dijagonzaMapper.toEntity(dijagonzaDto);
        return dijagonzaMapper.toDto(repository.save(entity));
    }

    public void deleteById(int id) {
        repository.deleteById(id);
    }

    public DijagonzaDto findById(int id) {
        return dijagonzaMapper.toDto(repository.findById(id).orElseThrow(ResourceNotFoundException::new));
    }

    public Page<DijagonzaDto> findByCondition(DijagonzaDto dijagonzaDto, Pageable pageable) {
        Page<Dijagonza> entityPage = repository.findAll(pageable);
        List<Dijagonza> entities = entityPage.getContent();
        return new PageImpl<>(dijagonzaMapper.toDto(entities), pageable, entityPage.getTotalElements());
    }

    public DijagonzaDto update(DijagonzaDto dijagonzaDto, int id) {
        DijagonzaDto data = findById(id);
        Dijagonza entity = dijagonzaMapper.toEntity(dijagonzaDto);
        BeanUtil.copyProperties(data, entity);
        return save(dijagonzaMapper.toDto(entity));
    }
}