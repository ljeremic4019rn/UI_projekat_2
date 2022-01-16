package com.example.demo.mapper;

import com.example.demo.dto.SestraProceduraDto;
import com.example.demo.model.usless.SestraProcedura;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SestraProceduraMapper extends EntityMapper<SestraProceduraDto, SestraProcedura> {
}