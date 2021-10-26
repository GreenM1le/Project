package by.epam.training;

import by.epam.training.model.Device;
import by.epam.training.model.Notebook;
import by.epam.training.model.Smartphone;
import by.epam.training.model.Tablet;
import by.epam.training.util.XMLHandler;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, JAXBException {

        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();

        XMLHandler handler = new XMLHandler();
        parser.parse(new File("src/main/resources/devices.xml"), handler);

        ArrayList<Device> devices = XMLHandler.getDeviceArrayList();
        int count = 0;
        for (Device item : devices) {
            count++;
        }
        System.out.printf("Total number of devices: %d ", count);
        System.out.println();


        System.out.println("Enter the number of devices required for IT-department");
        Scanner scanner = new Scanner(System.in);
        int equip = scanner.nextInt();

        ArrayList<Device> equipmentList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < equip; i++) {
            Device equipmentDevice = devices.get((random.nextInt(devices.size())));
            equipmentList.add(equipmentDevice);
        }
        System.out.println("Equipment: ");
        int totalPrice = 0;
        int totalWeight = 0;
        for (Device item : equipmentList){
            System.out.println(item);
            totalPrice += item.getPrice();
            totalWeight += item.getWeight();
            }
        System.out.println();
        System.out.printf("The total cost of devices for IT-department: %d\nThe total cost of devices for IT-department: %d", totalPrice, totalWeight);

        Equipment equipment = new Equipment();
        equipment.setEquipmentList(equipmentList);
        equipment.setTotalPrice(totalPrice);
        equipment.setTotalWeight(totalWeight);
    }
    }
