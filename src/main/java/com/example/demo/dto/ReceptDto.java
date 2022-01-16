package com.example.demo.dto;

@ApiModel()
public class ReceptDto extends AbstractDto<int> {
    private int receptId;
    @Max(Integer.MAX_VALUE)
    private Integer doza;
    private Boolean obnavljajuci;
    @Max(Integer.MAX_VALUE)
    private Integer datumPrimanja;
    @Max(Integer.MAX_VALUE)
    private Integer intervalDani;
    @Max(Integer.MAX_VALUE)
    private Integer pacijentId;

    public ReceptDto() {
    }

    public void setReceptId(int receptId) {
        this.receptId = receptId;
    }

    public int getReceptId() {
        return this.receptId;
    }

    public void setDoza(Integer doza) {
        this.doza = doza;
    }

    public Integer getDoza() {
        return this.doza;
    }

    public void setObnavljajuci(Boolean obnavljajuci) {
        this.obnavljajuci = obnavljajuci;
    }

    public Boolean getObnavljajuci() {
        return this.obnavljajuci;
    }

    public void setDatumPrimanja(Integer datumPrimanja) {
        this.datumPrimanja = datumPrimanja;
    }

    public Integer getDatumPrimanja() {
        return this.datumPrimanja;
    }

    public void setIntervalDani(Integer intervalDani) {
        this.intervalDani = intervalDani;
    }

    public Integer getIntervalDani() {
        return this.intervalDani;
    }

    public void setPacijentId(Integer pacijentId) {
        this.pacijentId = pacijentId;
    }

    public Integer getPacijentId() {
        return this.pacijentId;
    }
}