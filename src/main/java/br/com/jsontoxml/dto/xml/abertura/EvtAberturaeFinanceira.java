package br.com.jsontoxml.dto.xml.abertura;

import br.com.jsontoxml.dto.xml.assinatura.Signature;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class EvtAberturaeFinanceira {

    @XmlAttribute(name = "id")
    private String id;

    @XmlElement(name = "ideEvento")
    private IdeEvento ideEvento;

    @XmlElement(name = "ideDeclarante")
    private IdeDeclarante ideDeclarante;

    @XmlElement(name = "infoAbertura")
    private InfoAbertura infoAbertura;

    @XmlElement(name = "AberturaMovOpFin")
    private AberturaMovOpFin aberturaMovOpFin;

    @XmlElement(name = "Signature")
    private Signature signature;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public IdeEvento getIdeEvento() {
        return ideEvento;
    }

    public void setIdeEvento(IdeEvento ideEvento) {
        this.ideEvento = ideEvento;
    }

    public IdeDeclarante getIdeDeclarante() {
        return ideDeclarante;
    }

    public void setIdeDeclarante(IdeDeclarante ideDeclarante) {
        this.ideDeclarante = ideDeclarante;
    }

    public InfoAbertura getInfoAbertura() {
        return infoAbertura;
    }

    public void setInfoAbertura(InfoAbertura infoAbertura) {
        this.infoAbertura = infoAbertura;
    }

    public AberturaMovOpFin getAberturaMovOpFin() {
        return aberturaMovOpFin;
    }

    public void setAberturaMovOpFin(AberturaMovOpFin aberturaMovOpFin) {
        this.aberturaMovOpFin = aberturaMovOpFin;
    }

    public Signature getSignature() {
        return signature;
    }

    public void setSignature(Signature signature) {
        this.signature = signature;
    }
}
