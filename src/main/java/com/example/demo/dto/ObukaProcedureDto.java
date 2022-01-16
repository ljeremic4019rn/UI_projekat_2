package com.example.demo.dto;

import com.example.demo.annotation.CheckDate;

@ApiModel()
public class ObukaProcedureDto extends AbstractDto<int> {
    private int obukaProdedureId;
    @Size(max = 255)
    private String kod;
    @Size(max = 255)
    private String procedura;
    @CheckDate
    private Date datumIsteka;
    @Size(max = 255)
    private String sertifikat;
    @Max(Integer.MAX_VALUE)
    private Integer zaposleniId;

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

    public void setDatumIsteka(java.sql.Date datumIsteka) {
        this.datumIsteka = datumIsteka;
    }

    public java.sql.Date getDatumIsteka() {
        return this.datumIsteka;
    }

    public void setSertifikat(String sertifikat) {
        this.sertifikat = sertifikat;
    }

    public String getSertifikat() {
        return this.sertifikat;
    }

    public void setZaposleniId(Integer zaposleniId) {
        this.zaposleniId = zaposleniId;
    }

    public Integer getZaposleniId() {
        return this.zaposleniId;
    }
}