package com.example.demo.mapper;

import com.example.demo.dto.CovidListaLekDto;
import com.example.demo.model.usless.CovidListaLek;

@Mapper(componentModel = "spring")
public interface CovidListaLekMapper extends EntityMapper<CovidListaLekDto, CovidListaLek> {
}