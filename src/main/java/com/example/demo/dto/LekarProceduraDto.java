package com.example.demo.dto;

@ApiModel()
public class LekarProceduraDto extends AbstractDto<int> {
    private int lekarZaposleniId;
    private int proceduraProceduraId;

    public LekarProceduraDto() {
    }

    public void setLekarZaposleniId(int lekarZaposleniId) {
        this.lekarZaposleniId = lekarZaposleniId;
    }

    public int getLekarZaposleniId() {
        return this.lekarZaposleniId;
    }

    public void setProceduraProceduraId(int proceduraProceduraId) {
        this.proceduraProceduraId = proceduraProceduraId;
    }

    public int getProceduraProceduraId() {
        return this.proceduraProceduraId;
    }
}