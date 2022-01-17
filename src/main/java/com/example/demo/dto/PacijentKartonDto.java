package com.example.demo.dto;


import com.example.demo.model.PrijemnaLista;

import java.util.List;

public class PacijentKartonDto {
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
    private List<ProceduraDto> prodecure;
    private LekarDto lekar;
    private PrijemnaListaDto prijemnaLista;
    private List<DijagonzaDto> dijagnoze;
    private List<OsiguranjeDto> osugranja;
    private List<CovidListaDto> covidListe;
    private List<ReceptDto> recepti;

    public List<ProceduraDto> getProdecure() {
        return prodecure;
    }

    public void setProdecure(List<ProceduraDto> prodecure) {
        this.prodecure = prodecure;
    }

    public LekarDto getLekar() {
        return lekar;
    }

    public void setLekar(LekarDto lekar) {
        this.lekar = lekar;
    }

    public PrijemnaListaDto getPrijemnaLista() {
        return prijemnaLista;
    }

    public void setPrijemnaLista(PrijemnaListaDto prijemnaLista) {
        this.prijemnaLista = prijemnaLista;
    }

    public List<DijagonzaDto> getDijagnoze() {
        return dijagnoze;
    }

    public void setDijagnoze(List<DijagonzaDto> dijagnoze) {
        this.dijagnoze = dijagnoze;
    }

    public List<OsiguranjeDto> getOsugranja() {
        return osugranja;
    }

    public void setOsugranja(List<OsiguranjeDto> osugranja) {
        this.osugranja = osugranja;
    }

    public List<CovidListaDto> getCovidListe() {
        return covidListe;
    }

    public void setCovidListe(List<CovidListaDto> covidListe) {
        this.covidListe = covidListe;
    }

    public List<ReceptDto> getRecepti() {
        return recepti;
    }

    public void setRecepti(List<ReceptDto> recepti) {
        this.recepti = recepti;
    }

    public PacijentKartonDto() {
    }

    public void setPacijentKartonId(Long pacijentKartonId) {
        this.pacijentKartonId = pacijentKartonId;
    }

    public Long getPacijentKartonId() {
        return this.pacijentKartonId;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getIme() {
        return this.ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getPrezime() {
        return this.prezime;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public String getJmbg() {
        return this.jmbg;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getUlica() {
        return this.ulica;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    public String getBroj() {
        return this.broj;
    }

    public void setDrzava(String drzava) {
        this.drzava = drzava;
    }

    public String getDrzava() {
        return this.drzava;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }

    public String getGrad() {
        return this.grad;
    }

    public void setPostanskiBroj(String postanskiBroj) {
        this.postanskiBroj = postanskiBroj;
    }

    public String getPostanskiBroj() {
        return this.postanskiBroj;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getTelefon() {
        return this.telefon;
    }

    public void setLekarOpsteprakseId(Long lekarOpsteprakseId) {
        this.lekarOpsteprakseId = lekarOpsteprakseId;
    }

    public Long getLekarOpsteprakseId() {
        return this.lekarOpsteprakseId;
    }
}