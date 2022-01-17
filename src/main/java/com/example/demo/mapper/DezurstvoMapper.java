package com.example.demo.mapper;

import com.example.demo.dto.DezurstvoDto;
import com.example.demo.model.Dezurstvo;
import org.springframework.stereotype.Component;

@Component
public class  DezurstvoMapper  {
    private BolnicaZaposleniMapper bolnicaZaposleniMapper;

    public DezurstvoMapper(BolnicaZaposleniMapper bolnicaZaposleniMapper) {
        this.bolnicaZaposleniMapper = bolnicaZaposleniMapper;
    }

    public Dezurstvo toEntity(DezurstvoDto dezurstvoDto) {
        Dezurstvo dezurstvo = new Dezurstvo();
        dezurstvo.setDatumPocetka(dezurstvoDto.getDatumPocetka());
        dezurstvo.setDatumKraja(dezurstvoDto.getDatumKraja());
        dezurstvo.setBolnica(bolnicaZaposleniMapper.toEntity(dezurstvoDto.getBolnicaDto()));
        return dezurstvo;

    }

    public DezurstvoDto toDto(Dezurstvo save) {
        DezurstvoDto dezurstvoDto = new DezurstvoDto();
        dezurstvoDto.setDatumPocetka(save.getDatumPocetka());
        dezurstvoDto.setDatumKraja(save.getDatumKraja());
        dezurstvoDto.setBolnicaDto(bolnicaZaposleniMapper.toDto(save.getBolnica()));
        return dezurstvoDto;

    }
}