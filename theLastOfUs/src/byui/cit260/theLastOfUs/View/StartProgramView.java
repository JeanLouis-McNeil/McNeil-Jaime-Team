/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theLastOfUs.View;

import byui.cit260.theLastOfUs.control.GameControl;
import byui.cit260.theLastOfUs.model.Player;
import java.util.Scanner;

/**
 *
 * @author iu
 */
public class StartProgramView {
        
        private String promptMessage;
        
    public StartProgramView() {
        //PromptMessage = " Please enter your name."
        this.promptMessage = "\nPlease enter your name.";
        //Display the banner when view is created.
        this.displayBanner();
    }

    public void displayBanner() {
        System.out.println(
                "\n************************************************************"
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
        );
    }

    public void displayStartProgramView() {
        
        boolean done = false;// set flag to not done.
        do {
            //Prompt for and get player name.
            String playersName = this.getPlayerName();
            if (playersName.toUpperCase().equals("Q"))//User wants to quit
                return;//exit the game.
            //do the requested action and display the view.
            done = this.doAction(playersName);
        } while(!done);
            
        
        }

    private String getPlayerName() {
    Scanner keyboard =  new Scanner(System.in);//get infile for keyboard
    String value = ""; //value to be returned
    boolean valid = false; //initialize to not valid
    
    while (!valid) { 
            System.out.println("\n" + this.promptMessage);
    
    value = keyboard.nextLine();
    value = value.trim();
    
    if (value.length() < 1) {
        System.out.println("\n Invalind value : Value cannot be blank.");
        continue;
        }
        break;  
    }
    return value;
    }

    private boolean doAction(String playersName) {
        
        if (playersName.length() < 2){
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
        //display a welcome message
        System.out.println("\n================================================"
                         + "\nWelcome to the game " + player.getName()
                         + "\nWe hope you have a lot of fun!"
                         + "\n================================================")
                ;
        //create mainmenuview object
        MainMenuView mainMenuView = new MainMenuView();
                
        //Display the mainmenuview
        mainMenuView.display();
                
    }
}

           
    
    
    

   