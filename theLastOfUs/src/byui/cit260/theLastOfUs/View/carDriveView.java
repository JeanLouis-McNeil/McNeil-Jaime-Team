/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theLastOfUs.View;

/**
 *
 * @author iu
 */
class carDriveView extends View{

    public carDriveView() {
        super("\nYou are heading to the next location. You have enough fuel gallons."
                + "\nMaintain your speed so that your trip will pass well."
                + "\nYour car is now having issue. The fuel tank is leaking while driving."
                + "\nYou won't be able to be at destination if you decide nothing, obviously."
                + "\nYou can be lucky finding a car like yours among the cars left along the road."
                + "\nWhat are yopu doing?"
                + "\nN - Do nothing and try to reach the next location"
                + "\nS - Search for a similar model of car."
                + "\nQ - Quit");
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        
    switch (value) {
            case "N":
                    this.doNothing();
                    break;
            case "S":
                    this.searchModel();
                    break;
            default :
                System.out.println("\n***Invalid Selection, Try Again!***");
                break;
        }
        return false;
    }

    private void doNothing() {
        System.out.println("\nIf you choose to do nothing, you won't be at destination safely.");
    }

    private void searchModel() {
        System.out.println("\nIt is better to find a car like yours and try to find a fuel tank to fit it in your car.");
    }
    
}
