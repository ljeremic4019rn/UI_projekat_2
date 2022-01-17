package com.example.demo.dto;

import com.example.demo.model.Lek;

public class ReceptDto {
    private Long receptId;
    private Integer doza;
    private Boolean obnavljajuci;
    private Integer datumPrimanja;
    private Integer intervalDani;

    private LekarDto lekar;
    private PacijentKartonDto pacijet;
    private Lek lek;

    public LekarDto getLekar() {
        return lekar;
    }

    public void setLekar(LekarDto lekar) {
        this.lekar = lekar;
    }

    public PacijentKartonDto getPacijet() {
        return pacijet;
    }

    public void setPacijet(PacijentKartonDto pacijet) {
        this.pacijet = pacijet;
    }

    public void setLek(Lek lek) {
        this.lek = lek;
    }



    public ReceptDto() {
    }

    public void setReceptId(Long receptId) {
        this.receptId = receptId;
    }

    public Long getReceptId() {
        return this.receptId;
    }

    public void setDoza(Integer doza) {
        this.doza = doza;
    }

    public Integer getDoza() {
        return this.doza;
    }

    public void setObnavljajuci(Boolean obnavljajuci) {
        this.obnavljajuci = obnavljajuci;
    }

    public Boolean getObnavljajuci() {
        return this.obnavljajuci;
    }

    public void setDatumPrimanja(Integer datumPrimanja) {
        this.datumPrimanja = datumPrimanja;
    }

    public Integer getDatumPrimanja() {
        return this.datumPrimanja;
    }

    public void setIntervalDani(Integer intervalDani) {
        this.intervalDani = intervalDani;
    }

    public Integer getIntervalDani() {
        return this.intervalDani;
    }

}