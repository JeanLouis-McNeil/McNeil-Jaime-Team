/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theLastOfUs.control;

import byui.cit260.theLastOfUs.model.Player;
import thelastofus.TheLastOfUs;

/**
 *
 * @author iu
 */
public class Scene5Control {
    
  public static Player createPlayer(String playersName) {
        if (playersName == null){
            return null;
        }
        Player player = new Player();
        player.setName(playersName);
        TheLastOfUs.setPlayer(player); //save the player.
        return player;
                }
    public static void createNewScene(Player player) {
        System.out.println("\n**** New Scene created ****");}
    
        public double calcRequiredWeight(int itemQuantity, double itemWeight) {
        
            int quantity = 10;
            double weight = 2;
            double totalWeight = quantity * weight;
            
            return totalWeight;
        }
}
