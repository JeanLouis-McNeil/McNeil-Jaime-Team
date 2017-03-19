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
public class MainMenuView extends View {
    

                  

    public MainMenuView() {
                    super("\n----------------------------------------------------------"
                + "\n |Main Menu                                              |"
                + "\n----------------------------------------------------------"
                + "\nN - Start New Game"
                + "\nG - Get and start saved game"
                + "\nH - Get help on how to play the game"
                + "\nS - Save Game"
                + "\nQ - Quit"
                + "\n----------------------------------------------------------")
                ;

    }
         
    
   

    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase();// convert menuOption to upper case.
        
        switch (value) {
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
   
    

    private void startNewGame() {
       GameControl.createNewGame(TheLastOfUs.getPlayer());
    GameMenuView gameMenu = new GameMenuView();
    gameMenu.display();
    }

    private void startExistingGame() {
        System.out.println("\nstartExistingGame function called.");}

    private void displayHelpMenu() {
        System.out.println("\n Function called");
    }
    
 private void saveGame() {
        System.out.println("\nsaveGame function called.");
}




}


