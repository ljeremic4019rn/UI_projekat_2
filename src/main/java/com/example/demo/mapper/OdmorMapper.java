package com.example.demo.mapper;

import com.example.demo.dto.OdmorDto;
import com.example.demo.model.Odmor;
import org.springframework.stereotype.Component;

@Component
public class  OdmorMapper {
    public Odmor toEntity(OdmorDto odmorDto) {
        Odmor odmor = new Odmor();
        odmor.setKraj(odmorDto.getKraj());
        odmor.setPocetak(odmorDto.getPocetak());
        odmor.setBolnicaZaposleniId(odmorDto.getBolnicaZaposleniId());
        return odmor;

    }

    public OdmorDto toDto(Odmor save) {
        OdmorDto odmorDto = new OdmorDto();
        odmorDto.setKraj(save.getKraj());
        odmorDto.setPocetak(save.getPocetak());
        odmorDto.setBolnicaZaposleniId(save.getBolnicaZaposleniId());
        return odmorDto;

    }
}