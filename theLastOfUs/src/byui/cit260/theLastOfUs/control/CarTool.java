/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theLastOfUs.control;

import java.util.Objects;

/**
 *
 * @author JASMINE
 */
class CarTool {
    private String toolName;
    private int toolQuantity;
    private double unitPrice;

    public CarTool() {
    }

    
    
    public String getToolName() {
        return toolName;
    }

    public void setToolName(String toolName) {
        this.toolName = toolName;
    }

    public int getToolQuantity() {
        return toolQuantity;
    }

    public void setToolQuantity(int toolQuantity) {
        this.toolQuantity = toolQuantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.toolName);
        hash = 19 * hash + this.toolQuantity;
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.unitPrice) ^ (Double.doubleToLongBits(this.unitPrice) >>> 32));
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
        final CarTool other = (CarTool) obj;
        if (this.toolQuantity != other.toolQuantity) {
            return false;
        }
        if (Double.doubleToLongBits(this.unitPrice) != Double.doubleToLongBits(other.unitPrice)) {
            return false;
        }
        if (!Objects.equals(this.toolName, other.toolName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CarTool{" + "toolName=" + toolName + ", toolQuantity=" + toolQuantity + ", unitPrice=" + unitPrice + '}';
    }
    
    
}
