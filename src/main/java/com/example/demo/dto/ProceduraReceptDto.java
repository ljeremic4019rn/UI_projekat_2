package com.example.demo.dto;

@ApiModel()
public class ProceduraReceptDto extends AbstractDto<int> {
    private int proceduraId;
    private int receptId;

    public ProceduraReceptDto() {
    }

    public void setProceduraId(int proceduraId) {
        this.proceduraId = proceduraId;
    }

    public int getProceduraId() {
        return this.proceduraId;
    }

    public void setReceptId(int receptId) {
        this.receptId = receptId;
    }

    public int getReceptId() {
        return this.receptId;
    }
}