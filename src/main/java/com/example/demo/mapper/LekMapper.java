package com.example.demo.mapper;

import com.example.demo.dto.LekDto;
import com.example.demo.model.Lek;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface LekMapper extends EntityMapper<LekDto, Lek> {
}