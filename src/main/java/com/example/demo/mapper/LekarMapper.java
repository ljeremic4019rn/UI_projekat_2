package com.example.demo.mapper;

import com.example.demo.dto.LekarDto;
import com.example.demo.model.Lekar;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface LekarMapper extends EntityMapper<LekarDto, Lekar> {
}