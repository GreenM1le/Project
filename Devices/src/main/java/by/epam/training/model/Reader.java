package by.epam.training.model;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "Reader")
public class Reader extends Device{

    public Reader(){
    }

    public Reader(String name, int price, int weight) {
        super(name, price, weight);
    }

    @Override
    public String toString() {
        return "Reader: " + super.toString();
    }
}
