package com.example.demo.dto;

@ApiModel()
public class SestraProceduraDto extends AbstractDto<int> {
    private int sestraZaposleniId;
    private int proceduraProceduraId;

    public SestraProceduraDto() {
    }

    public void setSestraZaposleniId(int sestraZaposleniId) {
        this.sestraZaposleniId = sestraZaposleniId;
    }

    public int getSestraZaposleniId() {
        return this.sestraZaposleniId;
    }

    public void setProceduraProceduraId(int proceduraProceduraId) {
        this.proceduraProceduraId = proceduraProceduraId;
    }

    public int getProceduraProceduraId() {
        return this.proceduraProceduraId;
    }
}