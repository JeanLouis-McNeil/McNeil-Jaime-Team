/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theLastOfUs.View;

import byui.cit260.theLastOfUs.control.MapControl;
import byui.cit260.theLastOfUs.control.Scene5Control;
import java.util.Scanner;
import thelastofus.TheLastOfUs;

/**
 *
 * @author iu
 */
class superMarketView {
private String item;
    private String prompt;

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

    //bread options
    private void breadPick() {
         this.prompt = "\nENTER THE WEIGHT OF BREAD AND MILK NEEDED: ";
        this.displayBreadOption();
        }

    private void displayBreadOption() {
        boolean well = false;
        do {
            System.out.println(prompt);
            int breadOption = this.getBreadOption();
            well = this.breadAction(breadOption);
                }
   while(!well);
}

    private int getBreadOption() {
        Scanner input= new Scanner(System.in);//get infile for keyboard
    int value1 = 0;
    boolean valid = false; //initialize to not valid
    
    while (!valid) { 
            System.out.println("Enter the weight in lbs here :");
    
    value1= input.nextInt();
    
    
    if (value1 >= 1 && value1 <= 10) {
        System.out.println("\nYou left the supermarket with " + value1+ " lbs of bread-milk conbination.");
    }
    else {
        System.out.println("\nYou cannot take more than ten (10) lbs or less than one.");
        continue;
        }
        break;  
    }
    return value1;
    }
private boolean breadAction(int breadOption) {
    if(breadOption >= 1 && breadOption <= 10){
        this.toolsRoomView();
    }
    else {
        System.out.println("\n***Invalid Selection, Try the correct weight to go forward***");
    }
    return false;
     }

 //Water options

    private void waterBottle() {
         this.prompt = "\nENTER THE WEIGHT OF WATER BOTTLES AND BARS NEEDED: ";
        this.displayWaterOption();
        }

    private void displayWaterOption() {
        boolean well = false;
        do {
            System.out.println(prompt);
            int waterOption = this.getWaterOption();
            well = this.waterAction(waterOption);
                }
   
    while(!well);
}

    private int getWaterOption() {
        Scanner input= new Scanner(System.in);//get infile for keyboard
    int value1 = 0;
    boolean valid = false; //initialize to not valid
    
    while (!valid) { 
            System.out.println("Enter the weight in lbs here :");
    
    value1= input.nextInt();
    
    
    if (value1 >= 1 && value1 <= 6) {
        System.out.println("\nYou left the supermarket with " + value1+ " lbs of water-protein bars conbination.");
    }
    else {
        System.out.println("\nYou cannot take more than six (6) lbs or less than one.");
        continue;
        }
        break;  
    }
    return value1;
    }
private boolean waterAction(int waterOption) {
    if(waterOption >= 1 && waterOption <= 6){
        this.toolsRoomView();
    }
    else {
        System.out.println("\n***Invalid Selection, Try the correct weight to go forward***");
    }
    return false;
}
    
//apple options
    private void appleSearch() {
        this.prompt = "\nENTER THE WEIGHT OF APPLE JUICE AND BANANAS NEEDED: ";
        this.displayAppleOption();
        }

    private void displayAppleOption() {
        boolean well = false;
        do {
            System.out.println(prompt);
            int appleOption = this.getAppleOption();
            well = this.appleAction(appleOption);
                }
   
    while(!well);
}

    private int getAppleOption() {
        Scanner input= new Scanner(System.in);//get infile for keyboard
    int value1 = 0;
    boolean valid = false; //initialize to not valid
    
    while (!valid) { 
            System.out.println("Enter the weight in lbs here :");
    
    value1= input.nextInt();
    
    
    if (value1 >= 1 && value1 <= 8) {
        System.out.println("\nYou took " + value1+ " lbs of selected conbination. You left the supermarket with"
                + value1 + "\nof apples and bananas. ");
    }
    else {
        System.out.println("\nYou cannot take more than eight (8) lbs or less than one.");
        continue;
        }
        break;  
    }
    return value1;
    }
private boolean appleAction(int appleOption) {
    if(appleOption >= 1 && appleOption <= 8){
        this.toolsRoomView();
    }
    else {
        System.out.println("\n***Invalid Selection, Try the correct weight to go forward***");
    }
    return false;
}


    
//visit map functions
    private void seeLocations() {
         MapControl.createNewMap(TheLastOfUs.getCharacter1());
    MapView map = new MapView();
    map.watchMap();
    }

    private void toolsRoomView() {
         Scene5Control.createNewScene(TheLastOfUs.getPlayer());
    toolsRoomView toolChoice = new toolsRoomView();
    toolChoice.chooseTool();}

    

    

    
   
}
  
