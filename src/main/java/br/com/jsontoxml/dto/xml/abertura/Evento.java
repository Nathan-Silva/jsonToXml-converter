package br.com.jsontoxml.dto.xml.abertura;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Evento {

    @XmlAttribute(name = "id")
    private String id;

    @XmlElement(name = "eFinanceira")
    private EFinanceiraEvento eFinanceiraEvento;

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EFinanceiraEvento getEFinanceiraEvento() {
        return eFinanceiraEvento;
    }

    public void setEFinanceiraEvento(EFinanceiraEvento eFinanceiraEvento) {
        this.eFinanceiraEvento = eFinanceiraEvento;
    }
}
