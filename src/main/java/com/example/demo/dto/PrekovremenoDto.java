package com.example.demo.dto;


import java.sql.Date;

public class PrekovremenoDto {
    private int prekovremenoId;
    private Date datum;
    private Integer trajanje;
    private Long zaposleniId;

    public PrekovremenoDto() {
    }

    public void setPrekovremenoId(int prekovremenoId) {
        this.prekovremenoId = prekovremenoId;
    }

    public int getPrekovremenoId() {
        return this.prekovremenoId;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public Date getDatum() {
        return this.datum;
    }

    public void setTrajanje(Integer trajanje) {
        this.trajanje = trajanje;
    }

    public Integer getTrajanje() {
        return this.trajanje;
    }

    public void setZaposleniId(Long zaposleniId) {
        this.zaposleniId = zaposleniId;
    }

    public Long getZaposleniId() {
        return this.zaposleniId;
    }
}