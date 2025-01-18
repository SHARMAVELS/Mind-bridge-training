package com.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import java.io.File;
import java.io.IOException;

import static jdk.internal.opt.CommandLine.parse;

public class Dom {
    public static void main(String[] args) throws ParserConfigurationException, IOException {
        try {


            DocumentBuilderFactory db = DocumentBuilderFactory.newInstance();
            DocumentBuilder f = db.newDocumentBuilder();
            Document root = f.parse(new File("C:\\Users\\sharm\\IdeaProjects\\Testcases\\src\\com\\xml\\fi.xml"));
            NodeList li=root.getElementsByTagName("id");
            NodeList lii=root.getElementsByTagName("name");
            NodeList lik=root.getElementsByTagName("department");
            NodeList lif=root.getElementsByTagName("grade");

            for(int i=0;i< li.getLength();i++)
            {
                Node n=li.item(i);
                System.out.print(n.getNodeName());
                System.out.print(n.getFirstChild().getNodeName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
