package com.example.demo.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
public class Procedura {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int proceduraId;
    private String ime;
    private Date datum;
    private Double cena;
    @ManyToOne
    private Lekar lekar;
    @ManyToOne
    private Sestra sestra;
    @ManyToOne
    private Soba soba;
    @ManyToOne
    private PacijentKarton pacijent;
    @OneToMany
    private List<Recept> recept;

    public int getProceduraId() {
        return proceduraId;
    }

    public void setProceduraId(int proceduraId) {
        this.proceduraId = proceduraId;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public Double getCena() {
        return cena;
    }

    public void setCena(Double cena) {
        this.cena = cena;
    }


    public Lekar getLekar() {
        return lekar;
    }

    public void setLekar(Lekar lekar) {
        this.lekar = lekar;
    }

    public Sestra getSestra() {
        return sestra;
    }

    public void setSestra(Sestra sestra) {
        this.sestra = sestra;
    }

    public Soba getSoba() {
        return soba;
    }

    public void setSoba(Soba soba) {
        this.soba = soba;
    }

    public PacijentKarton getPacijent() {
        return pacijent;
    }

    public void setPacijent(PacijentKarton pacijent) {
        this.pacijent = pacijent;
    }

    public List<Recept> getRecept() {
        return recept;
    }

    public void setRecept(List<Recept> recept) {
        this.recept = recept;
    }


}
