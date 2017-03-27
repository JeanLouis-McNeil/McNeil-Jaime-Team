/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theLastOfUs.View;
 import byui.cit260.theLastOfUs.control.GameControl;
import byui.cit260.theLastOfUs.model.Player;
import java.util.Scanner;
public class StartProgramView extends View{
public StartProgramView() {
super("\n**************************************************************"
                        + "\n                                                            "
                        + "\nThis is the game of The Last of Us.                         "
                        + "\nIn this game, you will help Ezechias to reach the leader of "
                        + "\n the new Resistance for the Earth. Your path will "
                        + "\n be set upon your health level and the resources  "
                        + "\n and the tools it requires to cross hundred miles."
                        + "\n First you will have to level up your health. Se- "
                        + "\n cond, you will choose your way of exit and then, "
                        + "\n go search for resources to travel and save many  "
                        + "\n others from the deadly virus spread in the air   "
                        + "\n years ago.                                       "
                        + "\nGood Luck, Dear."
        + "Please enter your name: ") ;
}
@Override
    public boolean doAction(String playersName) {
        
        if (playersName.isEmpty()){
            System.out.println("\nInvalid player name: "
                                + "The name must be greater than one character in lenght.");
        return false;
                        }
    Player player = GameControl.createPlayer(playersName);
    
    if (player == null) {
        System.out.println("\nError creating the player");
        return false;
    }
    this.displayNextView(player);
    return true;
    
    }

    private void displayNextView(Player player) {
        System.out.println("\n================================================"
                         + "\nWelcome to the game " + player.getName()
                         + "\nWe hope you have a lot of fun!"
                         + "\n================================================")
                ;
        //create mainmenuview object
        MainMenuView mainMenuView = new MainMenuView();
                
        //Display the mainmenuview
        mainMenuView.display();}
}
