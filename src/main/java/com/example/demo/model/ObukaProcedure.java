package com.example.demo.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table()
public class ObukaProcedure {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long obukaProdedureId;
    private String kod;
    private String procedura;
    private Date datumIsteka;
    private String sertifikat;
    private Integer zaposleniId;

    public Long getObukaProdedureId() {
        return obukaProdedureId;
    }

    public void setObukaProdedureId(Long obukaProdedureId) {
        this.obukaProdedureId = obukaProdedureId;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public String getProcedura() {
        return procedura;
    }

    public void setProcedura(String procedura) {
        this.procedura = procedura;
    }

    public Date getDatumIsteka() {
        return datumIsteka;
    }

    public void setDatumIsteka(Date datumIsteka) {
        this.datumIsteka = datumIsteka;
    }

    public String getSertifikat() {
        return sertifikat;
    }

    public void setSertifikat(String sertifikat) {
        this.sertifikat = sertifikat;
    }

    public Integer getZaposleniId() {
        return zaposleniId;
    }

    public void setZaposleniId(Integer zaposleniId) {
        this.zaposleniId = zaposleniId;
    }

}
