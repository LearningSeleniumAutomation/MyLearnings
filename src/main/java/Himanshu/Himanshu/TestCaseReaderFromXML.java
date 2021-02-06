package Himanshu.Himanshu;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class TestCaseReaderFromXML {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		// TODO Auto-generated method stub
		
		File file = new File("C:\\Users\\hikumar\\eclipse-workspace\\LearningJava\\Himanshu\\src\\main\\java\\Himanshu\\Himanshu\\TestCaseXML.xml");
		if(file.exists())
		{
			System.out.println("File is present and File name is :" +file.getName() );
		}
		else
		{
			System.out.println("Get the correct location!! File not Found");
		}

		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();  
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse(file);  
		System.out.println("Root element: " + doc.getDocumentElement().getNodeName());  
		NodeList nodeList = doc.getElementsByTagName("student");
		for (int itr = 0; itr < nodeList.getLength(); itr++)   
		{  
		Node node = nodeList.item(itr);  
		System.out.println("\nNode Name :" + node.getNodeName());  
		if (node.getNodeType() == Node.ELEMENT_NODE)   
		{  
		Element eElement = (Element) node;  
		System.out.println("Student id: "+ eElement.getElementsByTagName("id").item(0).getTextContent());  
		System.out.println("First Name: "+ eElement.getElementsByTagName("firstname").item(0).getTextContent());  
		System.out.println("Last Name: "+ eElement.getElementsByTagName("lastname").item(0).getTextContent());  
		System.out.println("Subject: "+ eElement.getElementsByTagName("subject").item(0).getTextContent());  
		System.out.println("Marks: "+ eElement.getElementsByTagName("marks").item(0).getTextContent());  
		}  
		} 
		
	}

}
