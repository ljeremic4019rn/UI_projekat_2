package com.example.demo.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Prekovremeno {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long prekovremenoId;
    private Date datum;
    private Integer trajanje;
    private Integer zaposleniId;

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

    public Integer getZaposleniId() {
        return zaposleniId;
    }

    public void setZaposleniId(Integer zaposleniId) {
        this.zaposleniId = zaposleniId;
    }

}
