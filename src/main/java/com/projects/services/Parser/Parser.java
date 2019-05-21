package com.projects.services.Parser;
import java.io.File;
import java.io.IOException;
import java.util.Optional;
import javax.xml.parsers.*;

import com.projects.entities.Project;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

import com.projects.repositories.ProjectRepository;
import org.xml.sax.helpers.DefaultHandler;

public class Parser extends DefaultHandler  {

    public void parseDoc(String docName) {

        try {

            File fXmlFile = new File(docName);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);

            doc.getDocumentElement().normalize();

            NodeList nList = doc.getElementsByTagName("project");


            for (int temp = 0; temp < nList.getLength(); temp++) {

                Node nNode = nList.item(temp);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                    Element eElement = (Element) nNode;

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

