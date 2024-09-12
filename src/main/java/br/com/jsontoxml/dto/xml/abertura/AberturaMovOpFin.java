package br.com.jsontoxml.dto.xml.abertura;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class AberturaMovOpFin {

    @XmlElement(name = "ResponsavelRMF")
    private ResponsavelRMF responsavelRMF;

    @XmlElement(name = "RespeFin")
    private RespeFin respeFin;

    @XmlElement(name = "RepresLegal")
    private RepresLegal represLegal;

    // Getters and setters
    public ResponsavelRMF getResponsavelRMF() {
        return responsavelRMF;
    }

    public void setResponsavelRMF(ResponsavelRMF responsavelRMF) {
        this.responsavelRMF = responsavelRMF;
    }

    public RespeFin getRespeFin() {
        return respeFin;
    }

    public void setRespeFin(RespeFin respeFin) {
        this.respeFin = respeFin;
    }

    public RepresLegal getRepresLegal() {
        return represLegal;
    }

    public void setRepresLegal(RepresLegal represLegal) {
        this.represLegal = represLegal;
    }
}
