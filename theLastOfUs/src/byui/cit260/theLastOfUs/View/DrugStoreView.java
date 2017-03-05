/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theLastOfUs.View;

import byui.cit260.theLastOfUs.control.CarControl;
import java.util.Scanner;
import thelastofus.TheLastOfUs;

/**
 *
 * @author iu
 */
class DrugStoreView extends View {


    public DrugStoreView() {
        super("\n Choose the drugs and medics needed for the trip"
                + "\nEach items are in a 15 lbs pack."
                + "\nF - First Aid tools                               "
                + "\nA - Antibiotics                                   "
                + "\nV - Antivenomous (for snakes bites)               "
                + "\nP - Antiparalysis                                 "
                + "\nQ - Quit                                          ")
                ;
    }
@Override
    public boolean doAction(String value) {
        value = value.toUpperCase();// convert menuOption to upper case.
        
        switch (value) {

            case "F":
                this.exitDrugstore();    
                    break;
            case "A" : 
                this.exitDrugstore();
                break;
            case "V":
                this.exitDrugstore();
                break;
            case "P":
                this.exitDrugstore();
                break;
            
            default :
                System.out.println("\n***Invalid Selection, Try Again!***");
                break;
        }
        return false; }
    
    private void exitDrugstore() {
        CarControl.createNewScene(TheLastOfUs.getPlayer());
    carView carChoice = new carView();
    carChoice.chooseCar();
    }

    
}
    

