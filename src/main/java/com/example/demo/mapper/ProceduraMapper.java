package com.example.demo.mapper;

import com.example.demo.dto.ProceduraDto;
import com.example.demo.model.Procedura;
import com.example.demo.model.Soba;
import org.springframework.stereotype.Component;

@Component
public class ProceduraMapper {

    private LekarMapper lekarMapper;
    private SestraMapper sestraMapper;
    private SobaMapper sobaMapper;

    public ProceduraMapper(LekarMapper lekarMapper, SestraMapper sestraMapper,
                           SobaMapper sobaMapper) {
        this.lekarMapper = lekarMapper;
        this.sestraMapper = sestraMapper;
        this.sobaMapper = sobaMapper;
    }

    public Procedura toEntity(ProceduraDto proceduraDto) {
        Procedura procedura = new Procedura();
        procedura.setIme(proceduraDto.getIme());
        procedura.setDatum(proceduraDto.getDatum());
        procedura.setCena(proceduraDto.getCena());
        procedura.setLekar(lekarMapper.toEntity(proceduraDto.getLekar()));
        procedura.setSestra(sestraMapper.toEntity(proceduraDto.getSestra()));
        procedura.setSoba(sobaMapper.toEntity(proceduraDto.getSoba()));
        return procedura;

    }

    public ProceduraDto toDto(Procedura save) {
        ProceduraDto proceduraDto = new ProceduraDto();
        proceduraDto.setIme(save.getIme());
        proceduraDto.setDatum(save.getDatum());
        proceduraDto.setCena(save.getCena());
        proceduraDto.setLekar(lekarMapper.toDto(save.getLekar()));
        proceduraDto.setSestra(sestraMapper.toDto(save.getSestra()));
        proceduraDto.setSoba(sobaMapper.toDto(save.getSoba()));
        return proceduraDto;

    }
}