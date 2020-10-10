package com.packt;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.StringWriter;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
class Messages{
    @XmlElement
    public final String message = "Hello World in XML";
}

public class HelloWorldXml {
    public static void main(String[] args) throws JAXBException {
        JAXBContext jaxb = JAXBContext.newInstance(Messages.class);
        Marshaller marshaller = jaxb.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FRAGMENT,Boolean.TRUE);
        StringWriter writer = new StringWriter();
        marshaller.marshal(new Messages(), writer);
        System.out.println(writer.toString());
    }
}