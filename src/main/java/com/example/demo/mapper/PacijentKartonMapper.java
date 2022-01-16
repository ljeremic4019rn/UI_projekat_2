package com.example.demo.mapper;

import com.example.demo.dto.PacijentKartonDto;
import com.example.demo.model.PacijentKarton;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PacijentKartonMapper extends EntityMapper<PacijentKartonDto, PacijentKarton> {
}