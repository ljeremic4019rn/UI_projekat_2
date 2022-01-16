package com.example.demo.mapper;

import com.example.demo.dto.CovidListaDto;
import com.example.demo.model.CovidLista;

@Mapper(componentModel = "spring")
public interface CovidListaMapper extends EntityMapper<CovidListaDto, CovidLista> {
}