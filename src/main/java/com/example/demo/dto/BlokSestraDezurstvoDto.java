package com.example.demo.dto;

@ApiModel()
public class BlokSestraDezurstvoDto extends AbstractDto<int> {
    private int blokBlokId;
    private int sestraZaposleniId;

    public BlokSestraDezurstvoDto() {
    }

    public void setBlokBlokId(int blokBlokId) {
        this.blokBlokId = blokBlokId;
    }

    public int getBlokBlokId() {
        return this.blokBlokId;
    }

    public void setSestraZaposleniId(int sestraZaposleniId) {
        this.sestraZaposleniId = sestraZaposleniId;
    }

    public int getSestraZaposleniId() {
        return this.sestraZaposleniId;
    }
}