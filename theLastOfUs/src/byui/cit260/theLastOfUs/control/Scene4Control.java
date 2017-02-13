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
public class Scene4Control {
        public double calculateRequiredWeight(int foodQuantity, double foodWeight, int drinkQuantity, double drinkWeight) {
        
            int food = 4;
            double fWeight = 3;
            double totalFoodWeight = food * fWeight;
            int drink = 6;
            double dWeight = 3;
            double totalDrinkWeight = drink * dWeight;
            double totalWeight = totalDrinkWeight + totalFoodWeight;
            return totalWeight;
        }
}
