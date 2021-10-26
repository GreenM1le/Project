package by.epam.training.model;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "Notebook")
public class Notebook extends Device{

    public Notebook(){
    }

    public Notebook(String name, int price, int weight) {
        super(name, price, weight);
    }

    @Override
    public String toString() {
        return "Notebook: " + super.toString();
    }
}
