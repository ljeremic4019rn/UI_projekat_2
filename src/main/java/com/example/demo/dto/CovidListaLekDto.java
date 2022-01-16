package com.example.demo.dto;

@ApiModel()
public class CovidListaLekDto extends AbstractDto<int> {
    private int covidId;
    private int lekId;

    public CovidListaLekDto() {
    }

    public void setCovidId(int covidId) {
        this.covidId = covidId;
    }

    public int getCovidId() {
        return this.covidId;
    }

    public void setLekId(int lekId) {
        this.lekId = lekId;
    }

    public int getLekId() {
        return this.lekId;
    }
}