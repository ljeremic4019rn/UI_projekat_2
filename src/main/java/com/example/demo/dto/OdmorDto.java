package com.example.demo.dto;


import java.sql.Date;

public class OdmorDto  {
    private int odmorId;
    private Date kraj;
    private Date pocetak;
    private Long bolnicaZaposleniId;

    public OdmorDto() {
    }

    public void setOdmorId(int odmorId) {
        this.odmorId = odmorId;
    }

    public int getOdmorId() {
        return this.odmorId;
    }

    public void setKraj(Date kraj) {
        this.kraj = kraj;
    }

    public Date getKraj() {
        return this.kraj;
    }

    public void setPocetak(Date pocetak) {
        this.pocetak = pocetak;
    }

    public Date getPocetak() {
        return this.pocetak;
    }

    public void setBolnicaZaposleniId(Long bolnicaZaposleniId) {
        this.bolnicaZaposleniId = bolnicaZaposleniId;
    }

    public Long getBolnicaZaposleniId() {
        return this.bolnicaZaposleniId;
    }
}