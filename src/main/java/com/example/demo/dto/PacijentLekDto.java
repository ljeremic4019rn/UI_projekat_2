package com.example.demo.dto;

@ApiModel()
public class PacijentLekDto extends AbstractDto<int> {
    private int lekId;
    private int pacijentId;

    public PacijentLekDto() {
    }

    public void setLekId(int lekId) {
        this.lekId = lekId;
    }

    public int getLekId() {
        return this.lekId;
    }

    public void setPacijentId(int pacijentId) {
        this.pacijentId = pacijentId;
    }

    public int getPacijentId() {
        return this.pacijentId;
    }
}