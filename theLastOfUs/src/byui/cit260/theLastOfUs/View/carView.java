/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theLastOfUs.View;

import byui.cit260.theLastOfUs.control.DriveControl;
import java.util.Scanner;
import thelastofus.TheLastOfUs;

/**
 *
 * @author iu
 */
class carView {
private String car;
    void chooseCar() {
        this.car = "\nYou've headed to the parking lot where three (3) cars are waiting"
                + "\nfor you. You have the choice among them and you will have to fill them"
                + "\nwith fuel properly in order to go to the next location without issues. "
                + "\nFind your ride and fill your tank."
                + "\nL - Light truck                                             "
                + "\nH - Heavy-duty truck                                        "
                + "\nM - Motorcycle                                              "
                + "\nQ - Quit";
        this.displayCarMenu();
    }

    private void displayCarMenu() {
         boolean done = false;
        do {
               System.out.println(car);
               String carOption = this.getCarOption();
               if (carOption.toUpperCase().equals("Q"))
                   return;
               done = this.carAction(carOption);
        } while(!done);}

    private String getCarOption() {
         Scanner input =  new Scanner(System.in);//get infile for keyboard
    String value = ""; //value to be returned
    boolean valid = false; //initialize to not valid
    
    while (!valid) { 
            System.out.println("Enter your choice. ");
    
    value = input.nextLine();
    value = value.trim();
    
    if (value.isEmpty()) {
        System.out.println("\n Invalind value : Value must be more than one character.");
        continue;
        }
        break;  
    }
    return value;}

    private boolean carAction(String carOption) {
       carOption = carOption.toUpperCase();// convert menuOption to upper case.
        
        switch (carOption) {

            case "L":
                    this.ltPick();
                    break;
            case "H" : 
                this.hdtPick();
                break;
            case "M":
                this.mcPick();
                break;
            default :
                System.out.println("\n***Invalid Selection, Try Again!***");
                break;
        }
        return false; }

    
    //Light Truck
    private void ltPick() {
        this.car = "\nYou chose the light truck and the fuel tank is 40 liters but fill it with 60% capacity. Enter fuel amount: ";
    this.displayLt();
    }
     private void displayLt() {
      boolean well = false;
        do {
            System.out.println(car);
            int ltOption = this.getLtOption();
            well = this.ltAction(ltOption);
                }
   while(!well);   
     }
     private int getLtOption() {
        Scanner input= new Scanner(System.in);//get infile for keyboard
    int value1 = 0;
    boolean valid = false; //initialize to not valid
    
    while (!valid) { 
            System.out.println("Enter the amount of fuel in liter here :");
    
    value1= input.nextInt();
    
    
    if (value1 >= 20 && value1 <= 24) {
        System.out.println("\nYou took " + value1 + " liters of fuel with you. It is enough to go to next location.");
    }
    else {
        System.out.println("\nYou took more than the 60% or you took less than what you really need for best driving.");
        continue;
        }
        break;  
    }
    return value1;
     }
     private boolean ltAction(int ltOption) {
        if(ltOption >= 20 && ltOption <= 24){
        this.drivingView();
    }
    else {
        System.out.println("\n***Invalid Selection, Try the correct amount of fuel to go forward***");
    }
    return false;
     }
     
     
    //Heavy duty truck
    private void hdtPick() {
         this.car = "You chose the heavy duty truck and the fuel tank is 80 liters but fill it with 60% capacity. Enter fuel amount: ";
    this.displayHdt();
    }
    private void displayHdt() {
     boolean well = false;
        do {
            System.out.println(car);
            int hdtOption = this.getHdtOption();
            well = this.hdtAction(hdtOption);
                }
   while(!well);     
    }
     private int getHdtOption() {
        Scanner input= new Scanner(System.in);//get infile for keyboard
    int value2 = 0;
    boolean valid = false; //initialize to not valid
    
    while (!valid) { 
            System.out.println("Enter the amount of fuel in liter here :");
    
    value2= input.nextInt();
    
    
    if (value2 >= 40 && value2 <= 48) {
        System.out.println("\nYou took " + value2 + " liters of fuel with you. It is enough to go to next location.");
    }
    else {
        System.out.println("\nYou took more than the 60% or you took less than what you really need for best driving.");
        continue;
        }
        break;  
    }
    return value2;
     }
    private boolean hdtAction(int hdtOption) {
        if(hdtOption >= 40 && hdtOption <= 48){
        this.drivingView();
    }
    else {
        System.out.println("\n***Invalid Selection, Try the correct fuel amount to go forward***");
    }
    return false;
    }
    
    
    //Motorcycle
    private void mcPick() {
         this.car = "You chose the motorcycle and the fuel tank is 15 liters.You can fill it totally. Enter fuel amount: ";
    this.displayMc();
        }
    private void displayMc() {
        boolean well = false;
        do {
            System.out.println(car);
            int mcOption = this.getMcOption();
            well = this.mcAction(mcOption);
                }
   while(!well);
    }
    private int getMcOption() {
        Scanner input = new Scanner(System.in);//get infile for keyboard
    int value3 = 0;
    boolean valid = false; //initialize to not valid
    
    while (!valid) { 
            System.out.println("Enter the amount of fuel in liter here :");
    
    value3= input.nextInt();
    
    
    if (value3 >= 10 && value3 <= 15) {
        System.out.println("\nYou took " + value3 + " liters of fuel with you. It is enough to go to next location.");
    }
    else {
        System.out.println("\nYou took more than the 60% or you took less than what you really need for best driving.");
        continue;
        }
        break;  
    }
    return value3;
    }
    private boolean mcAction(int mcOption) {
        if(mcOption >= 10 && mcOption <= 15){
        this.drivingView();
    }
    else {
        System.out.println("\n***Invalid Selection, Try the correct fuel amount to go forward***");
    }
    return false;
    }
    
    
//Lead to the next Scene...
    private void drivingView() {
        DriveControl.createNewScene(TheLastOfUs.getPlayer());
    carDriveView drive = new carDriveView();
    drive.driveCar();
    }
    }
