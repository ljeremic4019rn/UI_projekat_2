package com.example.demo.mapper;

import com.example.demo.dto.BlokSestraDezurstvoDto;
import com.example.demo.model.usless.BlokSestraDezurstvo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BlokSestraDezurstvoMapper extends EntityMapper<BlokSestraDezurstvoDto, BlokSestraDezurstvo> {
}