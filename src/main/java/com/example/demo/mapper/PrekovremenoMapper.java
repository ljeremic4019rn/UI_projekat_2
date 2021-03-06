package com.example.demo.mapper;

import com.example.demo.dto.PrekovremenoDto;
import com.example.demo.model.Prekovremeno;
import org.springframework.stereotype.Component;

@Component
public class  PrekovremenoMapper  {
    public Prekovremeno toEntity(PrekovremenoDto prekovremenoDto) {
        Prekovremeno prekovremeno = new Prekovremeno();
        prekovremeno.setDatum(prekovremenoDto.getDatum());
        prekovremeno.setTrajanje(prekovremenoDto.getPrekovremenoId());
        prekovremeno.setBolnicaZaposleniId(prekovremenoDto.getBolnicaZaposleniId());

        return prekovremeno;
    }

    public PrekovremenoDto toDto(Prekovremeno save) {
        PrekovremenoDto prekovremenoDto = new PrekovremenoDto();
        prekovremenoDto.setDatum(save.getDatum());
        prekovremenoDto.setTrajanje(save.getTrajanje());
        prekovremenoDto.setBolnicaZaposleniId(save.getBolnicaZaposleniId());

        return prekovremenoDto;

    }
}