package com.example.demo.mapper;

import com.example.demo.dto.OsiguranjeDto;
import com.example.demo.model.Osiguranje;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface OsiguranjeMapper extends EntityMapper<OsiguranjeDto, Osiguranje> {
}