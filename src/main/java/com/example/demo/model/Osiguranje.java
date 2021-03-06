package com.example.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Osiguranje {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long osiguranjeId;
    private String ime;
    private String tip;
    @ManyToMany
    private List<PacijentKarton> pacijenti;

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

    public List<PacijentKarton> getPacijenti() {
        return pacijenti;
    }

    public void setPacijenti(List<PacijentKarton> pacijenti) {
        this.pacijenti = pacijenti;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }


}
