package com.example.demo.mapper;

import com.example.demo.dto.LekReceptDto;
import com.example.demo.model.usless.LekRecept;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LekReceptMapper extends EntityMapper<LekReceptDto, LekRecept> {
}