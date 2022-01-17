package com.example.demo.dto;


import java.sql.Date;

public class ObukaProcedureDto {
    private int obukaProdedureId;
    private String kod;
    private String procedura;
    private Date datumIsteka;
    private String sertifikat;
    private Long zaposleniId;

    public ObukaProcedureDto() {
    }

    public void setObukaProdedureId(int obukaProdedureId) {
        this.obukaProdedureId = obukaProdedureId;
    }

    public int getObukaProdedureId() {
        return this.obukaProdedureId;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public String getKod() {
        return this.kod;
    }

    public void setProcedura(String procedura) {
        this.procedura = procedura;
    }

    public String getProcedura() {
        return this.procedura;
    }

    public void setDatumIsteka(Date datumIsteka) {
        this.datumIsteka = datumIsteka;
    }

    public Date getDatumIsteka() {
        return this.datumIsteka;
    }

    public void setSertifikat(String sertifikat) {
        this.sertifikat = sertifikat;
    }

    public String getSertifikat() {
        return this.sertifikat;
    }

    public void setZaposleniId(Long zaposleniId) {
        this.zaposleniId = zaposleniId;
    }

    public Long getZaposleniId() {
        return this.zaposleniId;
    }
}