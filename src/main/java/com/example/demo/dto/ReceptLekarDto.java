package com.example.demo.dto;

@ApiModel()
public class ReceptLekarDto extends AbstractDto<int> {
    private int receptId;
    private int zaposleniId;

    public ReceptLekarDto() {
    }

    public void setReceptId(int receptId) {
        this.receptId = receptId;
    }

    public int getReceptId() {
        return this.receptId;
    }

    public void setZaposleniId(int zaposleniId) {
        this.zaposleniId = zaposleniId;
    }

    public int getZaposleniId() {
        return this.zaposleniId;
    }
}