package com.example.demo.dto;

public class OsiguranjeDto {
    private int osiguranjeId;
    private String ime;
    private String tip;


    public OsiguranjeDto() {
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