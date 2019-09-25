
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
public class testdemo {
	public static void main(String[] args) throws IOException {
		// Code to make a webservice HTTP request
		String responseString = "";
		String outputString = "";
		String wsEndPoint = "http://192.168.112.44:8066/ISHRAQOnlineBankingIntegration.asmx";
		URL url = new URL(wsEndPoint);
		URLConnection connection = url.openConnection();
		HttpURLConnection httpConn = (HttpURLConnection) connection;
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		String xmlInput = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:tem=\"http://tempuri.org/\">\r\n" + 
				"   <soapenv:Header/>\r\n" + 
				"   <soapenv:Body>\r\n" + 
				"      <tem:GetCustomerSummary>\r\n" + 
				"         <!--Optional:-->\r\n" + 
				"         <tem:customerCIFNumber>188</tem:customerCIFNumber>\r\n" + 
				"      </tem:GetCustomerSummary>\r\n" + 
				"   </soapenv:Body>\r\n" + 
				"</soapenv:Envelope>";
		
		
		byte[] buffer = new byte[xmlInput.length()];
		buffer = xmlInput.getBytes();
		bout.write(buffer);
		byte[] b = bout.toByteArray();
		
		String SOAPAction = "CreateDeal";
		
		httpConn.setRequestProperty("Content-Length", String.valueOf(b.length));
		httpConn.setRequestProperty("Content-Type", "text/xml; charset=utf-8");
		httpConn.setRequestProperty("SOAPAction", SOAPAction);
		httpConn.setRequestMethod("POST");
		httpConn.setDoOutput(true);
		httpConn.setDoInput(true);
		OutputStream out = httpConn.getOutputStream();
		// Write the content of the request to the outputstream of the HTTP
		// Connection.
		out.write(b);
		out.close();
		// Ready with sending the request.
		// Read the response.
		InputStreamReader isr = new InputStreamReader(httpConn.getInputStream(), Charset.forName("UTF-8"));
		BufferedReader in = new BufferedReader(isr);
		// Write the SOAP message response to a String.
		while ((responseString = in.readLine()) != null) {
						outputString = outputString + responseString;
		}
		// Write the SOAP message formatted to the console.
		String formattedSOAPResponse = formatXML(outputString);
		System.out.println(formattedSOAPResponse);
	}
	// format the XML in pretty String
	private static String formatXML(String unformattedXml) {
		try {
			Document document = parseXmlFile(unformattedXml);
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			transformerFactory.setAttribute("indent-number", 3);
			Transformer transformer = transformerFactory.newTransformer();
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			DOMSource source = new DOMSource(document);
			StreamResult xmlOutput = new StreamResult(new StringWriter());
			transformer.transform(source, xmlOutput);
			return xmlOutput.getWriter().toString();
		} catch (TransformerException e) {
			throw new RuntimeException(e);
		}
	}
	// parse XML
	private static Document parseXmlFile(String in) {
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			InputSource is = new InputSource(new StringReader(in));
			return db.parse(is);
		} catch (IOException | ParserConfigurationException | SAXException e) {
			throw new RuntimeException(e);
		}
	}
}