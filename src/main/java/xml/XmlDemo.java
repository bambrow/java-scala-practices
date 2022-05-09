package xml;

public class XmlDemo {

    public static void main(String[] args) {
        String xml = "<?xml version=\"1.0\"?>" +
                "<?xml-stylesheet type=\"text/xsl\" href=\"configuration.xsl\"?>" +
                "<configuration>" +
                "<property>" +
                "<name>abc</name>" +
                "<value>bcd</value>" +
                "</property>" +
                "<property>" +
                "<name>cde</name>" +
                "<value>def</value>" +
                "</property>" +
                "</configuration>";

        XmlUtils.parseXml(xml);
    }

}
