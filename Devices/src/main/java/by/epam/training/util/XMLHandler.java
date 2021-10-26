package by.epam.training.util;

import by.epam.training.model.*;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;

public class XMLHandler extends DefaultHandler {
    private static ArrayList<Device> deviceArrayList = new ArrayList<>();

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equals("notebook")) {
            String name = attributes.getValue("name");
            int price = Integer.valueOf(attributes.getValue("price"));
            int weight = Integer.valueOf(attributes.getValue("weight"));
            deviceArrayList.add(new Notebook(name,price,weight));
        } else if (qName.equals("reader")) {
            String name = attributes.getValue("name");
            int price = Integer.valueOf(attributes.getValue("price"));
            int weight = Integer.valueOf(attributes.getValue("weight"));
            deviceArrayList.add(new Reader(name,price,weight));
        } else if (qName.equals("smartphone")) {
            String name = attributes.getValue("name");
            int price = Integer.valueOf(attributes.getValue("price"));
            int weight = Integer.valueOf(attributes.getValue("weight"));
            deviceArrayList.add(new Smartphone(name,price,weight));
        } else if (qName.equals("tablet")) {
            String name = attributes.getValue("name");
            int price = Integer.valueOf(attributes.getValue("price"));
            int weight = Integer.valueOf(attributes.getValue("weight"));
            deviceArrayList.add(new Tablet(name,price,weight));
        }
    }

    public static ArrayList<Device> getDeviceArrayList() {
        return deviceArrayList;
    }
}
