package br.com.jsontoxml.dto.xml.abertura;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class InfoAbertura {

    @XmlElement(name = "dtInicio")
    private String dtInicio;

    @XmlElement(name = "dtFim")
    private String dtFim;

    // Getters and setters
    public String getDtInicio() {
        return dtInicio;
    }

    public void setDtInicio(String dtInicio) {
        this.dtInicio = dtInicio;
    }

    public String getDtFim() {
        return dtFim;
    }

    public void setDtFim(String dtFim) {
        this.dtFim = dtFim;
    }
}
