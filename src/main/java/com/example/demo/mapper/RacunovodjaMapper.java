package com.example.demo.mapper;

import com.example.demo.dto.RacunovodjaDto;
import com.example.demo.model.Racunovodja;
import org.springframework.stereotype.Component;

@Component
public class  RacunovodjaMapper  {
    public Racunovodja toEntity(RacunovodjaDto racunovodjaDto) {
        Racunovodja racunovodja = new Racunovodja();
        return racunovodja;

    }

    public RacunovodjaDto toDto(Racunovodja save) {
        RacunovodjaDto racunovodjaDto = new RacunovodjaDto();
        return racunovodjaDto;

    }
}