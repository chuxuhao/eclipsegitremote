package FacadePattern;
import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
public class XMLUtil {
	public static Object getBean() {
		try {
			DocumentBuilderFactory dFactory=DocumentBuilderFactory.newInstance();
			DocumentBuilder builder=dFactory.newDocumentBuilder();
			Document doc;
			doc=builder.parse(new File("src/FacadePattern/config.xml"));
			org.w3c.dom.NodeList nl=doc.getElementsByTagName("className");
			Node classNode=nl.item(0).getFirstChild();
			String cName=classNode.getNodeValue().trim();
			Class<?> c=Class.forName(cName);
			Object obj=c.getDeclaredConstructor().newInstance();
			return obj;
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			return null;
	}
}
}
