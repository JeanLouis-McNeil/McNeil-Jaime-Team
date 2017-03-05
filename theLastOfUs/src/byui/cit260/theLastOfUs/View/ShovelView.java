/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theLastOfUs.View;

import byui.cit260.theLastOfUs.control.DrugStoreControl;
import java.util.Scanner;
import thelastofus.TheLastOfUs;

/**
 *
 * @author iu
 */
public class ShovelView {
 private String menu;

    void shovels() {
        this.menu = "\nEnter the number of shovel wanted to see the total weight: "
                ;
        this.displayShovel();
    }
            private void displayShovel() {
      boolean well = false;
        do {
            System.out.println(menu);
            int shovelOption = this.getShovelOption();
            well = this.shovelAction(shovelOption);
                }
   while(!well);
        }
   private int getShovelOption() {
        Scanner input= new Scanner(System.in);//get infile for keyboard
    int value1 = 0;
    boolean valid = false; //initialize to not valid
    
    while (!valid) { 
            System.out.println("Enter the quantity here :");
    
    value1= input.nextInt();
            int weight = 10;
    
    if (value1 >= 1 && value1 <= 2) {
                int totWeight = value1 * weight; 
        System.out.println("\nYou chose " + value1+ " shovel(s). The weight of the chosen tools is"
                + totWeight + "lbs");
    }
    else {
        System.out.println("\nYou cannot take more than 2 (2) shovels or less than one.");
        continue;
        }
        break;  
    }
    return value1;}

    private boolean shovelAction(int shovelOption) {
        if(shovelOption >= 1 && shovelOption <= 2){
        this.drugstoreView();
    }
    else {
        System.out.println("\n***Invalid Selection, Try the correct number to go forward***");
    }
    return false;
    }
     private void drugstoreView() {
        DrugStoreControl.createNewScene(TheLastOfUs.getPlayer());
    DrugStoreView drugChoice = new DrugStoreView();
    drugChoice.display();
     }
}
