package com.example.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Recept {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int receptId;
    private Integer doza;
    private Boolean obnavljajuci;
    private Integer datumPrimanja;
    private Integer intervalDani;
    private Integer pacijentId;
    @ManyToOne
    private Lekar lekar;
    @ManyToOne
    private PacijentKarton pacijent;
    @ManyToOne
    private Lek lek;

    public int getReceptId() {
        return receptId;
    }

    public void setReceptId(int receptId) {
        this.receptId = receptId;
    }

    public Integer getDoza() {
        return doza;
    }

    public void setDoza(Integer doza) {
        this.doza = doza;
    }

    public Boolean getObnavljajuci() {
        return obnavljajuci;
    }

    public void setObnavljajuci(Boolean obnavljajuci) {
        this.obnavljajuci = obnavljajuci;
    }

    public Integer getDatumPrimanja() {
        return datumPrimanja;
    }

    public void setDatumPrimanja(Integer datumPrimanja) {
        this.datumPrimanja = datumPrimanja;
    }

    public Integer getIntervalDani() {
        return intervalDani;
    }

    public void setIntervalDani(Integer intervalDani) {
        this.intervalDani = intervalDani;
    }

    public Integer getPacijentId() {
        return pacijentId;
    }

    public void setPacijentId(Integer pacijentId) {
        this.pacijentId = pacijentId;
    }

    public Lekar getLekar() {
        return lekar;
    }

    public void setLekar(Lekar lekar) {
        this.lekar = lekar;
    }

    public PacijentKarton getPacijent() {
        return pacijent;
    }

    public void setPacijent(PacijentKarton pacijent) {
        this.pacijent = pacijent;
    }

    public Lek getLek() {
        return lek;
    }

    public void setLek(Lek lek) {
        this.lek = lek;
    }
}
