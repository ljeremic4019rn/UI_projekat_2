package com.example.demo.mapper;

import com.example.demo.dto.PacijentLekDto;
import com.example.demo.model.usless.PacijentLek;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PacijentLekMapper extends EntityMapper<PacijentLekDto, PacijentLek> {
}