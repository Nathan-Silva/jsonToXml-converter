package br.com.jsontoxml.dto.xml.abertura;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class IdeEvento {

    @XmlElement(name = "indRetificacao")
    private int indRetificacao;

    @XmlElement(name = "nrRecibo")
    private String nrRecibo;

    @XmlElement(name = "tpAmb")
    private int tpAmb;

    @XmlElement(name = "aplicEmi")
    private int aplicEmi;

    @XmlElement(name = "verAplic")
    private String verAplic;

    // Getters and setters
    public int getIndRetificacao() {
        return indRetificacao;
    }

    public void setIndRetificacao(int indRetificacao) {
        this.indRetificacao = indRetificacao;
    }

    public String getNrRecibo() {
        return nrRecibo;
    }

    public void setNrRecibo(String nrRecibo) {
        this.nrRecibo = nrRecibo;
    }

    public int getTpAmb() {
        return tpAmb;
    }

    public void setTpAmb(int tpAmb) {
        this.tpAmb = tpAmb;
    }

    public int getAplicEmi() {
        return aplicEmi;
    }

    public void setAplicEmi(int aplicEmi) {
        this.aplicEmi = aplicEmi;
    }

    public String getVerAplic() {
        return verAplic;
    }

    public void setVerAplic(String verAplic) {
        this.verAplic = verAplic;
    }
}