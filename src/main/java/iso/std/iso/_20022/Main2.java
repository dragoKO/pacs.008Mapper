package iso.std.iso._20022;

import iso.std.iso._20022.tech.xsd.pacs_008_001.Document;
import iso.std.iso._20022.tech.xsd.pacs_008_001.ObjectFactory;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;
import java.math.BigDecimal;

public class Main2 {
    public static void main(String[] args) {
        try {
            // Step 1: Instantiate JAXBContext
            JAXBContext jaxbContext = JAXBContext.newInstance(ObjectFactory.class);

            // Step 2: Create Unmarshaller
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            // Step 3: Unmarshal XML file to Java object
            File xmlFile = new File("document.xml");
            JAXBElement<Document> jaxbElement = (JAXBElement<Document>) unmarshaller.unmarshal(xmlFile);
            Document document = jaxbElement.getValue();

            System.out.println("document.getFIToFICstmrCdtTrf().getGrpHdr().getCreDtTm() = " + document.getFIToFICstmrCdtTrf().getGrpHdr().getCreDtTm());

            String ccy = document.getFIToFICstmrCdtTrf()
                    .getCdtTrfTxInf()
                    .get(0)
                    .getIntrBkSttlmAmt()
                    .getCcy();

            BigDecimal value = document.getFIToFICstmrCdtTrf()
                    .getCdtTrfTxInf()
                    .get(0)
                    .getIntrBkSttlmAmt()
                    .getValue();

            System.out.println(ccy + " -> " + value);

            // Step 4: Use the Java object
            // Example: Print the document title
//            System.out.println("Document Title: " + document.getTitle());
            // Example: Access other properties as needed...

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}

