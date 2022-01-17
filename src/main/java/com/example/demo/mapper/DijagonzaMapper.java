package com.example.demo.mapper;

import com.example.demo.dto.DijagonzaDto;
import com.example.demo.model.Dijagonza;
import org.springframework.stereotype.Component;

@Component
public class  DijagonzaMapper {


    public Dijagonza toEntity(DijagonzaDto dijagonzaDto) {
        Dijagonza dijagonza = new Dijagonza();
        dijagonza.setSifra(dijagonzaDto.getSifra());
        dijagonza.setIme(dijagonzaDto.getIme());
        dijagonza.setDatumPocetka(dijagonzaDto.getDatumPocetka());
        dijagonza.setDatumZavrsetka(dijagonzaDto.getDatumZavrsetka());
        dijagonza.setPacijentId(dijagonzaDto.getPacijentId());

        return dijagonza;
    }

    public DijagonzaDto toDto(Dijagonza save) {
        DijagonzaDto dijagonzaDto = new DijagonzaDto();
        dijagonzaDto.setSifra(save.getSifra());
        dijagonzaDto.setIme(save.getIme());
        dijagonzaDto.setDatumPocetka(save.getDatumPocetka());
        dijagonzaDto.setDatumZavrsetka(save.getDatumZavrsetka());
        dijagonzaDto.setPacijentId(save.getPacijentId());
        return dijagonzaDto;
    }
}