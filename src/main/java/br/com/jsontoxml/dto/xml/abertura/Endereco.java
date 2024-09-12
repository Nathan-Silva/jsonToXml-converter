package br.com.jsontoxml.dto.xml.abertura;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Endereco {

    @XmlElement(name = "Logradouro")
    private String logradouro;

    @XmlElement(name = "Numero")
    private String numero;

    @XmlElement(name = "Bairro")
    private String bairro;

    @XmlElement(name = "CEP")
    private String cep;

    @XmlElement(name = "Municipio")
    private String municipio;

    @XmlElement(name = "UF")
    private String uf;

    // Getters and setters

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
}
