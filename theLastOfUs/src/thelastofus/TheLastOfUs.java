/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thelastofus;

import byui.cit260.theLastOfUs.model.Map;
import byui.cit260.theLastOfUs.model.Player;

/**
 *
 * @author iu
 */
public class TheLastOfUs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
    playerOne.setName("McNeil Jean-Louis");
    playerOne.setBestTime(8.00);
    playerOne.setAge(24);
    
    String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        Player playerTwo = new Player();
        
    playerTwo.setName("Jaime Reyes");
    playerTwo.setBestTime(10.00);
    playerTwo.setAge(30);
    
    String playerInfo2 = playerTwo.toString();
        System.out.println(playerInfo2);
        
        Map gameMap = new Map();
        
    gameMap.setRowCount(8);
    gameMap.setColumnCount(16);
    
    
    String gameInfo = gameMap.toString();
        System.out.println(gameInfo);
    }
    
    
    
    
}
