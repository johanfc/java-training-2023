package com.jfc.xml;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;

public class XMLDocs
{
    public static void main(String[] args)
    {
        final String strXML =   "<BookStore>" +

                "	<book id=\"b101\">" +
                " <name>Java Tutorial</name>" +
                " <price>$5.00</price>" +
                "	</book>" +

                "	<book id=\"b102\">" +
                " <name>PHP Tutorial</name>" +
                " <price>$4.75</price>" +
                "	</book>" +

                "	<book id=\"b103\">" +
                " <name>Visual Bsic Tutorial</name>" +
                " <price>$3.50</price>" +
                "	</book>" +

                "</BookStore>";

        //Call method to convert XML string content to XML Document object.
        //Now you can perform required operations on this XML doc
        Document xmlDoc = convertStringToXMLDoc( strXML );

        //Get the first node of XML Document to validate whether XML document is build correctly
        System.out.println("XML Doc First Node Value is : "+xmlDoc.getFirstChild().getNodeName());

        //Now converting XML Doc to String
        String xmlOutPut=convertXMLDocumentToString(xmlDoc);
        System.out.println("XML Doc to String: \n"+ xmlOutPut);

    }

    //Following method will  to convert String to XML Document
    private static Document convertStringToXMLDoc(String strXMLValue)
    {

        try
        {
            //Create a new object of DocumentBuilderFactory
            DocumentBuilderFactory dbfactory = DocumentBuilderFactory.newInstance();

            //Create an object DocumentBuilder to parse the specified XML Data
            DocumentBuilder builder = dbfactory.newDocumentBuilder();

            //Parse the content to Document object
            Document doc = builder.parse(new InputSource(new StringReader(strXMLValue)));
            return doc;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    private static String convertXMLDocumentToString(Document xmlDoc)
    {
        //Create a new object of TransformerFactory
        TransformerFactory transformerFactory = TransformerFactory.newInstance();

        Transformer transformer;

        try {
            transformer = transformerFactory.newTransformer();

            //Creating object of the Source document that is xml doc
            DOMSource source = new DOMSource(xmlDoc);

            StringWriter strWriter = new StringWriter();

            StreamResult stResult = new StreamResult(strWriter);

            transformer.transform(source, stResult);

            String xmlString = strWriter.getBuffer().toString();

            return xmlString;

        } catch (TransformerException e) {
            e.printStackTrace();
        }

        return null;
    }


}