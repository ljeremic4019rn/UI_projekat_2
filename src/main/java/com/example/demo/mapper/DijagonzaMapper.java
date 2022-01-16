package com.example.demo.mapper;

import com.example.demo.dto.DijagonzaDto;
import com.example.demo.model.Dijagonza;

@Mapper(componentModel = "spring")
public interface DijagonzaMapper extends EntityMapper<DijagonzaDto, Dijagonza> {
}