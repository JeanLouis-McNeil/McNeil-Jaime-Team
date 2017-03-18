/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theLastOfUs.control;

import byui.cit260.theLastOfUs.model.Car;
import byui.cit260.theLastOfUs.model.CarPartsInventory;
import byui.cit260.theLastOfUs.model.Game;
import byui.cit260.theLastOfUs.model.Map;
import byui.cit260.theLastOfUs.model.Player;
import byui.cit260.theLastOfUs.model.Scene;
import thelastofus.TheLastOfUs;

/**
 *
 * @author iu
 */
public class GameControl {

    public static Player createPlayer(String playersName) {
        if (playersName == null){
            return null;
        }
        Player player = new Player();
        player.setName(playersName);
        TheLastOfUs.setPlayer(player); //save the player.
        return player;
                }
    

    public static void createNewGame(Player player) {
    Game game = new Game();
    TheLastOfUs.setCurrentGame(game);
    
    CarPartsInventory[] partsInventory = GameControl.createPartsList();
    game.setPartInventory(partsInventory);
    
    Car car = new Car();
    game.setCar(car);
    
    Map map = MapControl.createNewMap();
    game.setMap(map);
    
    MapControl.moveActorToStartingLocation(map);
    }
    static void assignScenesToLocations(Map map, Scene[] scenes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public enum Item {
    wheel,
    bolt,
    sparkplug,
    oilQuart,
    battery,
    brakePads,
    transFl;
    }

    public static CarPartsInventory[] createPartsList() {
        CarPartsInventory[] partsInventory = new CarPartsInventory[7];
        
        CarPartsInventory wheel = new CarPartsInventory();
        wheel.setPartType("wheel");
        wheel.setPartQuantity(8);
        wheel.setRequiredAmount(6);
        partsInventory[Item.wheel.ordinal()] = wheel;
        
        CarPartsInventory bolt = new CarPartsInventory();
        bolt.setPartType("bolt");
        bolt.setPartQuantity(100);
        bolt.setRequiredAmount(75);
        partsInventory[Item.bolt.ordinal()] = bolt;
        
        CarPartsInventory sparkplug = new CarPartsInventory();
        sparkplug.setPartType("sparkplug");
        sparkplug.setPartQuantity(10);
        sparkplug.setRequiredAmount(8);
        partsInventory[Item.sparkplug.ordinal()] = sparkplug;
        
        CarPartsInventory oilQuarts = new CarPartsInventory();
        oilQuarts.setPartType("Oil Quarts");
        oilQuarts.setPartQuantity(10);
        oilQuarts.setRequiredAmount(6);
        partsInventory[Item.oilQuart.ordinal()] = oilQuarts;
        
        CarPartsInventory battery = new CarPartsInventory();
        battery.setPartType("battery");
        battery.setPartQuantity(2);
        battery.setRequiredAmount(1);
        partsInventory[Item.battery.ordinal()] = battery;
        
        CarPartsInventory brakePads = new CarPartsInventory();
        brakePads.setPartType("brake shoes");
        brakePads.setPartQuantity(20);
        brakePads.setRequiredAmount(12);
        partsInventory[Item.brakePads.ordinal()] = brakePads;
        
        CarPartsInventory transFl = new CarPartsInventory();
        transFl.setPartType("Transmission fluid");
        transFl.setPartQuantity(10);
        transFl.setRequiredAmount(5);
        partsInventory[Item.transFl.ordinal()] = transFl;
        
    return partsInventory;
    }
}
