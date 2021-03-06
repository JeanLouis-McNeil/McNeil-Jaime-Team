/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theLastOfUs.View;

import byui.cit260.theLastOfUs.control.CarControl;
import byui.cit260.theLastOfUs.control.GameControl;
import byui.cit260.theLastOfUs.control.Scene4Control;
import byui.cit260.theLastOfUs.control.Scene5Control;
import byui.cit260.theLastOfUs.control.DrugStoreControl;
import java.util.Scanner;
import thelastofus.TheLastOfUs;

/**
 *
 * @author iu
 */
class MapView {
private String map;

    void watchMap() {
       this.map = "\n  |*********************************************************|"
                + "\n     A    B     C     D     E     F     G     H     I     J  "
                + "\n1 |L1  |     |     |     |     |     |     |     |     |    |"
                + "\n2 |    |  L2 |     |     |     |     |     |     |L7   |    |"
                + "\n3 |    |     |     |     |     |   L6|     |     |     |    |"
                + "\n4 |  L3|     |     |     |     |     |     |     |     |    |"
                + "\n5 |    |     |     |     |     |     |     |     |     |    |"
                + "\n6 |    |     |     |     |     |     |     |     |     |    |"
                + "\n7 |    |   L4|     |     |   L5|     |     |     |     |    |"
                + "\n8 |    |     |     |     |     |     |     |     |     |  L8|"
                + "\n  |*********************************************************|"
                + "\n Each coordinates, like A1, have a length of 60 km and a width of 20 km."
               + "\n So from L1 to L2, there is a distance of 120 km and from L4 to L5, 180 km."
                + "\nQ - Quit Map                                               "
               ;
    
    this.displayMap();
    
    }

    private void displayMap() {
         boolean done = false;
        do {
               System.out.println(map);
               String mapOption = this.getMapOption();
               if (mapOption.toUpperCase().equals("Q"))
                   return;
               done = this.mapAction(mapOption);
        } while(!done);
    
    }

    private String getMapOption() {
        Scanner input =  new Scanner(System.in);//get infile for keyboard
    String value = ""; //value to be returned
    boolean valid = false; //initialize to not valid
    
    while (!valid) { 
            System.out.println("Enter your wanted location. Enter the column and row count like A1 or J8... ");
    
    value = input.nextLine();
    value = value.trim();
    
    if (value.isEmpty() && value.length() < 2) {
        System.out.println("\n Invalind location. Location empty or invalid coordinates.");
        continue;
        }
        break;  
    }
    return value;
    }

    private boolean mapAction(String mapOption) {
        mapOption = mapOption.toUpperCase();// convert menuOption to upper case.
        
        switch (mapOption) {

            case "A1":
                    this.locationOne();
                    break;
            case "B2" : 
                this.locationTwo();
                break;
            case "A4":
                this.locationThree();
                break;
             case "B7":
                    this.locationFour();
                    break;
            case "E7":
                this.locationFive();
                break;
             case "F3":
                    this.locationSix();
                    break;
            case "I2" : 
                this.locationSeven();
                break;
            case "J8":
                this.locationEight();
                break;
            default :
                System.out.println("\n***Invalid Location. Empty zone.Try a correct coordinate!***");
                break;
        }
        return false;
    }

    private void locationOne() {
        GameControl.createNewGame(TheLastOfUs.getPlayer());
    FindResourcesView resMenu = new FindResourcesView();
    resMenu.display();
    }
    private void locationTwo() {
        Scene4Control.createNewScene(TheLastOfUs.getPlayer());
    superMarketView shopping = new superMarketView();
    shopping.display();
    }

    private void locationThree() {
        Scene5Control.createNewScene(TheLastOfUs.getPlayer());
    toolsRoomView toolChoice = new toolsRoomView();
    toolChoice.display();
    }

    private void locationFour() {
        DrugStoreControl.createNewScene(TheLastOfUs.getPlayer());
    DrugStoreView drugChoice = new DrugStoreView();
    drugChoice.display();
    }

    private void locationFive() {
        CarControl.createNewScene(TheLastOfUs.getPlayer());
    carView carChoice = new carView();
    carChoice.chooseCar();
    }

    private void locationSix() {
        System.out.println("function called");}

    private void locationSeven() {
        System.out.println("function called");}

    private void locationEight() {
        System.out.println("function called");}
    
}
