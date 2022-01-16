package com.example.demo.dto;

@ApiModel()
public class OsiguranjeDto extends AbstractDto<int> {
    private int osiguranjeId;
    @Size(max = 255)
    private String ime;
    @Size(max = 255)
    private String tip;
    @Max(Integer.MAX_VALUE)
    private Integer pacijentId;

    public OsiguranjeDto() {
    }

    public void setOsiguranjeId(int osiguranjeId) {
        this.osiguranjeId = osiguranjeId;
    }

    public int getOsiguranjeId() {
        return this.osiguranjeId;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getIme() {
        return this.ime;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getTip() {
        return this.tip;
    }

    public void setPacijentId(Integer pacijentId) {
        this.pacijentId = pacijentId;
    }

    public Integer getPacijentId() {
        return this.pacijentId;
    }
}