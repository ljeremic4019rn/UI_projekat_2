package com.example.demo.mapper;

import com.example.demo.dto.SestraDto;
import com.example.demo.model.Sestra;
import org.springframework.stereotype.Component;

@Component
public class SestraMapper {


    public Sestra toEntity(SestraDto sestraDto) {
        Sestra sestra = new Sestra();
        sestra.setLicenca(sestra.getLicenca());
        sestra.setPozicija(sestra.getPozicija());
        return sestra;

    }

    public SestraDto toDto(Sestra save) {
        SestraDto sestraDto = new SestraDto();
        sestraDto.setLicenca(save.getLicenca());
        sestraDto.setPozicija(save.getPozicija());
        return sestraDto;

    }
}