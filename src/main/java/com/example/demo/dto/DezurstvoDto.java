package com.example.demo.dto;

import com.example.demo.annotation.CheckDate;

@ApiModel()
public class DezurstvoDto extends AbstractDto<int> {
    private int dezurstvoId;
    @CheckDate
    private Date datumPocetka;
    @CheckDate
    private Date datumKraja;
    @Max(Integer.MAX_VALUE)
    private Integer zaposleniId;

    public DezurstvoDto() {
    }

    public void setDezurstvoId(int dezurstvoId) {
        this.dezurstvoId = dezurstvoId;
    }

    public int getDezurstvoId() {
        return this.dezurstvoId;
    }

    public void setDatumPocetka(java.sql.Date datumPocetka) {
        this.datumPocetka = datumPocetka;
    }

    public java.sql.Date getDatumPocetka() {
        return this.datumPocetka;
    }

    public void setDatumKraja(java.sql.Date datumKraja) {
        this.datumKraja = datumKraja;
    }

    public java.sql.Date getDatumKraja() {
        return this.datumKraja;
    }

    public void setZaposleniId(Integer zaposleniId) {
        this.zaposleniId = zaposleniId;
    }

    public Integer getZaposleniId() {
        return this.zaposleniId;
    }
}