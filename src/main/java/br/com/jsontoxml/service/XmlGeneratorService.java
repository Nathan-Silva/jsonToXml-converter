package br.com.jsontoxml.service;

import br.com.jsontoxml.dto.xml.abertura.EFinanceira;
import br.com.jsontoxml.dto.xml.abertura.Evento;
import br.com.jsontoxml.dto.xml.abertura.LoteEventos;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;
import org.springframework.stereotype.Service;

@Service
public class XmlGeneratorService {

    public void generateXml(){
        try{
            EFinanceira eFinanceira = new EFinanceira();
            LoteEventos loteEventos = new LoteEventos();
            Evento evento = new Evento();
            evento.setId("cjsndjcnasjdfnvjsndfvojasdv");

            loteEventos.setEvento(evento);

            eFinanceira.setLoteEventos(loteEventos);

            JAXBContext context = JAXBContext.newInstance(EFinanceira.class);

            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            marshaller.marshal(eFinanceira, System.out);
        }catch (Exception e) {

        }

    }
}
