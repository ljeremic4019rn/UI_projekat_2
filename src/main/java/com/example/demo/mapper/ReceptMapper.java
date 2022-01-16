package com.example.demo.mapper;

import com.example.demo.dto.ReceptDto;
import com.example.demo.model.Recept;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ReceptMapper extends EntityMapper<ReceptDto, Recept> {
}