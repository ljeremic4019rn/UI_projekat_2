package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Osiguranje {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long osiguranjeId;
    private String ime;
    private String tip;

    public Long getOsiguranjeId() {
        return osiguranjeId;
    }

    public void setOsiguranjeId(Long osiguranjeId) {
        this.osiguranjeId = osiguranjeId;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }


}
