/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theLastOfUs.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author iu
 */
public class Car implements Serializable{
    private int noWheel;
    private int noAxle;
    private int noCyl;
    private double displacement;
    private String description;
    private int headLamps;
    private int battery;
    private double weight;
    private double torque;

    public Car() {
        this.description = "\nThis is your vehicle to go where your hope is and to"
                + "\ncarry the tools and medics for the cure.";
        this.battery = 0;
        this.displacement = 0;
        this.headLamps = 0;
        this.noAxle = 0;
        this.noCyl = 0;
        this.noWheel = 0;
        this.torque = 0;
        this.weight = 2500;
    
    
    }
    public int getNoWheel() {
        return noWheel;
    }

    public void setNoWheel(int noWheel) {
        this.noWheel = noWheel;
    }

    public int getNoAxle() {
        return noAxle;
    }

    public void setNoAxle(int noAxle) {
        this.noAxle = noAxle;
    }

    public int getNoCyl() {
        return noCyl;
    }

    public void setNoCyl(int noCyl) {
        this.noCyl = noCyl;
    }

    public double getDisplacement() {
        return displacement;
    }

    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getHeadLamps() {
        return headLamps;
    }

    public void setHeadLamps(int headLamps) {
        this.headLamps = headLamps;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getTorque() {
        return torque;
    }

    public void setTorque(double torque) {
        this.torque = torque;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.noWheel;
        hash = 67 * hash + this.noAxle;
        hash = 67 * hash + this.noCyl;
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.displacement) ^ (Double.doubleToLongBits(this.displacement) >>> 32));
        hash = 67 * hash + Objects.hashCode(this.description);
        hash = 67 * hash + this.headLamps;
        hash = 67 * hash + this.battery;
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.weight) ^ (Double.doubleToLongBits(this.weight) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.torque) ^ (Double.doubleToLongBits(this.torque) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Car other = (Car) obj;
        if (this.noWheel != other.noWheel) {
            return false;
        }
        if (this.noAxle != other.noAxle) {
            return false;
        }
        if (this.noCyl != other.noCyl) {
            return false;
        }
        if (Double.doubleToLongBits(this.displacement) != Double.doubleToLongBits(other.displacement)) {
            return false;
        }
        if (this.headLamps != other.headLamps) {
            return false;
        }
        if (this.battery != other.battery) {
            return false;
        }
        if (Double.doubleToLongBits(this.weight) != Double.doubleToLongBits(other.weight)) {
            return false;
        }
        if (Double.doubleToLongBits(this.torque) != Double.doubleToLongBits(other.torque)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Car{" + "noWheel=" + noWheel + ", noAxle=" + noAxle + ", noCyl=" + noCyl + ", displacement=" + displacement + ", description=" + description + ", headLamps=" + headLamps + ", battery=" + battery + ", weight=" + weight + ", torque=" + torque + '}';
    }
    
    
}
