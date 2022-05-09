package xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class XmlUtils {

    public static void parseXml(String xml) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
            DocumentBuilder db = dbf.newDocumentBuilder();
            InputStream stream = new ByteArrayInputStream(xml.getBytes("UTF-8"));
            Document doc = db.parse(stream);
            doc.getDocumentElement().normalize();
            System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
            NodeList nodeList = doc.getDocumentElement().getElementsByTagName("property");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    System.out.println("  key = " +
                            element.getElementsByTagName("name").item(0).getTextContent() +
                            "; value = " +
                            element.getElementsByTagName("value").item(0).getTextContent()
                    );
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
