/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theLastOfUs.View;

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
        System.out.println("\n viewInventory Function called");}

    private void viewCharacter() {
        System.out.println("\n viewCharacter Function called");}

    private void carStatus() {
        System.out.println("\n carStatus Function called");}

    private void gameHelp() {
        System.out.println("\n gameHelp Function called");}
    
}
