package com.example.demo.dto;

@ApiModel()
public class SobaDto extends AbstractDto<int> {
    private int sobaId;
    @Size(max = 255)
    private String broj;
    private Boolean intenzivnaNega;
    @Max(Integer.MAX_VALUE)
    private Integer blokId;

    public SobaDto() {
    }

    public void setSobaId(int sobaId) {
        this.sobaId = sobaId;
    }

    public int getSobaId() {
        return this.sobaId;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    public String getBroj() {
        return this.broj;
    }

    public void setIntenzivnaNega(Boolean intenzivnaNega) {
        this.intenzivnaNega = intenzivnaNega;
    }

    public Boolean getIntenzivnaNega() {
        return this.intenzivnaNega;
    }

    public void setBlokId(Integer blokId) {
        this.blokId = blokId;
    }

    public Integer getBlokId() {
        return this.blokId;
    }
}