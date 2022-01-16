package com.example.demo.mapper;

import com.example.demo.dto.PrijemnaListaDto;
import com.example.demo.model.PrijemnaLista;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PrijemnaListaMapper extends EntityMapper<PrijemnaListaDto, PrijemnaLista> {
}