package com.example.demo.dto;

import com.example.demo.annotation.CheckDate;

@ApiModel()
public class DijagonzaDto extends AbstractDto<int> {
    private int dijagnozaId;
    @Size(max = 255)
    private String sifra;
    @Size(max = 255)
    private String ime;
    @CheckDate
    private Date datumPocetka;
    @CheckDate
    private Date datumZavrsetka;
    @Max(Integer.MAX_VALUE)
    private Integer pacijentId;

    public DijagonzaDto() {
    }

    public void setDijagnozaId(int dijagnozaId) {
        this.dijagnozaId = dijagnozaId;
    }

    public int getDijagnozaId() {
        return this.dijagnozaId;
    }

    public void setSifra(String sifra) {
        this.sifra = sifra;
    }

    public String getSifra() {
        return this.sifra;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getIme() {
        return this.ime;
    }

    public void setDatumPocetka(java.sql.Date datumPocetka) {
        this.datumPocetka = datumPocetka;
    }

    public java.sql.Date getDatumPocetka() {
        return this.datumPocetka;
    }

    public void setDatumZavrsetka(java.sql.Date datumZavrsetka) {
        this.datumZavrsetka = datumZavrsetka;
    }

    public java.sql.Date getDatumZavrsetka() {
        return this.datumZavrsetka;
    }

    public void setPacijentId(Integer pacijentId) {
        this.pacijentId = pacijentId;
    }

    public Integer getPacijentId() {
        return this.pacijentId;
    }
}