package com.example.demo.dto;


import java.sql.Date;
import java.util.List;

public class ProceduraDto {
    private int proceduraId;
    private String ime;
    private Date datum;
    private Double cena;

    private LekarDto lekar;
    private SestraDto sestra;
    private SobaDto soba;
    private PacijentKartonDto pacijent;
    private List<ReceptDto> recepti;

    public LekarDto getLekar() {
        return lekar;
    }

    public void setLekar(LekarDto lekar) {
        this.lekar = lekar;
    }

    public SestraDto getSestra() {
        return sestra;
    }

    public void setSestra(SestraDto sestra) {
        this.sestra = sestra;
    }

    public SobaDto getSoba() {
        return soba;
    }

    public void setSoba(SobaDto soba) {
        this.soba = soba;
    }

    public PacijentKartonDto getPacijent() {
        return pacijent;
    }

    public void setPacijent(PacijentKartonDto pacijent) {
        this.pacijent = pacijent;
    }

    public List<ReceptDto> getRecepti() {
        return recepti;
    }

    public void setRecepti(List<ReceptDto> recepti) {
        this.recepti = recepti;
    }

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

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public Date getDatum() {
        return this.datum;
    }

    public void setCena(Double cena) {
        this.cena = cena;
    }

    public Double getCena() {
        return this.cena;
    }

}