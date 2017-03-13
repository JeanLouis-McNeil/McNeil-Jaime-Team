/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thelastofus;

import byui.cit260.theLastOfUs.View.StartProgramView;
import byui.cit260.theLastOfUs.model.Car;
import byui.cit260.theLastOfUs.model.CarPartsInventory;
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

    private static Game currentGame = null;
    private static Player player = null;
    private static Character1 character;
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
        
        
        
    Location firstLocation = new Location();
        firstLocation.setRow(1);
        firstLocation.setColumn(1);
        firstLocation.setName("The Hospital");
        firstLocation.setVisited(true);
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
        
    Car carSpecs = new Car();
        carSpecs.setBattery(1);
        carSpecs.setDescription("A car you will use to carry the required things for the cure");
        carSpecs.setDisplacement(5);
        carSpecs.setHeadLamps(2);
        carSpecs.setNoAxle(3);
        carSpecs.setNoCyl(8);
        carSpecs.setWeight(2500);
        carSpecs.setNoWheel(6);
        carSpecs.setTorque(530);
    String CarInfo = carSpecs.toString();
        System.out.println(CarInfo);
        
    CarPartsInventory parts = new CarPartsInventory();
        parts.setPartType("name");
        parts.setPartQuantity(100);
        parts.setRequiredAmount(75);
    String partInfo = parts.toString();
        System.out.println(partInfo);
        
        
        //Create a StartProgramView display.
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();
        
        
    
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        TheLastOfUs.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        TheLastOfUs.player = player;
    }

    public static Character1 getCharacter1(){
        return character;
    }  
    
    public static void setCharacter1(Character1 character) {
        TheLastOfUs.character = character;}
    }
