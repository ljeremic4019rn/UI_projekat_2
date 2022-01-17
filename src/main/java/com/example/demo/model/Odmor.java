package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Odmor {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long odmorId;
    private Date kraj;
    private Date pocetak;
    private Long zaposleniId;

    public Long getOdmorId() {
        return odmorId;
    }

    public void setOdmorId(Long odmorId) {
        this.odmorId = odmorId;
    }

    public Date getKraj() {
        return kraj;
    }

    public void setKraj(Date kraj) {
        this.kraj = kraj;
    }

    public Date getPocetak() {
        return pocetak;
    }

    public void setPocetak(Date pocetak) {
        this.pocetak = pocetak;
    }

    public Long getZaposleniId() {
        return zaposleniId;
    }

    public void setZaposleniId(Long zaposleniId) {
        this.zaposleniId = zaposleniId;
    }

}
