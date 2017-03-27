/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theLastOfUs.control; 
import byui.cit260.theLastOfUs.Exceptions.GameControlException;
import byui.cit260.theLastOfUs.control.MapControl.SceneType;
import byui.cit260.theLastOfUs.model.CarTool;
import byui.cit260.theLastOfUs.model.Car;
import byui.cit260.theLastOfUs.model.CarPartsInventory;
import byui.cit260.theLastOfUs.model.Game;
import byui.cit260.theLastOfUs.model.Location;
import byui.cit260.theLastOfUs.model.Map;
import byui.cit260.theLastOfUs.model.Player;
import byui.cit260.theLastOfUs.model.Scene;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
    
    CarTool[] toolInventory = GameControl.createToolList();
    game.setToolInventory(toolInventory);
    
    Car car = new Car();
    game.setCar(car);
    
    Map map = MapControl.createNewMap();
    game.setMap(map);
    
    MapControl.moveActorToStartingLocation(map);
    }
    static void assignScenesToLocations(Map map, Scene[] scenes) {
            Location[][] locations = map.getLocations();
            
            locations[0][0].setScene(scenes[SceneType.start.ordinal()]);
            locations[0][1].setScene(scenes[SceneType.resources.ordinal()]);
            locations[0][2].setScene(scenes[SceneType.exit.ordinal()]);
            locations[0][3].setScene(scenes[SceneType.window.ordinal()]);
            locations[0][4].setScene(scenes[SceneType.door.ordinal()]);
            locations[0][5].setScene(scenes[SceneType.supermarket.ordinal()]);
            locations[0][6].setScene(scenes[SceneType.toolsroom.ordinal()]);
            locations[0][7].setScene(scenes[SceneType.drugstore.ordinal()]);
            locations[1][0].setScene(scenes[SceneType.carchoice.ordinal()]);
    }

    public static void saveGame(Game currentGame, String filePath)
        throws GameControlException {
        try(FileOutputStream fops = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);

            output.writeObject(currentGame);
            
        }
        catch (Exception e){
            throw new GameControlException(e.getMessage());
        }
    }

    public static void getSavedGame(String filePath) 
    throws GameControlException {
         Game game = null;
                try(FileInputStream fips = new FileInputStream(filePath)) {
            ObjectInputStream input = new ObjectInputStream(fips);

                    game = (Game) input.readObject();
            
        }
        catch (Exception e){
            throw new GameControlException(e.getMessage());
        }
       
                TheLastOfUs.setCurrentGame(game);
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
        wheel.setPartQuantity(0);
        wheel.setRequiredAmount(0);
        partsInventory[Item.wheel.ordinal()] = wheel;
        
        CarPartsInventory bolt = new CarPartsInventory();
        bolt.setPartType("bolt");
        bolt.setPartQuantity(0);
        bolt.setRequiredAmount(0);
        partsInventory[Item.bolt.ordinal()] = bolt;
        
        CarPartsInventory sparkplug = new CarPartsInventory();
        sparkplug.setPartType("sparkplug");
        sparkplug.setPartQuantity(0);
        sparkplug.setRequiredAmount(0);
        partsInventory[Item.sparkplug.ordinal()] = sparkplug;
        
        CarPartsInventory oilQuarts = new CarPartsInventory();
        oilQuarts.setPartType("Oil Quarts");
        oilQuarts.setPartQuantity(0);
        oilQuarts.setRequiredAmount(0);
        partsInventory[Item.oilQuart.ordinal()] = oilQuarts;
        
        CarPartsInventory battery = new CarPartsInventory();
        battery.setPartType("battery");
        battery.setPartQuantity(0);
        battery.setRequiredAmount(1);
        partsInventory[Item.battery.ordinal()] = battery;
        
        CarPartsInventory brakePads = new CarPartsInventory();
        brakePads.setPartType("brake shoes");
        brakePads.setPartQuantity(0);
        brakePads.setRequiredAmount(12);
        partsInventory[Item.brakePads.ordinal()] = brakePads;
        
        CarPartsInventory transFl = new CarPartsInventory();
        transFl.setPartType("Transmission fluid");
        transFl.setPartQuantity(0);
        transFl.setRequiredAmount(5);
        partsInventory[Item.transFl.ordinal()] = transFl;
        
    return partsInventory;
    }
    
    public enum Tool {
    wrench,
    screwdriver,
    jack,
    socket;
 }
    public static CarTool[] createToolList(){
    CarTool[] toolInventory = new CarTool[4];
    
     CarTool wrench = new CarTool();
        wrench.setToolName("set of wrenches");
        wrench.setToolQuantity(10);
        wrench.setUnitPrice(5);
        toolInventory[Tool.wrench.ordinal()] = wrench;
        
        CarTool screwdriver = new CarTool();
        screwdriver.setToolName("Screwdrivers Set");
        screwdriver.setToolQuantity(10);
        screwdriver.setUnitPrice(5);
        toolInventory[Tool.screwdriver.ordinal()] = screwdriver;
        
        CarTool jack = new CarTool();
        jack.setToolName("hydraulic jack");
        jack.setToolQuantity(10);
        jack.setUnitPrice(5);
        toolInventory[Tool.jack.ordinal()] = jack;
        
        CarTool socket = new CarTool();
        socket.setToolName("set of sockets");
        socket.setToolQuantity(10);
        socket.setUnitPrice(5);
        toolInventory[Tool.socket.ordinal()] = socket;
        
        return toolInventory;
    }
}
