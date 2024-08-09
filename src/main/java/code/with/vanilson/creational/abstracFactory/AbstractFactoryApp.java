package code.with.vanilson.creational.abstracFactory;

import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.ByteArrayInputStream;

/**
 * AbstractFactoryApp
 *
 * @author vamuhong
 * @version 1.0
 * @since 2024-08-09
 */
public class AbstractFactoryApp {

    public static void main(String[] args) throws Exception {
        String xml = "<document><body><stock>TSLA</stock></body></document>";
        ByteArrayInputStream bais = new ByteArrayInputStream(xml.getBytes());
        DocumentBuilderFactory abstractFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder factory = abstractFactory.newDocumentBuilder();

        Document doc = factory.parse(bais);

        System.out.println("Root element : " + doc.getDocumentElement().getNodeName());

        System.out.println(abstractFactory.getClass());
        System.out.println(factory.getClass());

    }
}