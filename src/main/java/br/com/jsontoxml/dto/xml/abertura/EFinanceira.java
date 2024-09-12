package br.com.jsontoxml.dto.xml.abertura;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "eFinanceira")
@XmlAccessorType(XmlAccessType.FIELD)
public class EFinanceira {

    @XmlElement(name = "loteEventos")
    private LoteEventos loteEventos;

    public LoteEventos getLoteEventos() {
        return loteEventos;
    }

    public void setLoteEventos(LoteEventos loteEventos) {
        this.loteEventos = loteEventos;
    }
}