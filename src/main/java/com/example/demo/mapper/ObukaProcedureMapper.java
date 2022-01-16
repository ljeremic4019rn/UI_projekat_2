package com.example.demo.mapper;

import com.example.demo.dto.ObukaProcedureDto;
import com.example.demo.model.ObukaProcedure;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ObukaProcedureMapper extends EntityMapper<ObukaProcedureDto, ObukaProcedure> {
}