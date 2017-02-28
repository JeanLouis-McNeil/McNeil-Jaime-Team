/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theLastOfUs.control;

import byui.cit260.theLastOfUs.model.Character1;
import byui.cit260.theLastOfUs.model.Player;
import thelastofus.TheLastOfUs;

/**
 *
 * @author iu
 */
public class MapControl {
 public static Character1 createCharacter(String characterName) {
        if (characterName == null){
            return null;
        }
        Character1 character = new Character1();
        character.setName(characterName);
        TheLastOfUs.setCharacter1(character); //save the player.
        return character;
                }

    public static void createNewMap(Character1 character) {
        System.out.println("\n*** createNewMap function called. ***");
    }
}


  
    

