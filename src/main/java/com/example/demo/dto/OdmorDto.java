package com.example.demo.dto;

import com.example.demo.annotation.CheckDate;

@ApiModel()
public class OdmorDto extends AbstractDto<int> {
    private int odmorId;
    @CheckDate
    private Date kraj;
    @CheckDate
    private Date pocetak;
    @Max(Integer.MAX_VALUE)
    private Integer zaposleniId;

    public OdmorDto() {
    }

    public void setOdmorId(int odmorId) {
        this.odmorId = odmorId;
    }

    public int getOdmorId() {
        return this.odmorId;
    }

    public void setKraj(java.sql.Date kraj) {
        this.kraj = kraj;
    }

    public java.sql.Date getKraj() {
        return this.kraj;
    }

    public void setPocetak(java.sql.Date pocetak) {
        this.pocetak = pocetak;
    }

    public java.sql.Date getPocetak() {
        return this.pocetak;
    }

    public void setZaposleniId(Integer zaposleniId) {
        this.zaposleniId = zaposleniId;
    }

    public Integer getZaposleniId() {
        return this.zaposleniId;
    }
}