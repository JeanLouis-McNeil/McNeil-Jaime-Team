/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theLastOfUs.View;

import byui.cit260.theLastOfUs.model.CarPartsInventory;
import byui.cit260.theLastOfUs.model.Game;
import byui.cit260.theLastOfUs.model.CarTool;
import thelastofus.TheLastOfUs;

/**
 *
 * @author JASMINE
 */
class GameMenuView extends View{

    public GameMenuView() {
        super("\n                      GAME MENU                            "
                + "\nM - View map "
                + "\nI - View Inventory "
                + "\nC - View list of characters "
                + "\nS - Car status"
                + "\nH - Help"
                + "\nQ - Quit");
    }
    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase();// convert menuOption to upper case.
        
        switch (value) {
            case "M":
                    this.displayMap();
                    break;
            case "I":
                    this.viewInventory();
                    break;
            case "C":
                    this.viewCharacter();
                    break;
            case "S":
                    this.carStatus();
                    break;
             case "H":
                    this.gameHelp();
                    break;
            default :
                System.out.println("\n***Invalid Selection, Try Again!***");
                break;
        }
        return false;
    }

    private void displayMap() {
        System.out.println("\n displayMap Function called");}

    private void viewInventory() {
        StringBuilder line;
        
        Game game = TheLastOfUs.getCurrentGame();
        CarPartsInventory [] partsInventory = game.getPartInventory();
        
        System.out.println("\n        LIST OF CAR PARTS                 ");
        line = new StringBuilder();
        line.insert(0, "DESCRIPTION");
        line.insert(20, "REQUIRED");
        line.insert(30, "IN STOCK");
        System.out.println(line.toString());
        
        for (CarPartsInventory item : partsInventory) {
            line = new StringBuilder();
        line.insert(0, item.getPartType());
        line.insert(23, item.getRequiredAmount());
        line.insert(33, item.getPartQuantity());
        System.out.println(line.toString());
        }
        
    }

    private void viewCharacter() {
        System.out.println("\n viewCharacter Function called");}

    private void carStatus() {
    StringBuilder line;
        
        Game game = TheLastOfUs.getCurrentGame();
        CarTool[] toolInventory = game.getToolInventory();
        
        System.out.println("\n        LIST OF CAR TOOLS                ");
        line = new StringBuilder();
        line.insert(0, "DESCRIPTION");
        line.insert(20, "IN STOCK");
        line.insert(30, "UNIT PRICE");
        System.out.println(line.toString());
        
        for (CarTool tool :toolInventory) {
            line = new StringBuilder();
        line.insert(0, tool.getToolName());
        line.insert(23, tool.getToolQuantity());
        line.insert(33, tool.getUnitPrice());
        System.out.println(line.toString());
        }
    
    }

    private void gameHelp() {
        System.out.println("\n gameHelp Function called");}
    
}
