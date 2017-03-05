/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theLastOfUs.View;

import byui.cit260.theLastOfUs.control.Scene5Control;
import java.util.Scanner;
import thelastofus.TheLastOfUs;

/**
 *
 * @author iu
 */
public class WaterBottleView {


    void waterBottle() {
    this.prompt = "\nENTER THE WEIGHT OF WATER BOTTLES AND BARS NEEDED: ";
        this.displayWaterOption();
    }private String prompt;

    private void displayWaterOption() {
        boolean well = false;
        do {
            System.out.println(prompt);
            int waterOption = this.getWaterOption();
            well = this.waterAction(waterOption);
                }
   
    while(!well);
}

    private int getWaterOption() {
        Scanner input= new Scanner(System.in);//get infile for keyboard
    int value1 = 0;
    boolean valid = false; //initialize to not valid
    
    while (!valid) { 
            System.out.println("Enter the weight in lbs here :");
    
    value1= input.nextInt();
    
    
    if (value1 >= 1 && value1 <= 6) {
        System.out.println("\nYou left the supermarket with " + value1+ " lbs of water-protein bars conbination.");
    }
    else {
        System.out.println("\nYou cannot take more than six (6) lbs or less than one.");
        continue;
        }
        break;  
    }
    return value1;
    }
private boolean waterAction(int waterOption) {
    if(waterOption >= 1 && waterOption <= 6){
        this.toolsRoomView();
    }
    else {
        System.out.println("\n***Invalid Selection, Try the correct weight to go forward***");
    }
    return false;
}
 private void toolsRoomView() {
         Scene5Control.createNewScene(TheLastOfUs.getPlayer());
    toolsRoomView toolChoice = new toolsRoomView();
    toolChoice.display();}
}
