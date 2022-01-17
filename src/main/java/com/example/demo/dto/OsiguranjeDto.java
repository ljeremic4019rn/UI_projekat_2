package com.example.demo.dto;

import java.util.List;

public class OsiguranjeDto {
    private int osiguranjeId;
    private String ime;
    private String tip;
    private List<PacijentKartonDto> pacijenti;


    public OsiguranjeDto() {
    }

    public List<PacijentKartonDto> getPacijenti() {
        return pacijenti;
    }

    public void setPacijenti(List<PacijentKartonDto> pacijenti) {
        this.pacijenti = pacijenti;
    }

    public void setOsiguranjeId(int osiguranjeId) {
        this.osiguranjeId = osiguranjeId;
    }

    public int getOsiguranjeId() {
        return this.osiguranjeId;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getIme() {
        return this.ime;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getTip() {
        return this.tip;
    }


}