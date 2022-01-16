package com.example.demo.dto;

@ApiModel()
public class OdeljenjeLekarDezurstvoDto extends AbstractDto<int> {
    private int odeljenjeOdeljenjeId;
    private int lekarZaposleniId;

    public OdeljenjeLekarDezurstvoDto() {
    }

    public void setOdeljenjeOdeljenjeId(int odeljenjeOdeljenjeId) {
        this.odeljenjeOdeljenjeId = odeljenjeOdeljenjeId;
    }

    public int getOdeljenjeOdeljenjeId() {
        return this.odeljenjeOdeljenjeId;
    }

    public void setLekarZaposleniId(int lekarZaposleniId) {
        this.lekarZaposleniId = lekarZaposleniId;
    }

    public int getLekarZaposleniId() {
        return this.lekarZaposleniId;
    }
}