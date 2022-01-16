package com.example.demo.dto;

@ApiModel()
public class OdeljenjeDto extends AbstractDto<int> {
    private int odeljenjeId;
    @Size(max = 255)
    private String ime;
    @Max(Integer.MAX_VALUE)
    private Integer zaposleniId;

    public OdeljenjeDto() {
    }

    public void setOdeljenjeId(int odeljenjeId) {
        this.odeljenjeId = odeljenjeId;
    }

    public int getOdeljenjeId() {
        return this.odeljenjeId;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getIme() {
        return this.ime;
    }

    public void setZaposleniId(Integer zaposleniId) {
        this.zaposleniId = zaposleniId;
    }

    public Integer getZaposleniId() {
        return this.zaposleniId;
    }
}