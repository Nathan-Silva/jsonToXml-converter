package br.com.jsontoxml.dto.xml.assinatura;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;

import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class Transforms {

    @XmlElement(name = "Transform")
    private List<Transform> transform;

    public List<Transform> getTransform() {
        return transform;
    }

    public void setTransform(List<Transform> transform) {
        this.transform = transform;
    }
}
