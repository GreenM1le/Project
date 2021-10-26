package by.epam.training.model;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "Tablet")
public class Tablet extends Device{

    public Tablet(){
    }

    public Tablet(String name, int price, int weight) {
        super(name, price, weight);
    }

    @Override
    public String toString() {
        return "Tablet: " + super.toString();
    }
}
