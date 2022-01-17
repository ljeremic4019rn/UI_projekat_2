package com.example.demo.mapper;

import com.example.demo.dto.ReceptDto;
import com.example.demo.model.PacijentKarton;
import com.example.demo.model.Recept;
import org.springframework.stereotype.Component;

@Component
public class ReceptMapper  {

    private LekarMapper lekarMapper;
    private PacijentKartonMapper pacijentKartonMapper;
    private LekMapper lekMapper;

    public ReceptMapper(LekarMapper lekarMapper, PacijentKartonMapper pacijentKartonMapper, LekMapper lekMapper) {
        this.lekarMapper = lekarMapper;
        this.pacijentKartonMapper = pacijentKartonMapper;
        this.lekMapper = lekMapper;
    }

    public Recept toEntity(ReceptDto receptDto) {
        Recept recept = new Recept();
        recept.setDoza(receptDto.getDoza());
        recept.setObnavljajuci(receptDto.getObnavljajuci());
        recept.setDatumPrimanja(receptDto.getDatumPrimanja());
        recept.setIntervalDani(receptDto.getIntervalDani());
        return recept;

    }

    public ReceptDto toDto(Recept save) {
        ReceptDto receptDto = new ReceptDto();
        receptDto.setDoza(save.getDoza());
        receptDto.setObnavljajuci(save.getObnavljajuci());
        receptDto.setDatumPrimanja(save.getDatumPrimanja());
        receptDto.setIntervalDani(save.getIntervalDani());
        return receptDto;

    }
}