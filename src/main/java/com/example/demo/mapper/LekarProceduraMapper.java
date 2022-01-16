package com.example.demo.mapper;

import com.example.demo.dto.LekarProceduraDto;
import com.example.demo.model.usless.LekarProcedura;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LekarProceduraMapper extends EntityMapper<LekarProceduraDto, LekarProcedura> {
}