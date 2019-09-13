package com.der.abstractFactory.version6;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * @ClassName XMLUtil
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/6 23:57
 * @Version 1.0
 **/
public class XMLUtil {

    public static void main(String[] args) {
        System.out.println(XMLUtil.class.getClassLoader().getResource("config.xml").getPath());
    }

    public static Object getBean(){
        try {
            DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = builderFactory.newDocumentBuilder();
            Document doc;
            doc = documentBuilder.parse(new File(XMLUtil.class.getClassLoader().getResource("config.xml").getPath()));
            NodeList tagName = doc.getElementsByTagName("className");
            Node node = tagName.item(0).getFirstChild();
            String value = node.getNodeValue();
            return Class.forName(value).newInstance();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }
}
