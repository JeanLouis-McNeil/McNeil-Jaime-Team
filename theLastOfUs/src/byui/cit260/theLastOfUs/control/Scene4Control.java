/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theLastOfUs.control;

import byui.cit260.theLastOfUs.model.Player;

/**
 *
 * @author iu
 */
public class Scene4Control {

    public static void createNewScene(Player player) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
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
