package com.projects.services.Parser;
import java.io.File;
import java.util.Optional;
import javax.xml.parsers.*;

import com.projects.entities.Project;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import com.projects.repositories.ProjectRepository;
import org.xml.sax.helpers.DefaultHandler;

public class Parser extends DefaultHandler  {

    private static ProjectRepository projectRepository;

    public Parser(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public static void parseDoc(String docName, Boolean isMetadata) {

        try {
            File fXmlFile = new File(docName);
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(fXmlFile);
            Project proj = new Project();
            doc.getDocumentElement().normalize();

            if(!isMetadata) {
                Element root = doc.getDocumentElement();

                if (root.getElementsByTagName("rcn").item(0) != null)
                    proj.setId(Long.valueOf(root.getElementsByTagName("rcn").item(0).getTextContent()));

                if (root.getElementsByTagName("acronym").item(0) != null)
                    proj.setAcronym(root.getElementsByTagName("acronym").item(0).getTextContent());

                if (root.getElementsByTagName("objective").item(0) != null)
                    proj.setObjective(root.getElementsByTagName("objective").item(0).getTextContent());

                if (root.getElementsByTagName("title").item(0) != null)
                    proj.setTitle(root.getElementsByTagName("title").item(0).getTextContent());

                if (root.getElementsByTagName("totalCost").item(0) != null)
                    proj.setTitle(root.getElementsByTagName("totalCost").item(0).getTextContent());

                if (root.getElementsByTagName("ecMaxContribution").item(0) != null)
                    proj.setMaxContribution(root.getElementsByTagName("ecMaxContribution").item(0).getTextContent());

                if (root.getElementsByTagName("startDate").item(0) != null)
                    proj.setStartDate(root.getElementsByTagName("startDate").item(0).getTextContent());

                if (root.getElementsByTagName("endDate").item(0) != null)
                    proj.setEndDate(root.getElementsByTagName("endDate").item(0).getTextContent());

                if (root.getElementsByTagName("status").item(0) != null)
                    proj.setStatusName(root.getElementsByTagName("status").item(0).getTextContent());

//            NodeList programme = root.getElementsByTagName("relations").item(0).getChildNodes();
//            for(Integer i = 0; i < programme.getLength(); i++){
//               //if(programme.item(i).getAttributes().getNamedItem("type") == "relatedProgramme")
//                    proj.setProgramme("da");
//            }
            } else {
                NodeList projects = doc.getElementsByTagName("project");
                String rcn = "";
                for(Integer i = 0; i < projects.getLength(); i++){
                    rcn = projects.item(i).getChildNodes().item(1).getTextContent();
                    Optional<Project> prj = projectRepository.findById(Long.valueOf(rcn));
                    if(!prj.isPresent()){
                       parseDoc("/Users/roconstantin/Documents/university/Semestrul II/DAI/dai-homework/src/main/resources/tmp/project-rcn-" + rcn + "_en.xml", false);
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

