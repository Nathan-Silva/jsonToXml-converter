package br.com.jsontoxml.dto.xml.assinatura;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Reference {

    @XmlAttribute(name = "URI")
    private String uri;

    @XmlElement(name = "Transforms")
    private Transforms transforms;

    @XmlElement(name = "DigestMethod")
    private DigestMethod digestMethod;

    @XmlElement(name = "DigestValue")
    private String digestValue;


    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public Transforms getTransforms() {
        return transforms;
    }

    public void setTransforms(Transforms transforms) {
        this.transforms = transforms;
    }

    public DigestMethod getDigestMethod() {
        return digestMethod;
    }

    public void setDigestMethod(DigestMethod digestMethod) {
        this.digestMethod = digestMethod;
    }

    public String getDigestValue() {
        return digestValue;
    }

    public void setDigestValue(String digestValue) {
        this.digestValue = digestValue;
    }
}
