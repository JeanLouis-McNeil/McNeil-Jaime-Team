/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theLastOfUs.control;

import byui.cit260.theLastOfUs.model.Map;
import byui.cit260.theLastOfUs.model.Scene;
import thelastofus.TheLastOfUs;

/**
 *
 * @author iu
 */
public class MapControl {

    static Map createNewMap() {
        Map map = new Map(10,8);
        Scene[] scenes = createScenes();
        GameControl.assignScenesToLocations(map, scenes);
    return map;
    }

    static void moveActorToStartingLocation(Map map) {
        System.out.println("\nFunction successfully created");
    
    }
    public enum SceneType{
    start,
    resources,
    exit,
    window,
    door,
    supermarket,
    toolsroom,
    drugstore,
    carchoice;
    
    }
    private static Scene[] createScenes() {
        Scene[] scenes = new Scene[SceneType.values().length];
        
        Scene startScene = new Scene();
        startScene.setDescription("\nThe beginning of all. Where the character start"
                + "\nhis journey.");
        startScene.setBlockedLocation(false);
        startScene.setDisplaySymbol("ST");
        startScene.setName("The beginning");
        scenes[SceneType.start.ordinal()] = startScene;
        
        Scene resourceScene = new Scene();
        resourceScene.setDescription("\nThe character is exhausted and he should have some food.");
        resourceScene.setName("Find resources");
        resourceScene.setDisplaySymbol("FR");
        resourceScene.setBlockedLocation(false);
        scenes[SceneType.resources.ordinal()] = resourceScene;
        
        Scene exitScene = new Scene();
        exitScene.setDescription("");
        exitScene.setName("");
        exitScene.setDisplaySymbol("");
        exitScene.setBlockedLocation(false);
        scenes[SceneType.exit.ordinal()] = exitScene;
        
        Scene windowScene = new Scene();
        windowScene.setDescription("\nThe character can leave the hospital through the window.");
        windowScene.setName("The Escape");
        windowScene.setDisplaySymbol("WE");
        windowScene.setBlockedLocation(false);
        scenes[SceneType.window.ordinal()] = windowScene;
        
        Scene doorScene = new Scene();
        doorScene.setDescription("\n Another way to exit the Hospital.");
        doorScene.setName("The Escape 2");
        doorScene.setDisplaySymbol("DE");
        doorScene.setBlockedLocation(false);
        scenes[SceneType.door.ordinal()] = doorScene;
        
        Scene supScene = new Scene();
        supScene.setDescription("\nThe first place where the player can get in take "
                + "\nfood conbination for journey.");
        supScene.setName("The Supermarket");
        supScene.setDisplaySymbol("SM");
        supScene.setBlockedLocation(false);
        scenes[SceneType.supermarket.ordinal()] = supScene;
        
        Scene toolScene = new Scene();
        toolScene.setDescription("\nFinding tools has never been funny as it is now!!!");
        toolScene.setName("Finding tools");
        toolScene.setDisplaySymbol("FT");
        toolScene.setBlockedLocation(false);
        scenes[SceneType.toolsroom.ordinal()] = toolScene;
        
        Scene drugsScene = new Scene();
        drugsScene.setDescription("\nThe character is now searching for medics and drugs.");
        drugsScene.setName("Take them with you");
        drugsScene.setDisplaySymbol("DS");
        drugsScene.setBlockedLocation(false);
        scenes[SceneType.drugstore.ordinal()] = drugsScene;
        
        Scene carScene = new Scene();
        carScene.setDescription("\nChoose from the car shown to you...");
        carScene.setName("Cars");
        carScene.setDisplaySymbol("CC");
        carScene.setBlockedLocation(false);
        scenes[SceneType.carchoice.ordinal()] = carScene;
        
        
                
        
        return scenes;
        }
}


  
    

