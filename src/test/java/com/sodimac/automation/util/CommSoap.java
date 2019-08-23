package com.sodimac.automation.util;


import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.sun.org.apache.xml.internal.serialize.OutputFormat;
import com.sun.org.apache.xml.internal.serialize.XMLSerializer;

public class CommSoap {
	
	public static String getGeneraOrdenPago(String Endpoint, String param1, String param2 ,String tagNameResult) throws MalformedURLException, IOException {
		String responseString = "";
		String outputString = "";
//		String[] Retorno = null;
//		String wsURL = "";
		URL url = new URL(Endpoint);
		URLConnection connection = url.openConnection();
		HttpURLConnection httpConn = (HttpURLConnection) connection;
		ByteArrayOutputStream bout = new ByteArrayOutputStream();

		String xmlInput = " <soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:v1=\"http://security.cl/ents/service/header/v1\" xmlns:oas=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd\" xmlns:v11=\"http://security.cl/intf/SOI/Comercial/ConsultarDicom/Comercial/v1\">"
				+ " <soapenv:Header>\n" 
				
				+ " <v1:requestHeader>\n" 
				+ " <v1:canalID>@CCOM</v1:canalID>\n"
				+ " <v1:transaccionID>994719880</v1:transaccionID>\n" 
				+ " <v1:fechaHora>201602121153</v1:fechaHora>\n"
				+ " <v1:ipServidor>YXJxdWl0ZWN0dXJh</v1:ipServidor>\n" 
				+ " </v1:requestHeader>\n" 
				+ " <oas:Security>\n"
				+ " <oas:UsernameToken>\n" 
				+ " <oas:Username>@ARQTEST</oas:Username>\n"
				+ "  <oas:Password Type='?'>0</oas:Password>\n" 
				+ " </oas:UsernameToken>\n" 
				+ " </oas:Security>\n"
				+ " </soapenv:Header>\n" 
				+ " <soapenv:Body>\n" 
				+ " <v11:ConsultarDicomRequest>\n" 
				+ " <rut>" + param1+ "</rut>\n" 
				+ "<modalidad>L</modalidad>" 
				+ "<proceso>"+param2+"</proceso>\n" 
				+ " <usuario>SBARROS</usuario>\n"
				+ " <fechaConsulta>2019-07-15T18:10:37.9337837-04:00</fechaConsulta>\n"
				+ " </v11:ConsultarDicomRequest>\n" 
				+ " </soapenv:Body>\n" 
				+ " </soapenv:Envelope>";

		byte[] buffer = new byte[xmlInput.length()];
		buffer = xmlInput.getBytes();
		bout.write(buffer);
		byte[] b = bout.toByteArray();
		String SOAPAction = "http://security.cl/intf/Comercial/ConsultarDicom/Comercial/v1/ConsultarDicom";
		// Set the appropriate HTTP parameters.
		httpConn.setRequestProperty("Content-Length", String.valueOf(b.length));
		httpConn.setRequestProperty("Content-Type", "text/xml; charset=utf-8");
		httpConn.setRequestProperty("SOAPAction", SOAPAction);
		httpConn.setRequestMethod("POST");
		httpConn.setDoOutput(true);
		httpConn.setDoInput(true);
		OutputStream out = httpConn.getOutputStream();
		// Write the content of the request to the outputstream of the HTTP Connection.
		out.write(b);
		out.close();
		// Ready with sending the request.

		// Read the response.
		InputStreamReader isr = new InputStreamReader(httpConn.getInputStream());
		BufferedReader in = new BufferedReader(isr);

		// Write the SOAP message response to a String.
		while ((responseString = in.readLine()) != null) {
			outputString = outputString + responseString;
		}
		// Parse the String output to a org.w3c.dom.Document and be able to reach every
		// node with the org.w3c.dom API.
		Document document = parseXmlFile(outputString);
		NodeList nodeLst = document.getElementsByTagName(tagNameResult);// aca pones el nombre del tag que deseas
																	// capturar
		String result = nodeLst.item(0).getTextContent();
		// System.out.println("Weather: " + result);

		// Write the SOAP message formatted to the console.
//		String formattedSOAPResponse = formatXML(outputString);
		// System.out.println(formattedSOAPResponse);
		return result;
	}

	// format the XML in your String
	public static String formatXML(String unformattedXml) {
		try {
			Document document = parseXmlFile(unformattedXml);
			OutputFormat format = new OutputFormat(document);
			format.setIndenting(true);
			format.setIndent(3);
			format.setOmitXMLDeclaration(true);
			Writer out = new StringWriter();
			XMLSerializer serializer = new XMLSerializer(out, format);
			serializer.serialize(document);
			return out.toString();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	private static Document parseXmlFile(String in) {
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			InputSource is = new InputSource(new StringReader(in));
			return db.parse(is);
		} catch (ParserConfigurationException e) {
			throw new RuntimeException(e);
		} catch (SAXException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
