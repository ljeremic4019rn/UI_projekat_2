package com.example.demo.dto;

@ApiModel()
public class LekarDto extends AbstractDto<int> {
    private int zaposleniId;
    @Size(max = 255)
    private String specijalizacija;

    public LekarDto() {
    }

    public void setZaposleniId(int zaposleniId) {
        this.zaposleniId = zaposleniId;
    }

    public int getZaposleniId() {
        return this.zaposleniId;
    }

    public void setSpecijalizacija(String specijalizacija) {
        this.specijalizacija = specijalizacija;
    }

    public String getSpecijalizacija() {
        return this.specijalizacija;
    }
}