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
public class MainMenuView {
    private String menu;

    public MainMenuView(){
        this.menu = "\n"
                + "\n----------------------------------------------------------"
                + "\n |Main Menu                                              |"
                + "\n----------------------------------------------------------"
                + "\nN - Start New Game"
                + "\nG - Get and start saved game"
                + "\nH - Get help on how to play the game"
                + "\nS - Save Game"
                + "\nQ - Quit"
                + "\n----------------------------------------------------------"
                ;
        this.displayMainMenuView();
    }
     public void displayMainMenuView() {
        boolean done = false;
        do {
               System.out.println(menu);
               String menuOption = this.getMenuOption();
               if (menuOption.toUpperCase().equals("Q"))
                   return;
               done = this.doAction(menuOption);
        } while(!done);
        }

    public boolean doAction(String menuOption) {
        
        menuOption = menuOption.toUpperCase();// convert menuOption to upper case.
        
        switch (menuOption) {
            case "N":
                    this.startNewGame();
                    break;
            case "G":
                    this.startExistingGame();
                    break;
            case "H":
                    this.displayHelpMenu();
                    break;
            case "S":
                    this.saveGame();
                    break;
            default :
                System.out.println("\n***Invalid Selection, Try Again!***");
                break;
        }
        return false;
    
                    
        
        
            }
    private String getMenuOption() {
        Scanner keyboard =  new Scanner(System.in);//get infile for keyboard
    String value = ""; //value to be returned
    boolean valid = false; //initialize to not valid
    
    while (!valid) { 
            System.out.println("Choose a menu option!");
    
    value = keyboard.nextLine();
    value = value.trim();
    
    if (value.isEmpty()) {
        System.out.println("\n Invalind value : Value cannot be more than one character.");
        continue;
        }
        break;  
    }
    return value;
    }

    private void startNewGame() {
       GameControl.createNewGame(TheLastOfUs.getPlayer());
    FindResourcesView resMenu = new FindResourcesView();
    resMenu.FindResources();
    }

    private void startExistingGame() {
        System.out.println("\nstartExistingGame function called.");}

    private void displayHelpMenu() {
        this.menu = "\n"
                + "\n----------------------------------------------------------"
                + "\n |Help Menu                                              |"
                + "\n----------------------------------------------------------"
                + "\nG - What is the goal of the game"
                + "\nM - How to move?"
                + "\nQ - Quit"
                + "\n----------------------------------------------------------"
                ;
        this.displayHelpMenuView();
    }
     public void displayHelpMenuView() {
        boolean done = false;
        do {
               System.out.println(menu);
               String menuOption = this.getMenuOption();
               if (menuOption.toUpperCase().equals("Q"))
                   return;
               done = this.doAction(menuOption);
        } while(!done);
        
        
    }

    private void saveGame() {
        System.out.println("\nsaveGame function called.");}
    }
    


