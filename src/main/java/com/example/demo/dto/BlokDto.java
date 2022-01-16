package com.example.demo.dto;

public class BlokDto {
    private int blokId;
    private String ime;
    private String kod;
    private Integer sprat;
    private Integer odeljenjeId;

    public BlokDto() {
    }

    public void setBlokId(int blokId) {
        this.blokId = blokId;
    }

    public int getBlokId() {
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

    public void setOdeljenjeId(Integer odeljenjeId) {
        this.odeljenjeId = odeljenjeId;
    }

    public Integer getOdeljenjeId() {
        return this.odeljenjeId;
    }
}