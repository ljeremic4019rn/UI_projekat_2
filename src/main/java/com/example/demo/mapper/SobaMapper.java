package com.example.demo.mapper;

import com.example.demo.dto.SobaDto;
import com.example.demo.model.Soba;
import org.springframework.stereotype.Component;

@Component
public class SobaMapper {
    public Soba toEntity(SobaDto sobaDto) {
        Soba soba = new Soba();
        soba.setBroj(sobaDto.getBroj());
        soba.setIntenzivnaNega(sobaDto.getIntenzivnaNega());
        soba.setBlokId(sobaDto.getBlokId());
        return soba;

    }

    public SobaDto toDto(Soba save) {
        SobaDto sobaDto = new SobaDto();
        sobaDto.setBroj(save.getBroj());
        sobaDto.setIntenzivnaNega(save.getIntenzivnaNega());
        sobaDto.setBlokId(save.getBlokId());
        return sobaDto;

    }
}