/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theLastOfUs.control;

/**
 *
 * @author iu
 */
public class Scene3Control {
        public double calcCorrectWeight(int waterQuantity, double waterWeight, int serumQuantity, double serumWeight) {
        
            int waterGlass = 1;
            double weightInGrams = 1000;
            double totalWeight = waterGlass * weightInGrams;
            int serumPack = 2;
            double sWeightInGrams = 2500;
            double totalWeightS = serumPack * sWeightInGrams;
            
            double totalResourcesWeight = totalWeight + totalWeightS;
            
            return totalResourcesWeight;
        }
}
