/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theLastOfUs.View;

import byui.cit260.theLastOfUs.model.CarPartsInventory;
import byui.cit260.theLastOfUs.model.Game;
import byui.cit260.theLastOfUs.model.CarTool;
import byui.cit260.theLastOfUs.model.Location;
import byui.cit260.theLastOfUs.model.Map;
import byui.cit260.theLastOfUs.model.Scene;
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
        StringBuilder lines;

        Game game = TheLastOfUs.getCurrentGame();
        Location[][] locations = game.getMap().getLocations();

        System.out.println("\n|            THE CURSED LAND                |");
        lines = new StringBuilder("                                            ");
        lines.insert(1, "1");
        lines.insert(6, "2");
        lines.insert(11, "3");
        lines.insert(16, "4");
        lines.insert(21, "5");
        lines.insert(26, "6");
        lines.insert(31, "7");
        lines.insert(36, "8");
        lines.insert(41, "9");
        lines.insert(46, "10");
        System.out.println(lines.toString());

        for (Location[] row : locations) {
            lines = new StringBuilder("                                        ");
            lines.insert(0, "--------------------------------------------------");
            lines.insert(0, "1");
            lines.insert(0, "2");
            lines.insert(0, "3");
            lines.insert(0, "4");
            lines.insert(0, "5");
            lines.insert(0, "6");
            lines.insert(0, "7");
            lines.insert(0, "8");
            System.out.println(lines.toString());

            for (Location location : row) {
                lines = new StringBuilder("                                             ");
                lines = new StringBuilder("                                        ");
                lines.insert(0, "|");
                lines.insert(5, "|");
                lines.insert(10, "|");
                lines.insert(15, "|");
                lines.insert(20, "|");
                lines.insert(25, "|");
                lines.insert(30, "|");
                lines.insert(35, "|");
                lines.insert(40, "|");
                lines.insert(45, "|");
                System.out.println(lines.toString());

                if (location.isVisited() == true) {
                    System.out.println(location.getScene().getDisplaySymbol());
                } else {
                    System.out.println("??");

                }

            }
        }
    }

    private void viewInventory() {
        StringBuilder line;

        Game game = TheLastOfUs.getCurrentGame();
        CarPartsInventory[] partsInventory = game.getPartInventory();

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
        System.out.println("\n viewCharacter Function called");
    }

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

        for (CarTool tool : toolInventory) {
            line = new StringBuilder();
            line.insert(0, tool.getToolName());
            line.insert(23, tool.getToolQuantity());
            line.insert(33, tool.getUnitPrice());
            System.out.println(line.toString());
        }

    }

    private void gameHelp() {
        System.out.println("\n gameHelp Function called");
    }

}
