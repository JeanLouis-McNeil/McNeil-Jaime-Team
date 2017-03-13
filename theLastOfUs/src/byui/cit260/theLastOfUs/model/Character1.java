/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theLastOfUs.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author iu
 */
public enum Character1 implements Serializable{

    Jeanot("The main character of the story, the same you are controling."),
    John("The one that holds the main antivirus for a general cure."),
    Dead("The dead ones, or the ones that are bited and transformed.");
    
    private final String description;
    private final Point coordinates;

 

    Character1(String description){
        this.description = description;
        coordinates = new Point(1, 1);
    }
 


    public String getDescription() {
        return description;
    }

    public Point getCoordinates() {
        return coordinates;
    }
}
