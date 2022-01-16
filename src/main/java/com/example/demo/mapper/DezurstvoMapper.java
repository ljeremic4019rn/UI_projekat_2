package com.example.demo.mapper;

import com.example.demo.dto.DezurstvoDto;
import com.example.demo.model.Dezurstvo;

@Mapper(componentModel = "spring")
public interface DezurstvoMapper extends EntityMapper<DezurstvoDto, Dezurstvo> {
}