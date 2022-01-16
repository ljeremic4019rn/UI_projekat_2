package com.example.demo.mapper;

import com.example.demo.dto.ProceduraDto;
import com.example.demo.model.Procedura;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProceduraMapper extends EntityMapper<ProceduraDto, Procedura> {
}