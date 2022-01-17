package com.example.demo.mapper;

import com.example.demo.dto.LekDto;
import com.example.demo.model.Lek;
import org.springframework.stereotype.Component;

@Component
public class  LekMapper {
    public Lek toEntity(LekDto lekDto) {
        Lek lek = new Lek();
        lek.setGrupa(lekDto.getGrupa());
        lek.setNaziv(lekDto.getNaziv());
        lek.setSastav(lekDto.getSastav());
        lek.setTip(lekDto.getTip());
        lek.setDatumIsteka(lekDto.getDatumIsteka());
        lek.setDatumProizvodnje(lekDto.getDatumProizvodnje());

        return lek;

    }

    public LekDto toDto(Lek save) {
        LekDto lekDto = new LekDto();
        lekDto.setGrupa(save.getGrupa());
        lekDto.setNaziv(save.getNaziv());
        lekDto.setSastav(save.getSastav());
        lekDto.setTip(save.getTip());
        lekDto.setDatumIsteka(save.getDatumIsteka());
        lekDto.setDatumProizvodnje(save.getDatumProizvodnje());
        return lekDto;

    }
}