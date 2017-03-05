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
public class ApplePickView {
 private String prompt;  

    void applePick(){
 this.prompt = "\nENTER THE WEIGHT OF APPLE JUICE AND BANANAS NEEDED: ";
        this.displayAppleOption();
    }
    private void displayAppleOption() {
        boolean well = false;
        do {
            System.out.println(prompt);
            int appleOption = this.getAppleOption();
            well = this.appleAction(appleOption);
                }
   
    while(!well);
}

    private int getAppleOption() {
        Scanner input= new Scanner(System.in);//get infile for keyboard
    int value1 = 0;
    boolean valid = false; //initialize to not valid
    
    while (!valid) { 
            System.out.println("Enter the weight in lbs here :");
    
    value1= input.nextInt();
    
    
    if (value1 >= 1 && value1 <= 8) {
        System.out.println("\nYou took " + value1+ " lbs of selected conbination. You left the supermarket with"
                + value1 + "\nof apples and bananas. ");
    }
    else {
        System.out.println("\nYou cannot take more than eight (8) lbs or less than one.");
        continue;
        }
        break;  
    }
    return value1;
    }
private boolean appleAction(int appleOption) {
    if(appleOption >= 1 && appleOption <= 8){
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