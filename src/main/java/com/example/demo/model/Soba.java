package com.example.demo.model;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Soba {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long sobaId;
    private String broj;
    private Boolean intenzivnaNega;
    private Long blokId;
    @OneToMany
    private List<Procedura> procedure;
    @OneToMany
    private List<PrijemnaLista> prijeneListe;

    public Long getSobaId() {
        return sobaId;
    }

    public void setSobaId(Long sobaId) {
        this.sobaId = sobaId;
    }

    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    public Boolean getIntenzivnaNega() {
        return intenzivnaNega;
    }

    public void setIntenzivnaNega(Boolean intenzivnaNega) {
        this.intenzivnaNega = intenzivnaNega;
    }

    public Long getBlokId() {
        return blokId;
    }

    public void setBlokId(Long blokId) {
        this.blokId = blokId;
    }

    public List<Procedura> getProcedure() {
        return procedure;
    }

    public void setProcedure(List<Procedura> procedure) {
        this.procedure = procedure;
    }

    public List<PrijemnaLista> getPrijeneListe() {
        return prijeneListe;
    }

    public void setPrijeneListe(List<PrijemnaLista> prijeneListe) {
        this.prijeneListe = prijeneListe;
    }
}
