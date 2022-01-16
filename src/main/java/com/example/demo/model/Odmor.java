package com.example.demo.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Odmor {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long odmorId;
    private Date kraj;
    private Date pocetak;
    private Integer zaposleniId;

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

    public Integer getZaposleniId() {
        return zaposleniId;
    }

    public void setZaposleniId(Integer zaposleniId) {
        this.zaposleniId = zaposleniId;
    }

}
