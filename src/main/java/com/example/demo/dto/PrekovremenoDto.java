package com.example.demo.dto;

import com.example.demo.annotation.CheckDate;

@ApiModel()
public class PrekovremenoDto extends AbstractDto<int> {
    private int prekovremenoId;
    @CheckDate
    private Date datum;
    @Max(Integer.MAX_VALUE)
    private Integer trajanje;
    @Max(Integer.MAX_VALUE)
    private Integer zaposleniId;

    public PrekovremenoDto() {
    }

    public void setPrekovremenoId(int prekovremenoId) {
        this.prekovremenoId = prekovremenoId;
    }

    public int getPrekovremenoId() {
        return this.prekovremenoId;
    }

    public void setDatum(java.sql.Date datum) {
        this.datum = datum;
    }

    public java.sql.Date getDatum() {
        return this.datum;
    }

    public void setTrajanje(Integer trajanje) {
        this.trajanje = trajanje;
    }

    public Integer getTrajanje() {
        return this.trajanje;
    }

    public void setZaposleniId(Integer zaposleniId) {
        this.zaposleniId = zaposleniId;
    }

    public Integer getZaposleniId() {
        return this.zaposleniId;
    }
}