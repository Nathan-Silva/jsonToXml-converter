package br.com.jsontoxml.rest;

import br.com.jsontoxml.service.XmlGeneratorService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class GererateXmlResource {

    private XmlGeneratorService xmlGeneratorService;

    public GererateXmlResource(XmlGeneratorService xmlGeneratorService) {
        this.xmlGeneratorService = xmlGeneratorService;
    }

    @PostMapping("generatexml")
    public void genetareXml(){
        xmlGeneratorService.generateXml();
    }
}
