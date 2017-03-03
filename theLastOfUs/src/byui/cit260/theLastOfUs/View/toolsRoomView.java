/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theLastOfUs.View;

import byui.cit260.theLastOfUs.control.Scene6Control;
import java.util.Scanner;
import thelastofus.TheLastOfUs;

/**
 *
 * @author iu
 */
class toolsRoomView {

private String tool;
private String option;
    void chooseTool() {
        this.tool = "\n|THE TOOLS ROOM                                          |"
                + "\nYou left the supermarket with "
                + "\nYou are now in the tools room and your objective is to find"
                + "\nthe right weight of useful tools.                          "
                + "\nThey are listed below and they are written with their unit weight."
                + "\nS - Shovel(10 lbs)                                          "
                + "\nD - Drill(7 lbs)                                           "
                + "\nK - Knifes (1 lb)                                          "
                + "\nG - Gun (8 lbs)                                            "
                + "\nA - Ammunition (15lbs)                                     "
                + "\nQ - Quit"
                ;
        this.displayTools();
        
        }

    private void displayTools() {
         boolean well = false;
        do {
            System.out.println(tool);
            String toolOption = this.getToolOption();
            well = this.toolAction(toolOption);
                }
   
    while(!well);}

    private String getToolOption() {
Scanner input =  new Scanner(System.in);//get infile for keyboard
    String value = ""; //value to be returned
    boolean valid = false; //initialize to not valid
    
    while (!valid) { 
            System.out.println("Enter the letter describing the tools wanted. ");
    
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

    private boolean toolAction(String toolOption) {
        toolOption = toolOption.toUpperCase();// convert menuOption to upper case.
        
        switch (toolOption) {

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
        this.option = "\nEnter the number of shovel wanted to see the total weight: ";
        this.displayShovel();
    }
 private void displayShovel() {
      boolean well = false;
        do {
            System.out.println(option);
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
    return false;}
 
 
    
    
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

    private void drugstoreView() {
        Scene6Control.createNewScene(TheLastOfUs.getPlayer());
    DrugStoreView drugChoice = new DrugStoreView();
    drugChoice.chooseDrug();}

  

   

   
    
}
