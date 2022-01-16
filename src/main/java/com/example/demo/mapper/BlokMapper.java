package com.example.demo.mapper;

import com.example.demo.dto.BlokDto;
import com.example.demo.model.Blok;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper(componentModel = "spring")
public interface BlokMapper extends EntityMapper<BlokDto, Blok> {
}