package br.com.jsontoxml.dto.xml.abertura;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class EFinanceiraEvento {

    @XmlElement(name = "evtAberturaeFinanceira")
    private EvtAberturaeFinanceira evtAberturaeFinanceira;

    // Getters and setters
    public EvtAberturaeFinanceira getEvtAberturaeFinanceira() {
        return evtAberturaeFinanceira;
    }

    public void setEvtAberturaeFinanceira(EvtAberturaeFinanceira evtAberturaeFinanceira) {
        this.evtAberturaeFinanceira = evtAberturaeFinanceira;
    }
}
