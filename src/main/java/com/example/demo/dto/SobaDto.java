package com.example.demo.dto;

import com.example.demo.model.PrijemnaLista;

import java.util.List;

public class SobaDto {
    private Long sobaId;
    private String broj;
    private Boolean intenzivnaNega;
    private Long blokId;

    private List<ProceduraDto> procedure;
    private List<PrijemnaListaDto> prijemnaListe;

    public List<ProceduraDto> getProcedure() {
        return procedure;
    }

    public void setProcedure(List<ProceduraDto> procedure) {
        this.procedure = procedure;
    }

    public List<PrijemnaListaDto> getPrijemnaListe() {
        return prijemnaListe;
    }

    public void setPrijemnaListe(List<PrijemnaListaDto> prijemnaListe) {
        this.prijemnaListe = prijemnaListe;
    }

    public SobaDto() {
    }

    public void setSobaId(Long sobaId) {
        this.sobaId = sobaId;
    }

    public Long getSobaId() {
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

    public void setBlokId(Long blokId) {
        this.blokId = blokId;
    }

    public Long getBlokId() {
        return this.blokId;
    }
}