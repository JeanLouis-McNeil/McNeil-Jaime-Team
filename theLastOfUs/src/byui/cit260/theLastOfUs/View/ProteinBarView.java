/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theLastOfUs.View;

import byui.cit260.theLastOfUs.control.GameControl;
import java.util.Scanner;
import thelastofus.TheLastOfUs;

/**
 *
 * @author iu
 */
public class ProteinBarView {
    private String prompt;
       void chooseBar() {
    this.prompt = "\nENTER THE AMOUNT OF BAR NEEDED: ";
        this.displayBarOption();

 
           }

    private void displayBarOption() {
        boolean well = false;
        do {
            System.out.println(prompt);
            int barOption = this.getBarOption();
            well = this.doAction(barOption);
                }
   
    while(!well);
}

    private int getBarOption() {
        Scanner input= new Scanner(System.in);//get infile for keyboard
    int value1 = 0;
    boolean valid = false; //initialize to not valid
    
    while (!valid) { 
            System.out.println("Enter the number here :");
    
    value1= input.nextInt();
    
    
    if (value1 >= 1 && value1 <= 4) {
        System.out.println("\nYou are allowed to use " + value1+ " bars.");
    }
    else {
        System.out.println("\nYou cannot take more than four bars or less than one.");
        continue;
        }
        break;  
    }
    return value1;
    }

    private boolean doAction(int barOption) {
        if(barOption >= 1 && barOption <= 4){
        this.exitView();
    }
    else {
        System.out.println("\n***Invalid Selection, Try the correct number to go forward***");
    }
    return false;  }    
    
    private void exitView() {
        GameControl.createNewGame(TheLastOfUs.getPlayer());
    LeaveHospitalView resMenu = new LeaveHospitalView();
    resMenu.findWayOut();
    }



    
}
