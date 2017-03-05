/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theLastOfUs.View;

import byui.cit260.theLastOfUs.control.GameControl;
import byui.cit260.theLastOfUs.control.ProteinResourceControl;
import byui.cit260.theLastOfUs.control.SerumResourceControl;
import byui.cit260.theLastOfUs.control.WaterResourceControl;
import thelastofus.TheLastOfUs;

/**
 *
 * @author iu
 */
public class FindResourcesView extends View {


  
public FindResourcesView() {
        super("\n|THE WAKE UP!                                         |"
                    + "\nYou are now in a hospital after a year-long coma state"
                    + "\nand you are given a letter that tells you about a John"
                    + "\nwhich is living far from where you are now. You are gi"
                    + "\nven some resources to help you gain strenght for your "
                    + "\ntrip. "
                + "\nW - Water                                                 "
                + "\nS - Serum                                                 "
                + "\nB - Protein Bar                                          "
                + "\nG - Leave and find your way out.                          "
                + "\nQ - Quit                                                  ")
                ;
       
}

    @Override
    public boolean doAction(String menuOption2) {
        menuOption2 = menuOption2.toUpperCase();// convert menuOption to upper case.
        
        switch (menuOption2) {
            case "W":
                    this.chooseWaterAmount();
                    break;
            case "S":
                    this.chooseSerumAmount();
                    break;
            case "B":
                    this.chooseBarAmount();
                    break;
            case "G":
                    this.goFindYourWay();
                    break;
            default :
                System.out.println("\n***Invalid Selection, Try Again!***");
                break;
        }
        return false;
    
          }
    
    //the menu and view that show how to drink water. In jugs or in Gallons?
    private void chooseWaterAmount() {
        WaterResourceControl.createNewScene(TheLastOfUs.getPlayer());
    WaterView waterCount = new WaterView() {};
    waterCount.display();
    }

//Serum choices
    private void chooseSerumAmount() {
        SerumResourceControl.createNewScene(TheLastOfUs.getPlayer());
    SerumView serumCount = new SerumView();
    serumCount.display();
    }
    
//Bar menu
    private void chooseBarAmount(){
        ProteinResourceControl.createNewScene(TheLastOfUs.getPlayer());
    ProteinBarView barCount = new ProteinBarView();
    barCount.chooseBar();
    }

//Go outside of Hospital    
private void goFindYourWay() {
               GameControl.createNewGame(TheLastOfUs.getPlayer());
    LeaveHospitalView resMenu = new LeaveHospitalView();
    resMenu.findWayOut();}

 
}
       


    

   

   

    

  

    

 




    
    
    
    
    
   

    

