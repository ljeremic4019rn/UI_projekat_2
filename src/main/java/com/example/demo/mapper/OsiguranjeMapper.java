package com.example.demo.mapper;

import com.example.demo.dto.OsiguranjeDto;
import com.example.demo.model.Osiguranje;
import org.springframework.stereotype.Component;

@Component
public class  OsiguranjeMapper {
    public Osiguranje toEntity(OsiguranjeDto osiguranjeDto) {
        Osiguranje osiguranje = new Osiguranje();
        osiguranje.setIme(osiguranjeDto.getIme());
        osiguranje.setTip(osiguranjeDto.getTip());

        return osiguranje;

    }

    public OsiguranjeDto toDto(Osiguranje save) {
        OsiguranjeDto osiguranjeDto = new OsiguranjeDto();
        osiguranjeDto.setIme(save.getIme());
        osiguranjeDto.setTip(save.getTip());

        return osiguranjeDto;

    }
}