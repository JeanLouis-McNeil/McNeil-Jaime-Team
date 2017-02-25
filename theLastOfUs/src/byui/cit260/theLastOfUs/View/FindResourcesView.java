/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theLastOfUs.View;

import java.util.Scanner;

/**
 *
 * @author iu
 */
public class FindResourcesView {
    private String menu;
  
           void FindResources() {
        this.menu =  "\n|Resources Menu                                      |"
                    + "\nYou are now in a hospital after a year-long coma state"
                    + "\nand you are given a letter that tells you about a John"
                    + "\nwhich is living far from where you are now. You are gi"
                    + "\nven some resources to help you gain strenght for your "
                    + "\ntrip. "
                + "\nW - Water                                                 "
                + "\nS - Serum                                                 "
                + "\nB - Protein Bar                                           "
                + "\nQ - Quit                                                  "
                ;
        this.displayResMenuView();
}
    public void displayResMenuView() {
        boolean done = false;
        do {
               System.out.println(menu);
               String menuOption2 = this.getMenuOption2();
               if (menuOption2.toUpperCase().equals("Q"))
                   return;
               done = this.doAction(menuOption2);
        } while(!done);
        }

    private boolean doAction(String menuOption2) {
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
            default :
                System.out.println("\n***Invalid Selection, Try Again!***");
                break;
        }
        return false;
    
          }

    private String getMenuOption2() {
        Scanner input =  new Scanner(System.in);//get infile for keyboard
    String value = ""; //value to be returned
    boolean valid = false; //initialize to not valid
    
    while (!valid) { 
            System.out.println("Choose among these ones.");
    
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
    
    //the menu and view that show how to drink water. In jugs or in Gallons?
    private void chooseWaterAmount() {
        this.menu = "\n|Choose from the two ways you can have water. Jugs or gallons|"
                + "\nJ - Jugs                                                  "
                + "\nG - Gallons"
                ;
        this.displayWaterMenu();
    }
    private void displayWaterMenu() {
        boolean done = false;
        do {
               System.out.println(menu);
               String menuOption3 = this.getMenuOption3();
               if (menuOption3.toUpperCase().equals("Q"))
                   return;
               done = this.doAction(menuOption3);
        } while(!done);
        }
    public boolean doChoice(String menuOption3){
    
        menuOption3 = menuOption3.toUpperCase();// convert menuOption to upper case.
        
        switch (menuOption3) {
            case "J":
                    this.calcJugAmnt();
                    break;
            case "G":
                    this.calcGalAmnt();
                    break;
            default:
                System.out.println("\n***Invalid Selection, Try Again!***");
                break;
        }
        return false;
}
    
      private String getMenuOption3() {
          Scanner in =  new Scanner(System.in);//get infile for keyboard
    String value = ""; //value to be returned
    boolean valid = false; //initialize to not valid
    
    while (!valid) { 
            System.out.println("Choose between J and G.");
    
    value = in.nextLine();
    value = value.trim();
    
    if (value.isEmpty()) {
        System.out.println("\n Invalind value : Value cannot be more than one character.");
        continue;
        }
        break;  
    }
    return value;
          
        }
      //Two function that will calculate amount of water needed
      private void calcJugAmnt() {
        System.out.println("\n*** You chose to drink in jugs ***");}

    private void calcGalAmnt() {
        System.out.println("\n*** You chose to drink in gallons ***");}
    
    
    //Other choices of resources.

    private void chooseSerumAmount() {
        System.out.println("\n*** calcSerumAmount() function called ***");}

    private void chooseBarAmount() {
        System.out.println("\n*** calcBarAmount() function called ***");}

    

  

    

 
}



    
    
    
    
    
   

    

