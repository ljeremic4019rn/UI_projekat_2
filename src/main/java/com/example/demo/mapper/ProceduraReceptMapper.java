package com.example.demo.mapper;

import com.example.demo.dto.ProceduraReceptDto;
import com.example.demo.model.usless.ProceduraRecept;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProceduraReceptMapper extends EntityMapper<ProceduraReceptDto, ProceduraRecept> {
}