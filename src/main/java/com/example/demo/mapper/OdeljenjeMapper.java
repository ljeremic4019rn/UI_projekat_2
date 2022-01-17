package com.example.demo.mapper;

import com.example.demo.dto.OdeljenjeDto;
import com.example.demo.model.Odeljenje;
import org.springframework.stereotype.Component;

@Component
public class OdeljenjeMapper {

    private BolnicaZaposleniMapper bolnicaZaposleniMapper;

    public OdeljenjeMapper(LekarMapper lekarMapper, BolnicaZaposleniMapper bolnicaZaposleniMapper) {
        this.bolnicaZaposleniMapper = bolnicaZaposleniMapper;
    }

    public Odeljenje toEntity(OdeljenjeDto odeljenjeDto) {
        Odeljenje odeljenje = new Odeljenje();
        odeljenje.setIme(odeljenjeDto.getIme());
        odeljenje.setBolnica(bolnicaZaposleniMapper.toEntity(odeljenjeDto.getBolnica()));


        return odeljenje;

    }

    public OdeljenjeDto toDto(Odeljenje save) {
        OdeljenjeDto odeljenjeDto = new OdeljenjeDto();
        odeljenjeDto.setIme(save.getIme());
        odeljenjeDto.setBolnica(bolnicaZaposleniMapper.toDto(save.getBolnica()));

        return odeljenjeDto;

    }
}