package com.example.demo.mapper;

import com.example.demo.dto.BolnicaZaposleniDto;
import com.example.demo.model.BolnicaZaposleni;
import org.springframework.stereotype.Component;

@Component
public class BolnicaZaposleniMapper {
    public BolnicaZaposleni toEntity(BolnicaZaposleniDto bolnicaZaposleniDto) {
        BolnicaZaposleni bolnicaZaposleni = new BolnicaZaposleni();
        bolnicaZaposleni.setIme(bolnicaZaposleniDto.getIme());
        bolnicaZaposleni.setPrezime(bolnicaZaposleni.getPrezime());

        return bolnicaZaposleni;

    }

    public BolnicaZaposleniDto toDto(BolnicaZaposleni save) {
        BolnicaZaposleniDto bolnicaZaposleniDto = new BolnicaZaposleniDto();

        bolnicaZaposleniDto.setIme(save.getIme());
        bolnicaZaposleniDto.setPrezime(save.getPrezime());

        return bolnicaZaposleniDto;

    }
}