package com.example.demo.mapper;

import com.example.demo.dto.SobaDto;
import com.example.demo.model.Soba;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface SobaMapper extends EntityMapper<SobaDto, Soba> {
}