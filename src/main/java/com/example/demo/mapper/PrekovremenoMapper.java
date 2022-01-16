package com.example.demo.mapper;

import com.example.demo.dto.PrekovremenoDto;
import com.example.demo.model.Prekovremeno;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PrekovremenoMapper extends EntityMapper<PrekovremenoDto, Prekovremeno> {
}