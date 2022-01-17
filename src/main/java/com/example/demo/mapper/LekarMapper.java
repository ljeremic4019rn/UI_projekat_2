package com.example.demo.mapper;

import com.example.demo.dto.LekDto;
import com.example.demo.dto.LekarDto;
import com.example.demo.model.Lekar;
import org.springframework.stereotype.Component;

@Component
public class  LekarMapper  {



    public LekarDto toDto(Lekar save) {
        LekarDto lekarDto = new LekarDto();
        lekarDto.setSpecijalizacija(save.getSpecijalizacija());

        return lekarDto;

    }

    public Lekar toEntity(LekarDto lekarDto) {
        Lekar lekar = new Lekar();
        lekar.setSpecijalizacija(lekarDto.getSpecijalizacija());

        return lekar;

    }
}