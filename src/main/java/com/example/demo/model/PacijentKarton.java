package com.example.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table()
public class PacijentKarton {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long pacijentKartonId;
    private String ime;
    private String prezime;
    private String jmbg;
    private String ulica;
    private String broj;
    private String drzava;
    private String grad;
    private String postanskiBroj;
    private String telefon;
    private Long lekarOpsteprakseId;
    @OneToMany
    private List<Procedura> procedure;
    @ManyToOne
    private Lekar lekar;
    @ManyToOne
    private PrijemnaLista prijemnaLista;
    @OneToMany
    private List<Dijagonza> dijaknoze;
    @ManyToMany
    private List<Osiguranje> osiguranja;
    @OneToMany
    private List<CovidLista> covidListe;
    @OneToMany
    private List<Recept> recepti;

    public Long getPacijentKartonId() {
        return pacijentKartonId;
    }

    public void setPacijentKartonId(Long pacijentKartonId) {
        this.pacijentKartonId = pacijentKartonId;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    public String getDrzava() {
        return drzava;
    }

    public void setDrzava(String drzava) {
        this.drzava = drzava;
    }

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }

    public String getPostanskiBroj() {
        return postanskiBroj;
    }

    public void setPostanskiBroj(String postanskiBroj) {
        this.postanskiBroj = postanskiBroj;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public Long getLekarOpsteprakseId() {
        return lekarOpsteprakseId;
    }

    public void setLekarOpsteprakseId(Long lekarOpsteprakseId) {
        this.lekarOpsteprakseId = lekarOpsteprakseId;
    }

    public List<Procedura> getProcedure() {
        return procedure;
    }

    public void setProcedure(List<Procedura> procedure) {
        this.procedure = procedure;
    }

    public Lekar getLekar() {
        return lekar;
    }

    public void setLekar(Lekar lekar) {
        this.lekar = lekar;
    }

    public PrijemnaLista getPrijemnaLista() {
        return prijemnaLista;
    }

    public void setPrijemnaLista(PrijemnaLista prijemnaLista) {
        this.prijemnaLista = prijemnaLista;
    }

    public List<Dijagonza> getDijaknoze() {
        return dijaknoze;
    }

    public void setDijaknoze(List<Dijagonza> dijaknoze) {
        this.dijaknoze = dijaknoze;
    }

    public List<Osiguranje> getOsiguranja() {
        return osiguranja;
    }

    public void setOsiguranja(List<Osiguranje> osiguranja) {
        this.osiguranja = osiguranja;
    }

    public List<CovidLista> getCovidListe() {
        return covidListe;
    }

    public void setCovidListe(List<CovidLista> covidListe) {
        this.covidListe = covidListe;
    }

    public List<Recept> getRecepti() {
        return recepti;
    }

    public void setRecepti(List<Recept> recepti) {
        this.recepti = recepti;
    }
}
