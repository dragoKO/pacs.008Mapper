package iso.std.iso._20022.tech.xsd;

import iso.std.iso._20022.tech.xsd.pacs_008_001.Document;
import iso.std.iso._20022.tech.xsd.pacs_008_001.FIToFICustomerCreditTransferV12;
import iso.std.iso._20022.tech.xsd.pacs_008_001.GroupHeader113;
import iso.std.iso._20022.tech.xsd.pacs_008_001.ObjectFactory;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.File;
public class Main {
    public static void main(String[] args) {
        try {
//            // Step 1: Instantiate ObjectFactory
            ObjectFactory objectFactory = new ObjectFactory();
//
//            // Step 2: Create Document instance
            Document document = objectFactory.createDocument();
            FIToFICustomerCreditTransferV12 fiToFICstmrCdtTrf=new FIToFICustomerCreditTransferV12();

            GroupHeader113 groupHeader113=new GroupHeader113();
            groupHeader113.setBtchBookg(true);

            fiToFICstmrCdtTrf.setGrpHdr(groupHeader113);


            document.setFIToFICstmrCdtTrf(fiToFICstmrCdtTrf);


            // Step 3: Set values


            // Step 4: Marshal to XML
            JAXBContext context = JAXBContext.newInstance(Document.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            // Marshal to file
            File xmlFile = new File("CreatedTestDocument.xml");
            marshaller.marshal(objectFactory.createDocument(document), xmlFile);

            System.out.println("XML document created successfully.");

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
