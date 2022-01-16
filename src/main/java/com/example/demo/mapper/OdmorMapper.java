package com.example.demo.mapper;

import com.example.demo.dto.OdmorDto;
import com.example.demo.model.Odmor;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface OdmorMapper extends EntityMapper<OdmorDto, Odmor> {
}