package com.example.demo.mapper;

import com.example.demo.dto.OdeljenjeLekarDezurstvoDto;
import com.example.demo.model.usless.OdeljenjeLekarDezurstvo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OdeljenjeLekarDezurstvoMapper extends EntityMapper<OdeljenjeLekarDezurstvoDto, OdeljenjeLekarDezurstvo> {
}