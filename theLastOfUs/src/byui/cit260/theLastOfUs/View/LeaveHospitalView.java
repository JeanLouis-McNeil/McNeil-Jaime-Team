/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theLastOfUs.View;

import byui.cit260.theLastOfUs.control.ClimbWindowControl;
import byui.cit260.theLastOfUs.control.ForceDoorControl;
import byui.cit260.theLastOfUs.control.MapControl;
import byui.cit260.theLastOfUs.control.Scene4Control;
import java.util.Scanner;
import thelastofus.TheLastOfUs;

/**
 *
 * @author iu
 */
class LeaveHospitalView {
    private String menu;
    
    void findWayOut() {
        this.menu = "\n|                 LEAVE THE HOSPITAL                   |"
                + "\nYou received a letter stating that the world had been infected"
                + "\nby a virus. Many peolpe died and the remaining is hoping a "
                + "\ngreat future through the help of a man named John. Your goal"
                + "\nas told in the game banner is to find him. You are now in good"
                + "\nshape and healthy. Leave the hospital room by choosing your"
                + "\nway through the door or the window. Choose:  "
                + "\nF - Force the door                                         "
                + "\nW - Climb through the window                               "
                + "\nQ - Quit ";
        this.displayExitWay();
    }

    private void displayExitWay() {
        boolean done = false;
        do {
               System.out.println(menu);
               String exitOption = this.getExitOption();
               if (exitOption.toUpperCase().equals("Q"))
                   return;
               done = this.doAction(exitOption);
        } while(!done);}

    private String getExitOption() {
         Scanner answer =  new Scanner(System.in);//get infile for keyboard
    String exit = ""; //value to be returned
    boolean valid = false; //initialize to not valid
    
    while (!valid) { 
            System.out.println("Choose among these ones.");
    
    exit = answer.nextLine();
    exit = exit.trim();
    
    if (exit.isEmpty()) {
        System.out.println("\n Invalind value : Value cannot be more than one character.");
        continue;
        }
        break;  
    }
    return exit;}

    private boolean doAction(String exitOption) {
        exitOption = exitOption.toUpperCase();// convert menuOption to upper case.
        
        switch (exitOption) {
            case "F":
                    this.forceDoor();
                    break;
            case "W":
                    this.climbWindow();
                    break;
            default :
                System.out.println("\n***Invalid Selection, Try Again!***");
                break;
        }
        return false;
    }

    private void forceDoor() {
      ForceDoorControl.createNewScene(TheLastOfUs.getPlayer());
      ForceDoorView force = new ForceDoorView();
      force.display();
    }

    private void climbWindow() {
      ClimbWindowControl.createNewScene(TheLastOfUs.getPlayer());
      ClimbWindowView climb = new ClimbWindowView();
      climb.display();
    }

   



}
 

