package com.example.demo.mapper;

import com.example.demo.dto.ObukaProcedureDto;
import com.example.demo.model.ObukaProcedure;
import org.springframework.stereotype.Component;

@Component
public class  ObukaProcedureMapper{
    public ObukaProcedure toEntity(ObukaProcedureDto obukaProcedureDto) {
        ObukaProcedure obukaProcedure = new ObukaProcedure();
        obukaProcedure.setKod(obukaProcedureDto.getKod());
        obukaProcedure.setProcedura(obukaProcedureDto.getProcedura());
        obukaProcedureDto.setDatumIsteka(obukaProcedureDto.getDatumIsteka());
        obukaProcedure.setSertifikat(obukaProcedureDto.getSertifikat());
        obukaProcedure.setBolnicaZaposleniId(obukaProcedureDto.getBolnicaZaposleniId());

        return obukaProcedure;

    }

    public ObukaProcedureDto toDto(ObukaProcedure save) {
        ObukaProcedureDto obukaProcedureDto = new ObukaProcedureDto();
        obukaProcedureDto.setKod(save.getKod());
        obukaProcedureDto.setProcedura(save.getProcedura());
        obukaProcedureDto.setDatumIsteka(save.getDatumIsteka());
        obukaProcedureDto.setSertifikat(save.getSertifikat());
        obukaProcedureDto.setBolnicaZaposleniId(save.getBolnicaZaposleniId());

        return obukaProcedureDto;

    }
}