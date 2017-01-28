/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thelastofus;

import byui.cit260.theLastOfUs.model.Character1;
import byui.cit260.theLastOfUs.model.Game;
import byui.cit260.theLastOfUs.model.Location;
import byui.cit260.theLastOfUs.model.Map;
import byui.cit260.theLastOfUs.model.Player;
import byui.cit260.theLastOfUs.model.Scene;

/**
 *
 * @author iu
 */
public class TheLastOfUs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Game tGame = new Game();
    tGame.setTotalTime(30.0);
    tGame.setNoPeople(2);
    
    String gameInfo2 = tGame.toString();
        System.out.println(gameInfo2);
        
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
        
    
    Character1 mainCharacter = new Character1();
        mainCharacter.setName("The Leader");
        mainCharacter.setDescription("The character the player leads through the game.");
        mainCharacter.setCoordinatesX(1);
        mainCharacter.setCoordinatesY(1);
        
    String characterInfo = mainCharacter.toString();
        System.out.println(characterInfo);    
        
    Location firstLocation = new Location();
        firstLocation.setRow(1);
        firstLocation.setColumn(1);
        firstLocation.setName("The Hospital");
        firstLocation.setVisited(true);
        firstLocation.setAmountRemaining(10);
    String locationInfo = firstLocation.toString();
        System.out.println(locationInfo);    
    
    Scene hospitalScene1 = new Scene();
        hospitalScene1.setName("The letter");
        hospitalScene1.setDescription("The word John left for the main character is found.");
        hospitalScene1.setBlockedLocation(true);
        hospitalScene1.setDisplaySymbol(true);
    String sceneInfo = hospitalScene1.toString();
        System.out.println(sceneInfo);
    }
    
    
    
    
}
