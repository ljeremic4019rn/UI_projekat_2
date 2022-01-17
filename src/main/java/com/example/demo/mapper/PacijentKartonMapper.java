package com.example.demo.mapper;

import com.example.demo.dto.PacijentKartonDto;
import com.example.demo.model.PacijentKarton;
import org.springframework.stereotype.Component;

@Component
public class PacijentKartonMapper {

    private LekarMapper lekarMapper;

    public PacijentKartonMapper(LekarMapper lekarMapper) {
        this.lekarMapper = lekarMapper;
    }

    public PacijentKarton toEntity(PacijentKartonDto pacijentKartonDto) {
        PacijentKarton pacijentKarton = new PacijentKarton();
        pacijentKarton.setIme(pacijentKartonDto.getIme());
        pacijentKarton.setPrezime(pacijentKartonDto.getPrezime());
        pacijentKarton.setJmbg(pacijentKartonDto.getJmbg());
        pacijentKarton.setUlica(pacijentKartonDto.getUlica());
        pacijentKarton.setBroj(pacijentKartonDto.getBroj());
        pacijentKarton.setDrzava(pacijentKartonDto.getDrzava());
        pacijentKarton.setGrad(pacijentKartonDto.getGrad());
        pacijentKarton.setPostanskiBroj(pacijentKartonDto.getPostanskiBroj());
        pacijentKarton.setTelefon(pacijentKartonDto.getTelefon());
        pacijentKarton.setLekarOpsteprakseId(pacijentKartonDto.getPacijentKartonId());
        pacijentKarton.setLekar(lekarMapper.toEntity(pacijentKartonDto.getLekar()));
        return pacijentKarton;

    }

    public PacijentKartonDto toDto(PacijentKarton save) {
        PacijentKartonDto pacijentKartonDto = new PacijentKartonDto();
        pacijentKartonDto.setIme(save.getIme());
        pacijentKartonDto.setPrezime(save.getPrezime());
        pacijentKartonDto.setJmbg(save.getJmbg());
        pacijentKartonDto.setUlica(save.getUlica());
        pacijentKartonDto.setBroj(save.getBroj());
        pacijentKartonDto.setDrzava(save.getDrzava());
        pacijentKartonDto.setGrad(save.getGrad());
        pacijentKartonDto.setPostanskiBroj(save.getPostanskiBroj());
        pacijentKartonDto.setTelefon(save.getTelefon());
        pacijentKartonDto.setLekarOpsteprakseId(save.getPacijentKartonId());
        pacijentKartonDto.setLekar(lekarMapper.toDto(save.getLekar()));
        return pacijentKartonDto;

    }
}