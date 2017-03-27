/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theLastOfUs.View;
import byui.cit260.theLastOfUs.control.GameControl;
import java.util.Scanner;
import thelastofus.TheLastOfUs;
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
        this.console.println("\nEnter the file path where the game is to be saved");
String filePath = this.getInput();
     try {
        GameControl.getSavedGame(filePath);
     }
     catch (Exception ex){
         ErrorView.display("MainMenuView", ex.getMessage());
     }
    GameMenuView gameMenu = new GameMenuView();
    gameMenu.display();
    }
private void displayHelpMenu() {
        System.out.println("\nYour objective is to help the character find the best cure for"
                + "\nthe deadly virus that has sprung over the country. You have to first regain"
                + "\nhealth and begin your trip.");
    } 
 private void saveGame() {
     this.console.println("\nEnter the file path where the game is to be saved");
String filePath = this.getInput();
     try {
        GameControl.saveGame(TheLastOfUs.getCurrentGame(), filePath);
     }
     catch (Exception ex){
         ErrorView.display("MainMenuView", ex.getMessage());
     }
}
}

