package com.example.demo.dto;

import com.example.demo.annotation.CheckDate;

@ApiModel()
public class PrijemnaListaDto extends AbstractDto<int> {
    private int prijemnaListaId;
    @CheckDate
    private Date datumPrijema;
    @CheckDate
    private Date datumOtpustaja;
    @Max(Integer.MAX_VALUE)
    private Integer pacijentId;
    @Max(Integer.MAX_VALUE)
    private Integer sobaId;
    @Max(Integer.MAX_VALUE)
    private Integer zaposleniId;

    public PrijemnaListaDto() {
    }

    public void setPrijemnaListaId(int prijemnaListaId) {
        this.prijemnaListaId = prijemnaListaId;
    }

    public int getPrijemnaListaId() {
        return this.prijemnaListaId;
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

    public void setSobaId(Integer sobaId) {
        this.sobaId = sobaId;
    }

    public Integer getSobaId() {
        return this.sobaId;
    }

    public void setZaposleniId(Integer zaposleniId) {
        this.zaposleniId = zaposleniId;
    }

    public Integer getZaposleniId() {
        return this.zaposleniId;
    }
}