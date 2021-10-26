package by.epam.training.model;

import javax.xml.bind.annotation.XmlElement;

public abstract class Device {

    private String name;
    private int price;
    private int weight;

    public Device(){
    }

    public Device(String name, int price, int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    @XmlElement(name = "deviceAge")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name = "devicePrice")
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @XmlElement(name = "deviceWeight")
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight ;
    }
}
