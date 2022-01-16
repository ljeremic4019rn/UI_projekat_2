package com.example.demo.dto;

import com.example.demo.annotation.CheckDate;

@ApiModel()
public class LekDto extends AbstractDto<int> {
    private int lekId;
    @Size(max = 255)
    private String grupa;
    @Size(max = 255)
    private String naziv;
    @Size(max = 255)
    private String sastav;
    @Size(max = 255)
    private String tip;
    @CheckDate
    private Date datumIsteka;
    @CheckDate
    private Date datumProizvodnje;

    public LekDto() {
    }

    public void setLekId(int lekId) {
        this.lekId = lekId;
    }

    public int getLekId() {
        return this.lekId;
    }

    public void setGrupa(String grupa) {
        this.grupa = grupa;
    }

    public String getGrupa() {
        return this.grupa;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getNaziv() {
        return this.naziv;
    }

    public void setSastav(String sastav) {
        this.sastav = sastav;
    }

    public String getSastav() {
        return this.sastav;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getTip() {
        return this.tip;
    }

    public void setDatumIsteka(java.sql.Date datumIsteka) {
        this.datumIsteka = datumIsteka;
    }

    public java.sql.Date getDatumIsteka() {
        return this.datumIsteka;
    }

    public void setDatumProizvodnje(java.sql.Date datumProizvodnje) {
        this.datumProizvodnje = datumProizvodnje;
    }

    public java.sql.Date getDatumProizvodnje() {
        return this.datumProizvodnje;
    }
}