package com.example.demo.dto;

import com.example.demo.annotation.CheckDate;

@ApiModel()
public class CovidListaDto extends AbstractDto<int> {
    private int covidListaId;
    @CheckDate
    private Date datumPrijema;
    @CheckDate
    private Date datumOtpustaja;
    @Max(Integer.MAX_VALUE)
    private Integer pacijentId;

    public CovidListaDto() {
    }

    public void setCovidListaId(int covidListaId) {
        this.covidListaId = covidListaId;
    }

    public int getCovidListaId() {
        return this.covidListaId;
    }

    public void setDatumPrijema(java.sql.Date datumPrijema) {
        this.datumPrijema = datumPrijema;
    }

    public java.sql.Date getDatumPrijema() {
        return this.datumPrijema;
    }

    public void setDatumOtpustaja(java.sql.Date datumOtpustaja) {
        this.datumOtpustaja = datumOtpustaja;
    }

    public java.sql.Date getDatumOtpustaja() {
        return this.datumOtpustaja;
    }

    public void setPacijentId(Integer pacijentId) {
        this.pacijentId = pacijentId;
    }

    public Integer getPacijentId() {
        return this.pacijentId;
    }
}