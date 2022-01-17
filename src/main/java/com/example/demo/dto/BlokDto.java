package com.example.demo.dto;

import java.util.List;

public class BlokDto {
    private Long blokId;
    private String ime;
    private String kod;
    private Integer sprat;
    private Long odeljenjeId;

    private List<SobaDto> sobe;
    private SestraDto sestra;

    public List<SobaDto> getSobe() {
        return sobe;
    }

    public void setSobe(List<SobaDto> sobe) {
        this.sobe = sobe;
    }

    public SestraDto getSestra() {
        return sestra;
    }

    public void setSestra(SestraDto sestra) {
        this.sestra = sestra;
    }

    public BlokDto() {
    }

    public void setBlokId(Long blokId) {
        this.blokId = blokId;
    }

    public Long getBlokId() {
        return this.blokId;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getIme() {
        return this.ime;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public String getKod() {
        return this.kod;
    }

    public void setSprat(Integer sprat) {
        this.sprat = sprat;
    }

    public Integer getSprat() {
        return this.sprat;
    }

    public void setOdeljenjeId(Long odeljenjeId) {
        this.odeljenjeId = odeljenjeId;
    }

    public Long getOdeljenjeId() {
        return this.odeljenjeId;
    }
}