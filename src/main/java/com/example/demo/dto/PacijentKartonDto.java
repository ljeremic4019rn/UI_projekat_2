package com.example.demo.dto;

@ApiModel()
public class PacijentKartonDto extends AbstractDto<int> {
    private int pacijentKartonId;
    @Size(max = 255)
    private String ime;
    @Size(max = 255)
    private String prezime;
    @Size(max = 255)
    private String jmbg;
    @Size(max = 255)
    private String ulica;
    @Size(max = 255)
    private String broj;
    @Size(max = 255)
    private String drzava;
    @Size(max = 255)
    private String grad;
    @Size(max = 255)
    private String postanskiBroj;
    @Size(max = 255)
    private String telefon;
    @Max(Integer.MAX_VALUE)
    private Integer lekarOpsteprakseId;

    public PacijentKartonDto() {
    }

    public void setPacijentKartonId(int pacijentKartonId) {
        this.pacijentKartonId = pacijentKartonId;
    }

    public int getPacijentKartonId() {
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

    public void setLekarOpsteprakseId(Integer lekarOpsteprakseId) {
        this.lekarOpsteprakseId = lekarOpsteprakseId;
    }

    public Integer getLekarOpsteprakseId() {
        return this.lekarOpsteprakseId;
    }
}