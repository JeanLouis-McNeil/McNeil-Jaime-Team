/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theLastOfUs.View;

import byui.cit260.theLastOfUs.control.MapControl;
import java.util.Scanner;
import thelastofus.TheLastOfUs;

/**
 *
 * @author iu
 */
class superMarketView {
private String item;

    void doShopping() {
        this.item = "\n|ST GEORGES SUPERMARKET                                 |"
                + "\nYou are heading to the most equipped supermarket of the town."
                + "\nFind yourself some food and drink and bring them with you for"
                + "\nworst situations. Don't take too much with you... Choose from"
                + "\nthese food-drink conbinations."
                + "\nB - Bread and Milk                                         "
                + "\nW - Water Bottle and Protein bars                          "
                + "\nA - Apple juice and bananas"
                + "\nM - View map                                               "
                + "\nQ - Quit                                                   "
                ;
        this.displayShoppingList();
    }

    private void displayShoppingList() {
         boolean done = false;
        do {
               System.out.println(item);
               String shopOption = this.getShopOption();
               if (shopOption.toUpperCase().equals("Q"))
                   return;
               done = this.shopAction(shopOption);
        } while(!done);}

    private String getShopOption() {
        Scanner input =  new Scanner(System.in);//get infile for keyboard
    String value = ""; //value to be returned
    boolean valid = false; //initialize to not valid
    
    while (!valid) { 
            System.out.println("Enter your choice. ");
    
    value = input.nextLine();
    value = value.trim();
    
    if (value.isEmpty()) {
        System.out.println("\n Invalind value : Value cannot be more than one character.");
        continue;
        }
        break;  
    }
    return value;
    }

    private boolean shopAction(String shopOption) {
        
        shopOption = shopOption.toUpperCase();// convert menuOption to upper case.
        
        switch (shopOption) {

            case "B":
                    this.breadPick();
                    break;
            case "W" : 
                this.waterBottle();
                break;
            case "A":
                this.appleSearch();
                break;
            case "M":
                this.seeLocations();
                break;
            
            default :
                System.out.println("\n***Invalid Selection, Try Again!***");
                break;
        }
        return false;
    }

    private void breadPick() {
        System.out.println("\n****breadPick() function called ****");}

    private void waterBottle() {
        System.out.println("\n****waterBottle() function called ****");}

    private void appleSearch() {
        System.out.println("\n****appleSearch() function called ****");}

    private void seeLocations() {
         MapControl.createNewMap(TheLastOfUs.getCharacter1());
    MapView map = new MapView();
    map.watchMap();
    }

   
}
  
