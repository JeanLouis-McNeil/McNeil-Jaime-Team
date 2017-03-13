/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theLastOfUs.model;

import java.util.Objects;

/**
 *
 * @author iu
 */
public class CarPartsInventory {
    private String partType;
    private int partQuantity;
    private int requiredAmount;

    public CarPartsInventory() {
    }

    
    
    public String getPartType() {
        return partType;
    }

    public void setPartType(String partType) {
        this.partType = partType;
    }

    public int getPartQuantity() {
        return partQuantity;
    }

    public void setPartQuantity(int partQuantity) {
        this.partQuantity = partQuantity;
    }

    public int getRequiredAmount() {
        return requiredAmount;
    }

    public void setRequiredAmount(int requiredAmount) {
        this.requiredAmount = requiredAmount;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.partType);
        hash = 29 * hash + this.partQuantity;
        hash = 29 * hash + this.requiredAmount;
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
        final CarPartsInventory other = (CarPartsInventory) obj;
        if (this.partQuantity != other.partQuantity) {
            return false;
        }
        if (this.requiredAmount != other.requiredAmount) {
            return false;
        }
        if (!Objects.equals(this.partType, other.partType)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CarPartsInventory{" + "partType=" + partType + ", partQuantity=" + partQuantity + ", requiredAmount=" + requiredAmount + '}';
    }
    
    
}
