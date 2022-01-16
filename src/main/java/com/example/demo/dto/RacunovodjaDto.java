package com.example.demo.dto;

@ApiModel()
public class RacunovodjaDto extends AbstractDto<int> {
    private int zaposleniId;

    public RacunovodjaDto() {
    }

    public void setZaposleniId(int zaposleniId) {
        this.zaposleniId = zaposleniId;
    }

    public int getZaposleniId() {
        return this.zaposleniId;
    }
}