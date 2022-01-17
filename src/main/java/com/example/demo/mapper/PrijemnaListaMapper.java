package com.example.demo.mapper;

import com.example.demo.dto.PrijemnaListaDto;
import com.example.demo.model.PrijemnaLista;
import org.springframework.stereotype.Component;

@Component
public class  PrijemnaListaMapper {

    private SobaMapper sobaMapper;

    public PrijemnaListaMapper(SobaMapper sobaMapper) {
        this.sobaMapper = sobaMapper;
    }

    public PrijemnaLista toEntity(PrijemnaListaDto prijemnaListaDto) {
        PrijemnaLista prijemnaLista = new PrijemnaLista();
        prijemnaLista.setDatumPrijema(prijemnaListaDto.getDatumPrijema());
        prijemnaLista.setDatumOtpustaja(prijemnaListaDto.getDatumOtpustaja());
        prijemnaLista.setPacijentId(prijemnaListaDto.getPacijentId());
        prijemnaLista.setBolnicaZaposleniId(prijemnaListaDto.getZaposleniId());
        prijemnaLista.setSoba(sobaMapper.toEntity(prijemnaListaDto.getSoba()));
        return prijemnaLista;

    }

    public PrijemnaListaDto toDto(PrijemnaLista save) {
        PrijemnaListaDto prijemnaListaDto = new PrijemnaListaDto();
        prijemnaListaDto.setDatumPrijema(save.getDatumPrijema());
        prijemnaListaDto.setDatumOtpustaja(save.getDatumOtpustaja());
        prijemnaListaDto.setPacijentId(save.getPacijentId());
        prijemnaListaDto.setZaposleniId(save.getBolnicaZaposleniId());
        prijemnaListaDto.setSoba(sobaMapper.toDto(save.getSoba()));
        return prijemnaListaDto;

    }
}