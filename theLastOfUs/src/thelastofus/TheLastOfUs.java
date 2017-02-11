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
import byui.cit260.theLastOfUs.model.Scene2;
import byui.cit260.theLastOfUs.model.Scene3;
import byui.cit260.theLastOfUs.model.Scene4;
import byui.cit260.theLastOfUs.model.Scene5;
import byui.cit260.theLastOfUs.model.Scene6;

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
    
    
    Scene2 findWayOut = new Scene2();
        findWayOut.setName("Find way out!");
        findWayOut.setDescription("A brief thing about what you have to do first befor getting out!");
        findWayOut.setTravelTime(5);
        findWayOut.setDisplaySymbol(true);
    String scene2Info = findWayOut.toString();
        System.out.println(scene2Info);
        
    Scene3 searchForResources = new Scene3();
        searchForResources.setName("Search for resources");
        searchForResources.setDescription("You are not the same as before and you need to be healthy.");
        searchForResources.setTravelTime(7);
        searchForResources.setDisplaySymbol(true);
    String scene3Info = searchForResources.toString();
        System.out.println(scene3Info);
        
    Scene4 superMarket = new Scene4();
        superMarket.setName("Supermarket Duties");
        superMarket.setDescription("Taking some items in order to have food on road.");
        superMarket.setTravelTime(5);
        superMarket.setDisplaySymbol(true);
    String scene4Info = superMarket.toString();
        System.out.println(scene4Info);
        
    Scene5 toolsRoom = new Scene5();
        toolsRoom.setName("The Toolsromm");
        toolsRoom.setDescription("Find tools for better outside experience.");
        toolsRoom.setTravelTime(6);
        toolsRoom.setDisplaySymbol(true);
    String scene5Info = toolsRoom.toString();
        System.out.println(scene5Info);
        
    Scene6 carRental = new Scene6();
        carRental.setName("The Drugstore");
        carRental.setDescription("Find medics and grugs for road trip.");
        carRental.setTravelTime(5);
        carRental.setDisplaySymbol(true);
    String scene6Info = carRental.toString();
        System.out.println(scene6Info);
    
    }
    
}
