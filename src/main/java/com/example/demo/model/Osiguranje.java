package com.example.demo.model;

import javax.persistence.*;

@Entity
public class Osiguranje {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long osiguranjeId;
    private String ime;
    private String tip;
    private Integer pacijentId;

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

    public Integer getPacijentId() {
        return pacijentId;
    }

    public void setPacijentId(Integer pacijentId) {
        this.pacijentId = pacijentId;
    }


}
