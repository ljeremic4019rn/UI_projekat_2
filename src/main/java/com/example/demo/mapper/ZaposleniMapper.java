package com.example.demo.mapper;

import com.example.demo.dto.ZaposleniDto;
import com.example.demo.model.Bolnica;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ZaposleniMapper extends EntityMapper<ZaposleniDto, Bolnica> {
}