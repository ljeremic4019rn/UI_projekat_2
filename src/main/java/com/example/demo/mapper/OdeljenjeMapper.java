package com.example.demo.mapper;

import com.example.demo.dto.OdeljenjeDto;
import com.example.demo.model.Odeljenje;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface OdeljenjeMapper extends EntityMapper<OdeljenjeDto, Odeljenje> {
}