package com.example.demo.model;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table()
public class Blok {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long blokId;
    private String ime;
    private String kod;
    private Integer sprat;
    private Long odeljenjeId;

    @OneToMany
    private List<Soba> sobe;
    @OneToOne
    private Sestra sestraDezurna;

    public Long getBlokId() {
        return blokId;
    }

    public void setBlokId(Long blokId) {
        this.blokId = blokId;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public Integer getSprat() {
        return sprat;
    }

    public void setSprat(Integer sprat) {
        this.sprat = sprat;
    }

    public Long getOdeljenjeId() {
        return odeljenjeId;
    }

    public void setOdeljenjeId(Long odeljenjeId) {
        this.odeljenjeId = odeljenjeId;
    }

    public List<Soba> getSobe() {
        return sobe;
    }

    public void setSobe(List<Soba> sobe) {
        this.sobe = sobe;
    }

    public Sestra getSestraDezurna() {
        return sestraDezurna;
    }

    public void setSestraDezurna(Sestra sestraDezurna) {
        this.sestraDezurna = sestraDezurna;
    }

}
