/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theLastOfUs.View;

import byui.cit260.theLastOfUs.control.DrugStoreControl;
import byui.cit260.theLastOfUs.control.ShovelControl;
import java.util.Scanner;
import thelastofus.TheLastOfUs;

/**
 *
 * @author iu
 */
class toolsRoomView extends View{

private String tool;

    public toolsRoomView() {
           super("\n|THE TOOLS ROOM                                          |"
                + "\nYou left the supermarket with "
                + "\nYou are now in the tools room and your objective is to find"
                + "\nthe right weight of useful tools.                          "
                + "\nThey are listed below and they are written with their unit weight."
                + "\nS - Shovel(10 lbs)                                          "
                + "\nD - Drill(7 lbs)                                           "
                + "\nK - Knifes (1 lb)                                          "
                + "\nG - Gun (8 lbs)                                            "
                + "\nA - Ammunition (15lbs)                                     "
                + "\nQ - Quit")
                ;
        }

        @Override
    public boolean doAction(String value) {
    value = value.toUpperCase();
    
        switch (value) {

            case "S":
                    this.shovelPick();
                    break;
            case "D" : 
                this.drillChoice();
                break;
            case "K":
                this.knifeChoice();
                break;
            case "G":
                this.gunChoice();
                break;
            case "A":
                this.ammunitionGet();
            default :
                System.out.println("\n***Invalid Selection, Try Again!***");
                break;
        }
        return false;
    }
//Shovel option
    private void shovelPick() {
    ShovelControl.createNewScene(TheLastOfUs.getPlayer());
    ShovelView shovel = new ShovelView();
    shovel.shovels();
    
    }   
//Drill option
    private void drillChoice() {
        System.out.println("\n drill chosen");
    }

//Knife Option    
    private void knifeChoice() {
        System.out.println("\n knife chosen");
    }
    
//Gun Option
    private void gunChoice() {
        System.out.println("\n gun chosen");
    }
    
//Ammunition Option
    private void ammunitionGet() {
        System.out.println("\n ammunition chosen");
    }

   



  

   

   
    
}
