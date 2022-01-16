package com.example.demo.mapper;

import com.example.demo.dto.ReceptLekarDto;
import com.example.demo.model.usless.ReceptLekar;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ReceptLekarMapper extends EntityMapper<ReceptLekarDto, ReceptLekar> {
}