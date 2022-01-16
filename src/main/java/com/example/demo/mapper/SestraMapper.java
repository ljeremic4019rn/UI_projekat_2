package com.example.demo.mapper;

import com.example.demo.dto.SestraDto;
import com.example.demo.model.Sestra;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface SestraMapper extends EntityMapper<SestraDto, Sestra> {
}