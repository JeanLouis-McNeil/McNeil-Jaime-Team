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
class DrugStoreView {
private String drug;

    void chooseDrug() {
        this.drug = "\n Choose the drugs and medics needed for the trip"
                + "\nEach items are in a 15 lbs pack."
                + "\nF - First Aid tools                               "
                + "\nA - Antibiotics                                   "
                + "\nV - Antivenomous (for snakes bites)               "
                + "\nP - Antiparalysis                                 "
                + "\nQ - Quit                                          "
                ;
        this.displayDrug();
    }

    private void displayDrug() {
        boolean well = false;
        do {
            System.out.println(drug);
            String drugOption = this.getDrugOption();
            if (drugOption.toUpperCase().equals("Q"))
                   return;
            well = this.drugAction(drugOption);
                }
   
    while(!well);
}

    private boolean drugAction(String drugOption) {
      drugOption = drugOption.toUpperCase();// convert menuOption to upper case.
        
        switch (drugOption) {

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
        return false; 
    }

    private String getDrugOption() {
        Scanner input =  new Scanner(System.in);//get infile for keyboard
    String value = ""; //value to be returned
    boolean valid = false; //initialize to not valid
    
    while (!valid) { 
            System.out.println("Enter your choice. ");
    
    value = input.nextLine();
    value = value.trim();
    
    if (value.isEmpty()) {
        System.out.println("\n Invalind value : Value cannot be more than one character.");
        continue;
        }
        break;  
    }
    return value;
    }

    private void exitDrugstore() {
        CarControl.createNewScene(TheLastOfUs.getPlayer());
    carView carChoice = new carView();
    carChoice.chooseCar();
    }
}
    

