package com.example.demo.dto;

@ApiModel()
public class LekReceptDto extends AbstractDto<int> {
    private int lekId;
    private int receptId;

    public LekReceptDto() {
    }

    public void setLekId(int lekId) {
        this.lekId = lekId;
    }

    public int getLekId() {
        return this.lekId;
    }

    public void setReceptId(int receptId) {
        this.receptId = receptId;
    }

    public int getReceptId() {
        return this.receptId;
    }
}