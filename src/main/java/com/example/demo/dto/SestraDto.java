package com.example.demo.dto;

@ApiModel()
public class SestraDto extends AbstractDto<int> {
    private int zaposleniId;
    private Boolean licenca;
    @Size(max = 255)
    private String pozicija;

    public SestraDto() {
    }

    public void setZaposleniId(int zaposleniId) {
        this.zaposleniId = zaposleniId;
    }

    public int getZaposleniId() {
        return this.zaposleniId;
    }

    public void setLicenca(Boolean licenca) {
        this.licenca = licenca;
    }

    public Boolean getLicenca() {
        return this.licenca;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public String getPozicija() {
        return this.pozicija;
    }
}