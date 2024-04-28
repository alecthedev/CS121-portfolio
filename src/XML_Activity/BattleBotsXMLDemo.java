package XML_Activity;

import org.w3c.dom.*;

import javax.xml.parsers.*;
import java.io.File;

public class BattleBotsXMLDemo {
    public static void main(String[] args) {
        try {
            File input = new File("battle_bots_lineup.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(input);

            System.out.println("Root element: " + document.getDocumentElement().getNodeName());

            NodeList battleList = document.getElementsByTagName("robot");

            for (int i = 0; i < battleList.getLength(); i++) {
                Node node = battleList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    System.out.println("ID: " + element.getAttribute("id"));
                    System.out.println("Name: " + element.getElementsByTagName("name").item(0).getTextContent());
                    System.out.println("Team: " + element.getElementsByTagName("team").item(0).getTextContent());
                    System.out.println("Season Wins: " + element.getElementsByTagName("season_wins").item(0).getTextContent());
                    System.out.println();

                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
