package by.epam.training.model;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "Smartphone")
public class Smartphone extends Device{

    public Smartphone(){
    }

    public Smartphone(String name, int price, int weight) {
        super(name, price, weight);
    }

    @Override
    public String toString() {
        return "Smartphone: " + super.toString();
    }
}
