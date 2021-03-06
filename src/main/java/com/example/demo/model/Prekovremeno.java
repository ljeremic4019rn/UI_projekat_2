package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Prekovremeno {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long prekovremenoId;
    private Date datum;
    private Integer trajanje;
    private Long bolnicaZaposleniId;

    public Long getPrekovremenoId() {
        return prekovremenoId;
    }

    public void setPrekovremenoId(Long prekovremenoId) {
        this.prekovremenoId = prekovremenoId;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public Integer getTrajanje() {
        return trajanje;
    }

    public void setTrajanje(Integer trajanje) {
        this.trajanje = trajanje;
    }

    public Long getBolnicaZaposleniId() {
        return bolnicaZaposleniId;
    }

    public void setBolnicaZaposleniId(Long zaposleniId) {
        this.bolnicaZaposleniId = zaposleniId;
    }

}
