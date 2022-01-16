package com.example.demo.dto;

@ApiModel()
public class ZaposleniDto extends AbstractDto<int> {
    private int zaposleniId;
    @Size(max = 255)
    private String ime;
    @Size(max = 255)
    private String prezime;

    public ZaposleniDto() {
    }

    public void setZaposleniId(int zaposleniId) {
        this.zaposleniId = zaposleniId;
    }

    public int getZaposleniId() {
        return this.zaposleniId;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getIme() {
        return this.ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getPrezime() {
        return this.prezime;
    }
}