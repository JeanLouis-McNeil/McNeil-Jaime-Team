/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theLastOfUs.View;

import byui.cit260.theLastOfUs.control.ApplePControl;
import byui.cit260.theLastOfUs.control.BreadPControl;
import byui.cit260.theLastOfUs.control.MapControl;
import byui.cit260.theLastOfUs.control.WaterBControl;
import java.util.Scanner;
import thelastofus.TheLastOfUs;

/**
 *
 * @author iu
 */
class superMarketView extends View{

    public superMarketView() {
super("\n|ST GEORGES SUPERMARKET                                 |"
                + "\nYou are heading to the most equipped supermarket of the town."
                + "\nFind yourself some food and drink and bring them with you for"
                + "\nworst situations. Don't take too much with you... Choose from"
                + "\nthese food-drink conbinations."
                + "\nB - Bread and Milk                                         "
                + "\nW - Water Bottle and Protein bars                          "
                + "\nA - Apple juice and bananas"
                + "\nM - View map                                               "
                + "\nQ - Quit                                                   ")
                ;
    }
    @Override
    public boolean doAction(String value) {
  
        value = value.toUpperCase();// convert menuOption to upper case.
        
        switch (value) {

            case "B":
                    this.breadPick();
                    break;
            case "W" : 
                this.waterBottle();
                break;
            case "A":
                this.appleSearch();
                break;
            case "M":
                this.seeLocations();
                break;
            
            default :
                System.out.println("\n***Invalid Selection, Try Again!***");
                break;
        }
        return false;
    }

    //bread options
    private void breadPick() {
        BreadPControl.createNewScene(TheLastOfUs.getPlayer());
        BreadPickView bread = new BreadPickView();
        bread.breadPick();
    }

 //Water options

    private void waterBottle() {
         WaterBControl.createNewScene(TheLastOfUs.getPlayer());
         WaterBottleView waterB = new WaterBottleView();
         waterB.waterBottle();
    }
//apple options
    private void appleSearch() {
        ApplePControl.createNewScene(TheLastOfUs.getPlayer());
        ApplePickView appleP = new ApplePickView();
        appleP.applePick();
}


    
//visit map functions
    private void seeLocations() {
         MapControl.createNewMap();
    MapView map = new MapView();
    map.watchMap();
    }



   

    

    

    
   
}
  
