package com.example.demo.dto;

import com.example.demo.annotation.CheckDate;

@ApiModel()
public class ProceduraDto extends AbstractDto<int> {
    private int proceduraId;
    @Size(max = 255)
    private String ime;
    @CheckDate
    private Date datum;
    private Double cena;
    @Max(Integer.MAX_VALUE)
    private Integer pacijentId;
    @Max(Integer.MAX_VALUE)
    private Integer sobaId;

    public ProceduraDto() {
    }

    public void setProceduraId(int proceduraId) {
        this.proceduraId = proceduraId;
    }

    public int getProceduraId() {
        return this.proceduraId;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getIme() {
        return this.ime;
    }

    public void setDatum(java.sql.Date datum) {
        this.datum = datum;
    }

    public java.sql.Date getDatum() {
        return this.datum;
    }

    public void setCena(Double cena) {
        this.cena = cena;
    }

    public Double getCena() {
        return this.cena;
    }

    public void setPacijentId(Integer pacijentId) {
        this.pacijentId = pacijentId;
    }

    public Integer getPacijentId() {
        return this.pacijentId;
    }

    public void setSobaId(Integer sobaId) {
        this.sobaId = sobaId;
    }

    public Integer getSobaId() {
        return this.sobaId;
    }
}