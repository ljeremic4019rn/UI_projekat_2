package com.example.demo.mapper;

import com.example.demo.dto.CovidListaDto;
import com.example.demo.model.CovidLista;
import org.springframework.stereotype.Component;

@Component
public class CovidListaMapper {


    public CovidLista toEntity(CovidListaDto covidListaDto) {
        CovidLista covidLista = new CovidLista();
        covidLista.setDatumPrijema(covidListaDto.getDatumPrijema());
        covidLista.setDatumOtpustaja(covidListaDto.getDatumOtpustaja());
        covidLista.setPacijentId(covidListaDto.getPacijentId());
        return covidLista;

    }

    public CovidListaDto toDto(CovidLista save) {
        CovidListaDto covidListaDto = new CovidListaDto();
        covidListaDto.setDatumPrijema(save.getDatumPrijema());
        covidListaDto.setDatumOtpustaja(save.getDatumOtpustaja());
        covidListaDto.setPacijentId(save.getPacijentId());
        return covidListaDto;

    }
}