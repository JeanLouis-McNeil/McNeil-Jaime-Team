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
    private String promptMessage;
    
  
    
    public MainMenuView(){
           this.menu = "\n"
            + "\n--------------------------------------------------------------"
            + "\n| Main Menu                                                  |"
            + "\n--------------------------------------------------------------"
            + "\nN - Start New Game                                            "
            + "\nG - Get and Start saved game                                  "
            + "\nH - Get help on how to play the game                          "
            + "\nS - Save game                                                 "
            + "\nQ - Quit                                                      "
            ;
    this.promptMessage = "\nPlease choose a menu option.";
    //Display the menu
    this.displayMainMenuView();
    }
    
     
    

    
    public void displayMainMenuView() {
        
        boolean done = false;
        do {
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))
                return;
            done = this.doAction(menuOption);
            }while(!done);
    }

    private String getMenuOption() {
        Scanner keyboard =  new Scanner(System.in);//get infile for keyboard
    String value = ""; //value to be returned
    boolean valid = false; //initialize to not valid
    
    while (!valid) { 
            System.out.println("\n" + this.promptMessage);
    
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

    private boolean doAction(String menuOption) {
          
        menuOption = menuOption.toUpperCase();
    switch (menuOption){
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
        default:
            System.out.println("\n ***Invalid selection *** Try Again!");
            break;
            }  
    return false;
    }

    private void startNewGame() {
    GameControl.createNewGame(TheLastOfUs.getPlayer());
    GameMenuView gameMenu = new GameMenuView();
    gameMenu.displayMenu();
    }

    private void startExistingGame() {
    System.out.println("\n*** startExistingGame function called ***");
    }
    
    private void displayHelpMenu() {
    System.out.println("\n*** displayHelpMenu function called ***");
    }

    private void saveGame() {
    System.out.println("\n*** saveGame function called ***");
    }
    
}
