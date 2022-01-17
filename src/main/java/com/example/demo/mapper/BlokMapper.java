package com.example.demo.mapper;

import com.example.demo.dto.BlokDto;
import com.example.demo.model.Blok;
import org.springframework.stereotype.Component;

@Component
public class  BlokMapper {
    private SobaMapper sobaMapper;
    private SestraMapper sestraMapper;

    public BlokMapper(SobaMapper sobaMapper, SestraMapper sestraMapper) {
        this.sobaMapper = sobaMapper;
        this.sestraMapper = sestraMapper;
    }

    public Blok toEntity(BlokDto blokDto) {
        Blok blok = new Blok();
        blok.setIme(blokDto.getIme());
        blok.setKod(blokDto.getKod());
        blok.setSprat(blokDto.getSprat());
        blok.setOdeljenjeId(blokDto.getOdeljenjeId());
        blok.setSestraDezurna(sestraMapper.toEntity(blokDto.getSestra()));
        return blok;
    }

    public BlokDto toDto(Blok blok) {
        BlokDto blokDto = new BlokDto();
        blokDto.setIme(blok.getIme());
        blokDto.setKod(blok.getKod());
        blokDto.setSprat(blok.getSprat());
        blokDto.setOdeljenjeId(blok.getOdeljenjeId());
        blokDto.setSestra(sestraMapper.toDto(blok.getSestraDezurna()));
        return blokDto;
    }
}