/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theLastOfUs.control;

import byui.cit260.theLastOfUs.model.Map;
import byui.cit260.theLastOfUs.model.Scene;

/**
 *
 * @author iu
 */
public class MapControl {

    public static Map createNewMap() {
        Map map = new Map(10,8);
        Scene scenes = createScenes();
        GameControl.assignScenesToLocations(map, scenes);
    return map;
    }

    static void moveActorToStartingLocation(Map map) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    private static Scene createScenes() {
        Scene scenes = new Scene[SceneType.values().length];
        return scenes;
        }
}


  
    

