package com.example.demo.mapper;

import com.example.demo.dto.RacunovodjaDto;
import com.example.demo.model.Racunovodja;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface RacunovodjaMapper extends EntityMapper<RacunovodjaDto, Racunovodja> {
}