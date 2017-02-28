/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theLastOfUs.View;

import byui.cit260.theLastOfUs.control.GameControl;
import byui.cit260.theLastOfUs.control.Scene3Control;
import java.util.Scanner;
import thelastofus.TheLastOfUs;

/**
 *
 * @author iu
 */
public class FindResourcesView {
    private String menu;
    private String prompt;
  
           void FindResources() {
        this.menu =  "\n|THE WAKE UP!                                         |"
                    + "\nYou are now in a hospital after a year-long coma state"
                    + "\nand you are given a letter that tells you about a John"
                    + "\nwhich is living far from where you are now. You are gi"
                    + "\nven some resources to help you gain strenght for your "
                    + "\ntrip. "
                + "\nW - Water                                                 "
                + "\nS - Serum                                                 "
                + "\nB - Protein Bar                                          "
                + "\nG - Leave and find your way out.                          "
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
            case "G":
                    this.goFindYourWay();
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
                + "\nQ - Quit"
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
               done = this.doChoice(menuOption3);
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
            default :
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
    
    

//Serum choices
    private void chooseSerumAmount() {
        this.menu = "\n|Choose from these ways to have serum. Packs or injection|"
                + "\nP - Packs                                                 "
                + "\nI - Injection"
                + "\nQ - Quit"
                ;
    this.displaySerumMenu();
    }
 private void displaySerumMenu() {
     boolean done = false;
        do {
               System.out.println(menu);
               String menuOption4 = this.getMenuOption4();
               if (menuOption4.toUpperCase().equals("Q"))
                   return;
               done = this.doChoices(menuOption4);
        } while(!done);
     
        }
 private boolean doChoices(String menuOption4) {
        menuOption4 = menuOption4.toUpperCase();// convert menuOption to upper case.
        
        switch (menuOption4) {
            case "P":
                    this.calcPackAmnt();
                    break;
            case "I":
                    this.calcInjAmnt();
                    break;
            default :
                System.out.println("\n***Invalid Selection, Try Again!***");
                break;
        }
        return false;
 }
  private String getMenuOption4() {
      Scanner inp =  new Scanner(System.in);//get infile for keyboard
    String value = ""; //value to be returned
    boolean valid = false; //initialize to not valid
    
    while (!valid) { 
            System.out.println("Choose a menu option!");
    
    value = inp.nextLine();
    value = value.trim();
    
    if (value.isEmpty()) {
        System.out.println("\n Invalind value : Value cannot be more than one character.");
        continue;
        }
        break;  
    }
    return value;
        }
 
     private void calcPackAmnt() {
        System.out.println("\n*** calcPackAmnt() function called ***");}

    private void calcInjAmnt() {
        System.out.println("\n*** calcInjAmnt() function called ***");}
    
    
    
 //Bar menu
    private void chooseBarAmount(){
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
        double result = Scene3Control.calcCorrectWeight();
 
    return false;
}

    private void goFindYourWay() {
               GameControl.createNewGame(TheLastOfUs.getPlayer());
    LeaveHospitalView resMenu = new LeaveHospitalView();
    resMenu.findWayOut();}
}
       


    

   

   

    

  

    

 




    
    
    
    
    
   

    

