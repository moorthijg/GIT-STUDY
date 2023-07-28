package Interview_Questions;

import java.io.File;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.testng.annotations.Test;

public class Reading_XML_File_18 {
	
	@Test
	public void reading() {
		
		try {
			String s = "D:\\sel.xml";
			File file = new File(s);
			
			// These two lines of code create the instance of the DOM architecture of the XML file.
			
			DocumentBuilderFactory dc = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dc.newDocumentBuilder();
			
			// These codes parse the XML file and normalize it for test data retrieval.
			
			Document dm = db.parse(file);
			dm.getDocumentElement().normalize();
			System.out.println(dm.getDocumentElement().getNodeName());
			NodeList nlst = dm.getElementsByTagName("account");
			int lmgth = nlst.getLength();
			
			for(int i =0; i<lmgth;i++) {
				Node nd = nlst.item(i);
				if(nd.getNodeType()==Node.ELEMENT_NODE){
					
					Element element = (Element)nd;
					System.out.println("Account No: "+element.getAttribute("acn"));
					System.out.println("First Name: "+element.getElementsByTagName("firstname").item(0).getTextContent());
					System.out.println("Last Name: "+element.getElementsByTagName("lastname").item(0).getTextContent());
					System.out.println("Balance: "+element.getElementsByTagName("balance").item(0).getTextContent());
				}
				}
			}
		catch(Exception e) {
			e.printStackTrace();
		}
}
}

// In the above sample XML file, the bank is the head node and account is the child node. 
//We will further get values of each node written inside the account node.


























