package by.epam.training;

import by.epam.training.model.Device;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlType(name = "equipment")
@XmlRootElement
public class Equipment{

        private List<Device> equipmentList;

        private int totalPrice;
        private int totalWeight;

        public Equipment() {
        }

        public Equipment(List<Device> equipmentList, int totalPrice, int totalWeight) {
            this.equipmentList = equipmentList;
            this.totalPrice = totalPrice;
            this.totalWeight = totalWeight;
        }

        @XmlElementWrapper(name = "equipmentDepartment", nillable = true)
        @XmlElement(name = "device")
        public List<Device> getEquipmentList() {
            return equipmentList;
        }

        public void setEquipmentList(List<Device> equipmentList) {
            this.equipmentList = equipmentList;
        }

        @XmlElement(name = "totalPrice")
        public int getTotalPrice() {
            return totalPrice;
        }

        public void setTotalPrice(int totalPrice) {
            this.totalPrice = totalPrice;
        }

        @XmlElement(name = "totalWeight")
        public int getTotalWeight() {
            return totalWeight;
        }

        public void setTotalWeight(int totalWeight) {
            this.totalWeight = totalWeight;
        }
}
